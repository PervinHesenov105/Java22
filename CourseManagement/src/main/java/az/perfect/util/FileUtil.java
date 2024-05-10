/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Perfect
 */
public class FileUtil {
    //Obyekti fayla yazdirmaq (.obj)

    public static void writeObjectToFile(Serializable object, String name) {
        try ( FileOutputStream fout = new FileOutputStream(name);  ObjectOutputStream oos = new ObjectOutputStream(fout);) {
            oos.writeObject(object);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//Object fayli oxumaq

    public static Object readObjectFromFile(String name) {
        Object obj = null;

        try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))) {
            obj = in.readObject();
        } finally {
            return obj;
        }

    }
}
