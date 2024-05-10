/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.config;

import az.perfect.bean.Student;
import az.perfect.bean.Teacher;
import java.util.LinkedList;

/**
 *
 * @author Perfect
 */
public class Base {
    public static Base base;
    private LinkedList<Student> students = new LinkedList<>();
    private LinkedList<Teacher> teachers = new LinkedList<>();

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        this.students.add(student);
    }

    public LinkedList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teacher) {
        this.teachers.add(teacher);
    }
    
    
    public static Base instance(){
        if(base==null){
            base=new Base();
        }
        return base;
    }

}
