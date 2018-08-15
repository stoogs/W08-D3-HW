package db;

import models.Course;
import models.Lesson;
import models.Student;

public class DBStudent {

    public static void addStudentToLesson(Student student, Lesson lesson){
        student.addToLesson(lesson);
        lesson.addAStudent(student);
        DBHelper.update(student); // REMEMBER THIS WILL CASCADE UPDATE TO PROJECT
    }
}
