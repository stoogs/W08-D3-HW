package models;
import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {
    private int id;
    private String name;
    private int age;
    private int enrollmentNo;

    public Student(){ }

    public Student(String name, int age, int enrollmentNo) {
        this.name = name;
        this.age = age;
        this.enrollmentNo = enrollmentNo;
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
    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name="age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Column(name="enrollment_no")
    public int getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(int enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }
}
