/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service;

import java.util.Scanner;

/**
 *
 * @author Perfect
 */
public class MenuLoginService implements MenuService {

    @Override
    public void process() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        
        if((!username.equals("admin")&& password.equals("123"))){
            throw new IllegalArgumentException("password or username invalid");
        }

    }

}
