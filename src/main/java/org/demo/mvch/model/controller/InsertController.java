package org.demo.mvch.model.controller;

import org.demo.mvch.model.Book;
import org.demo.mvch.model.BookDetail;
import org.demo.mvch.model.Detail;
import org.demo.mvch.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/insert")
public class InsertController {



    @RequestMapping("/data")
    public String insert(Model model){
        SessionFactory sessionFactory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Teacher.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        try {

            Teacher teacher=new Teacher("suju",23);
            Detail detail=new Detail("Java,c,c++");

            teacher.setDetail(detail);
            session.beginTransaction();
            session.save(teacher);
            session.getTransaction().commit();
            model.addAttribute("added", "data inserted");
            session.close();

        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {


        }

        return "data";
    }

}
