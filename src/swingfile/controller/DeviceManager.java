/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingfile.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import swingfile.model.Device;

/**
 *
 * @author Hoang
 */
public class DeviceManager {
    private ArrayList<Device> listDevice = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static int flagId =-1;
    IOFile iof;
    
    public List<Device> listDevice() {
	return listDevice;
    }
    public void setListAirport(ArrayList<Device> listDevice) {
	this.listDevice = listDevice;
    }
    
    public void readFile(){
        this.listDevice = iof.readFile("TB.DAT");
        displayDevice();
    }
    
    public void displayDevice(){
        listDevice.forEach((device) -> {
            System.out.println(device.toString());
        });
    }
    
    public void writeFile(){
        IOFile iof = null;
        iof.writeFile(listDevice, "TB.DAT");
    }
    
    public void createDevice() {
        int id = flagId++;
        String name;
        int chooseOrigin;
        String origin = null;
        int yearProduct;
        
        while (true) {
            System.out.println("Nhập tên thiết bị: ");
            try {
		name = sc.nextLine();
		break;
            } catch (Exception e) {
		System.err.println("Error");
            }
	}
        
        while (true) {
            System.out.println("Nhập nơi sản xuất:1: Quốc nội, 2: Nhập khẩu,3: Liên doanh ");
            try {
		chooseOrigin = Integer.parseInt(sc.nextLine());
                if (chooseOrigin != 1 &&chooseOrigin != 2 
                        && chooseOrigin != 3) continue;
                switch(chooseOrigin){
                    case 1: 
                        origin = "Quốc nội";
                        break;
                    case 2:
                        origin = "Nhập khẩu";
                        break;
                    case 3:
                        origin = "Liên doanh";
                        break;
                }
                break;
		
            } catch (NumberFormatException e) {
		System.err.println("Error");
            }
	}
        
        while (true) {
            System.out.println("Nhập nơi sản xuất:1: Quốc nội, 2: Nhập khẩu,3: Liên doanh ");
            try {
		chooseOrigin = Integer.parseInt(sc.nextLine());
                if (chooseOrigin <2000 || 2019<chooseOrigin) {
                    System.out.println("Nhập năm từ 2000 đến 2018!)");
                } else {
                    yearProduct = chooseOrigin;
                    break;
                }
		
            } catch (NumberFormatException e) {
		System.err.println("Error");
            }
	}
        
        Device device = new Device(id, name, origin, yearProduct);
        listDevice.add(device);
        
        writeFile();
    }
    
    
}
