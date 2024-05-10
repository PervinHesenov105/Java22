/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.menu;

import az.perfect.service.MenuAddStudentService;
import az.perfect.service.MenuAddTeacherService;
import az.perfect.service.MenuExitService;
import az.perfect.service.MenuLoginService;
import az.perfect.service.MenuRegisterService;
import az.perfect.service.MenuService;
import az.perfect.service.MenuShowStudentService;
import az.perfect.service.MenuShowTeacherService;
import az.perfect.service.MenuUnknownService;

/**
 *
 * @author Perfect
 */
public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_STUDENT(3, "Add student", new MenuAddStudentService()),
    ADD_TEACHER(4, "Add teacher", new MenuAddTeacherService()),
    SHOW_TEACHERS(5, "Show all teachers", new MenuShowTeacherService()),
    SHOW_STUDENTS(6, "Show all students", new MenuShowStudentService()),
    EXIT(7, "Exit", new MenuExitService()),
    UNKNOWN(new MenuUnknownService());

    private int num;
    private String text;
    private MenuService service;

    private Menu(int num, String text, MenuService service) {
        this.num = num;
        this.text = text;
        this.service = service;
    }

    private Menu(MenuService service) {
        this.service = service;
    }

    
    
    @Override
    public String toString() {
        return num + "." + text;
    }

    public void enumProcess() {
        service.process();
        MenuUtil.startMenu();
    }

    public static Menu findMenu(int selectedNum) {
        Menu menu[] = Menu.values();
        for (int i = 0; i < menu.length; i++) {
            if(menu[i].num==selectedNum){
                return menu[i];
            }
        }
        return UNKNOWN;
    }
}
