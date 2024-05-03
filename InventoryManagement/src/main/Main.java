package main;

import bean.Product;
import config.Base;
import java.util.Scanner;
import util.InputUtil;
import util.ProductUtil;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("----------------------------");
            int menu = InputUtil.intAl("Menyudan prosesi secin:"
                    + "\n1.Mehsul elave et"
                    + "\n2.Mehsullari goster"
                    + "\n3.Mehsul axtar"
                    + "\n4.Duzelis et"
                    + "\n5.Sil"
                    + "\n6.Cix");

            if (menu == 1) {
                ProductUtil.insertProduct();
            } else if (menu == 2) {
                ProductUtil.printAllProducts();
            } else if (menu == 3) {
                ProductUtil.findProduct();
            } else if (menu == 4) {
                ProductUtil.editProduct();
            } else if (menu == 5) {
                ProductUtil.deleteProduct();
            } else if (menu == 6) {
                System.exit(0);
            }

        }
    }

}
