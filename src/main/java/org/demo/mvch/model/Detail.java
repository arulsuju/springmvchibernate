package org.demo.mvch.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="detail")
public class Detail implements Serializable {


    @Id
    @OneToOne
    @JoinColumn(name="id")
    private Teacher teacher;

    @Column(name="subjects")
    private String subjects;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Detail() {
    }

    public Detail(String subjects) {
        this.subjects = subjects;
    }



    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
}
