package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="courses")
public class Course {
    private int id;
    private String title;
    private String level;  //HND etc..
    private List<Student> students;

    public Course(){}

    public Course(String title, String level) {
        this.title = title;
        this.level = level;
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

    @OneToMany(mappedBy="course", fetch = FetchType.LAZY)
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}//end






