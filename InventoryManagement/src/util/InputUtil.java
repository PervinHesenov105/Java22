/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Perfect
 */
public class InputUtil {

    public static String textAl(String basliq) {
        Scanner sc = new Scanner(System.in);
        System.out.println(basliq + ":");
        String answer = sc.nextLine();
        return answer;
    }

    public static int intAl(String basliq) {
        Scanner sc = new Scanner(System.in);
        System.out.println(basliq + ":");
        int answer = sc.nextInt();
        return answer;
    }

    public static double doubleAl(String basliq) {
        Scanner sc = new Scanner(System.in);
        System.out.println(basliq + ":");
        double answer = sc.nextDouble();
        return answer;
    }
}
