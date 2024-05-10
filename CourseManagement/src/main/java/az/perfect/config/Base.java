/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.config;

import az.perfect.bean.Student;
import az.perfect.bean.Teacher;
import az.perfect.util.FileUtil;
import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author Perfect
 */
public class Base implements Serializable{
    public static Base base;
    private LinkedList<Student> students = new LinkedList<>();
    private LinkedList<Teacher> teachers = new LinkedList<>();
    public static boolean loggedIn;

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
    
    public static void save(){
        FileUtil.writeObjectToFile(base, "app.obj");
    }

    
    public static void initialize(){
       Object obj = FileUtil.readObjectFromFile("app.obj");
       base=(Base)obj;
    }
}
