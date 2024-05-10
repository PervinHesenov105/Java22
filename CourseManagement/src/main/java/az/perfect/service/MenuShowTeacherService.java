/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service;

import az.perfect.bean.Teacher;
import az.perfect.config.Base;
import java.util.LinkedList;

/**
 *
 * @author Perfect
 */
public class MenuShowTeacherService implements MenuService{

    @Override
    public void process() {
      LinkedList<Teacher> list = Base.instance().getTeachers();
        for(Teacher s : list){
            System.out.println(s);
        }
    }
    
}
