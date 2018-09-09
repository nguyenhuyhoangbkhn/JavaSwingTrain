/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingfile.validate;

/**
 *
 * @author Hoang
 */
public class Validate {
    public static boolean checkName(String name){
        if (name.length() == 0) return false;
        else return true;
    }
}
