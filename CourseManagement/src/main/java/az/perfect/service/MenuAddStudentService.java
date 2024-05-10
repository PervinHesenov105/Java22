/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service;

import az.perfect.bean.Student;
import az.perfect.config.Base;
import java.util.Scanner;

/**
 *
 * @author Perfect
 */
public class MenuAddStudentService implements MenuService {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter surname: ");
        String surname = sc.nextLine();
        
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        
        Base.instance().setStudents(s);
     
        
    }

}
