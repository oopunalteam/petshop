/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedWriter;
import java.io.IOException;

public abstract class Animal {
    private boolean isMale;
    private String name;
    private int edad;


    public Animal(boolean isMale, String name, int edad) {
        this.name=name;
        this.isMale=isMale;
        this.edad=edad;
    }
    
    public void write(BufferedWriter writer) {
    }
    
    public String toString() {
        String infos="";
        infos+="\nHola, mi nombre es "+getName()+", tengo "+getEdad()+" año(s) y soy ";
        if(isMale()) {
            infos+="un hombre. ";
        }
        else {
            infos+="una mujer. ";
        }
        return infos;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
