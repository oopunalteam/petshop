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
public abstract class Terrestre extends Animal  implements Serializable {
    private String paisDeOrigen;

    public Terrestre(boolean isMale, String name, int edad, String paisDeOrigen) {
        super(isMale, name, edad);
        this.paisDeOrigen=paisDeOrigen;
    }
    public Terrestre() {

    }
    @Override
    public String toString() {
        String infos=super.toString()+"\n";
        infos+="Soy un animal terrestre y mi pais de origen es "+getPaisDeOrigen()+". ";
        return infos;
    }
    
    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }
    
}
