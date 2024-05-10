/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.util;

import az.perfect.config.Base;
import az.perfect.menu.Menu;
import java.util.Scanner;

/**
 *
 * @author Perfect
 */
public class MenuUtil {

    public static void showAllMenu() {
        Menu menu[] = Menu.values();
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] != Menu.UNKNOWN) {
                if(menu[i]==Menu.LOGIN||menu[i]==Menu.REGISTER){
                    if(Base.loggedIn==false){
                        System.out.println(menu[i]);
                    }
                }
                else if(Base.loggedIn==true){
                    System.out.println(menu[i]);
                }
                
            }
        }
    }

    public static void startMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select menu:");
        showAllMenu();
        int num = sc.nextInt();
        Menu m = Menu.findMenu(num);
        m.enumProcess();
    }
}
