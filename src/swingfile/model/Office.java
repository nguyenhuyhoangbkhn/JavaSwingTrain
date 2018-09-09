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
public class Office implements Serializable,Manager{
    private String id;
    private String name;
    private String code;
    public Office(){
        
    }
    
    public Office(String id,String code,String name){
        this.id = id;
        this.code = code;
        this.name = name;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public  String generID(int id) {
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
            this.getCode(),
            this.getName()
        };
    }
}
