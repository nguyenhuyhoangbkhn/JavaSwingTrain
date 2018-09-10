/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingfile.model;

import java.io.Serializable;
import swingfile.controller.Manager;

/**
 *
 * @author Hoang
 */
public class Device implements Serializable,Manager{
    private int id = 0;
    private String name;
    private String origin;
    private int yearProduct;
    public Device(){
        
    }
    public Device(int id, String name, String origin, int yearProduct){
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.yearProduct = yearProduct;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getYearProduct() {
        return yearProduct;
    }

    public void setYearProduct(int yearProduct) {
        this.yearProduct = yearProduct;
    }
    
    public  String generID() {
        id++;
	if (id <0) return "00000";
	if (id<10) {
            return "0000" + id;
	}
	if (id<100) {
            return "000" + id;
	}
	if (id<1000) {
	return "s00" + id;
	}
	if (id<10000) {
            return "0" + id;
	}
		
	return "" + id;
    }

    @Override
    public Object[] toObjects() {
        return new Object[]{
            this.getId(),
            this.getName(),
            this.getOrigin(),
            this.getYearProduct()
        };
    }
    
    @Override
	public String toString() {
            return this.getId() + "\t" + this.getName() + "\t" + this.getOrigin()
                       + "\t" + this.getYearProduct();
        }
    
}
