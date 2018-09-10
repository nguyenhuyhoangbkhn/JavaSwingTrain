/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Scanner;
import swingfile.controller.DeviceManager;

/**
 *
 * @author Hoang
 */
public class Test {
    private static Scanner scannerTest = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        DeviceManager deviceMn = new DeviceManager();
	while (true) {
            int choose = menu();
            switch (choose) {
            case 1:
                deviceMn.readFile();
                break;
            case 2:
                menu2();
                break;
            case 3:
                
                break;
            default:
                break;
            }
        }
    }
    private static int menu() {
	while(true) {
            System.out.println("==========MENU==========");
	    System.out.println("1. Quản lý thiết bị");
            System.out.println("2: Quản lý phòng ban");
            System.out.println("3: Tổ chức phòng ban thiết bị");
            System.out.println("4: Thoát");
            System.out.print("Chọn:");
            int text = Integer.parseInt(scannerTest.nextLine());
            if (text <1 || text > 4) System.out.print("Error");
            else return text;
        }
    }
    
    private static int menu2() {
	while(true) {
            System.out.println("==========MENU==========");
	    System.out.println("1. Thêm");
            System.out.println("2: Sửa");
            System.out.println("3: Xóa");
            System.out.println("4: Thoát");
            System.out.print("Chọn:");
            int text = Integer.parseInt(scannerTest.nextLine());
            if (text <1 || text > 4) System.out.print("Error");
            else return text;
        }
    }
}
