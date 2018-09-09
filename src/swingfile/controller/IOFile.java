/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingfile.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hoang
 */
public class IOFile {
    public void writeFile(List list, String fileName){
        try (FileOutputStream fos = new FileOutputStream(new File(fileName))){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (Exception e) {
            System.out.println("got an exception.");
        }
    }
    
    public ArrayList readFile(String fileName){
        ArrayList<Manager> list = new ArrayList();
        try (FileInputStream fos = new FileInputStream(new File(fileName))){
            ObjectInputStream oos = new ObjectInputStream(fos);
            list = (ArrayList<Manager>)oos.readObject();
        } catch (Exception e) {
            System.out.println("got an exception.");
        }
        return list;
    }
}
