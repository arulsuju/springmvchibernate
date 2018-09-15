package org.demo.mvch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {

    @RequestMapping("/")
    public String showForm(Model model)
    {

        Student student=new Student();
        model.addAttribute("student",student);
        return "index";
    }
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student)
    {
        SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        try
        {
            System.out.println("starting the assigning");
            student=new Student(student.getFirstName(),student.getLastName(),student.getAddress());
            System.out.println("Beginning the transactions");
            session.beginTransaction();
            System.out.println("Saving");
            session.save(student);
            System.out.println("Completed");
            session.getTransaction().commit();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return "result";
    }
}
