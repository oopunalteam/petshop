/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;

/**
 *
 * @author usuario09
 */
public abstract class Reptil  extends Terrestre implements Serializable {
    private boolean tienePatas;

    public Reptil(boolean isMale, String name, int edad, String paisDeOrigen, boolean tienePatas) {
        super(isMale, name, edad, paisDeOrigen);
        this.tienePatas=tienePatas;
    }
    public Reptil() {

    }
    @Override
    public String toString() {
        String infos=super.toString()+"\n";
        infos+="Soy tambien un reptil y ";
        if(!tienePatas()) {
            infos+="no ";
        }
        infos+="tengo patas. ";
        return infos;
    }
    
    public boolean tienePatas() {
        return tienePatas;
    }

    public void setTienePatas(boolean tienePatas) {
        this.tienePatas = tienePatas;
    }
    
}
