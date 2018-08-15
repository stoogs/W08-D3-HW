package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="courses")
public class Course {
    private int id;
    private String title;
    private String level;  //HND etc..
    private List<Student> students;
    private List<Lesson> lessons;


    public Course(){}

    public Course(String title, String level) {
        this.title = title;
        this.level = level;
        this.students = new ArrayList<Student>();
        this.lessons = new ArrayList<Lesson>();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Column(name="level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    @Column(name="students")
    @OneToMany(mappedBy="course", fetch = FetchType.LAZY)
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @OneToMany(mappedBy="course", fetch = FetchType.LAZY)
    @Column(name="lessons")
    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public void addLessons(Lesson lesson) {
        this.lessons.add(lesson);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }


}//end






