/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import bean.Product;
import config.Base;

/**
 *
 * @author Perfect
 */
public class ProductUtil {

    public static Product fillProduct() {
        int barcode = InputUtil.intAl("Barcode daxil edin");
        String name = InputUtil.textAl("Adini daxil edin");
        int quantity = InputUtil.intAl("Sayini daxil edin");
        double price = InputUtil.doubleAl("Qiymetini daxil edin");
        return new Product(barcode, name, quantity, price);
    }

    public static void insertProduct() {

        int say = InputUtil.intAl("Nece mehsul elave etmek isteyirsiniz?");
        Base.products = new Product[say];
        for (int i = 0; i < Base.products.length; i++) {
            System.out.println((i + 1) + ")Mehsul");
            Base.products[i] = ProductUtil.fillProduct();
        }
    }

    public static void printAllProducts() {
        if (Base.products == null) {
            return;
        }
        for (int i = 0; i < Base.products.length; i++) {
            if (Base.products[i] != null) {
                System.out.println((i + 1) + "." + Base.products[i]);
            }
        }
    }

    public static void findProduct() {
        String text = InputUtil.textAl("Hansi parametre gore axtaris edirsiniz?");
        if (text.equalsIgnoreCase("barcode")) {
            int barcode = InputUtil.intAl("Axtardiginiz barcode yazin");
            for (int i = 0; i < Base.products.length; i++) {
                if (Base.products[i].getBarcode() == barcode) {
                    System.out.println(Base.products[i]);
                } else {
                    System.out.println("axtardiginiz mehsul tapilmadi");
                }
            }
        } else if (text.equalsIgnoreCase("name")) {
            String name = InputUtil.textAl("Axtardiginiz adi yazin");
            for (int i = 0; i < Base.products.length; i++) {
                if (Base.products[i].getName().contains(name)) {
                    System.out.println(Base.products[i]);
                }
            }
        } else if (text.equalsIgnoreCase("price")) {
            double price = InputUtil.doubleAl("Axtardiginiz meblegi yazin");
            for (int i = 0; i < Base.products.length; i++) {
                if (Base.products[i].getPrice() == price) {
                    System.out.println(Base.products[i]);
                }
            }
        } else {
            System.out.println("Zehmet olmasa duzgun daxil edin!");
        }

    }

    public static void editProduct() {
        int num = InputUtil.intAl("necenci producta duzelis etmek isteyirsiniz?") - 1;
        Product selected = Base.products[num];
        String param = InputUtil.textAl("Hansi parametri deyismek isteyirsiniz?");
        if (param.equalsIgnoreCase("barcode")) {
            selected.setBarcode(InputUtil.intAl("yeni barcode daxil edin"));
        } else if (param.equalsIgnoreCase("ad")) {
            selected.setName(InputUtil.textAl("yeni adi daxil edin"));
        } else if (param.equalsIgnoreCase("say")) {
            selected.setQuantity(InputUtil.intAl("yeni sayi daxil edin"));
        } else if (param.equalsIgnoreCase("qiymet")) {
            selected.setPrice(InputUtil.doubleAl("yeni qiymeti daxil edin"));
        } else {
            System.out.println("Zehmet olmasa duzgun daxil edin");
        }
    }

    public static void deleteProduct() {
        int num = InputUtil.intAl("necencini silmek isteyirsiniz?") - 1;
        Base.products[num] = null;
    }
}
