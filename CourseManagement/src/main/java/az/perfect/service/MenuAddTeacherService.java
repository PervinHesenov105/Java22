/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service;

import az.perfect.bean.Teacher;
import az.perfect.config.Base;
import java.util.Scanner;

/**
 *
 * @author Perfect
 */
public class MenuAddTeacherService implements MenuService{

    @Override
    public void process() {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter surname: ");
        String surname = sc.nextLine();
        
        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);
        
        Base.instance().setTeachers(t);
        
        Base.save();
    }
    
}
