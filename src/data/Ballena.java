/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Serializable;

public class Ballena extends DelMar implements Serializable {
    private int peso;
    private String marDeOrigen;
    private boolean estaVivante;

    public Ballena(boolean isMale, String name, int edad, boolean comeOtrosPescados, int profundidadDondeVive, int peso, String marDeOrigen,boolean estaVivante){
        super(isMale, name, edad, comeOtrosPescados, profundidadDondeVive);
        this.peso=peso;
        this.marDeOrigen=marDeOrigen;
        this.estaVivante=estaVivante;
    }

    public Ballena() {

    }
    
    @Override
    public void write(BufferedWriter writer) {
        try{
        writer.write("Nombre - edad - peso - mardeorigen - ¿esMacho?");
        writer.newLine();
        writer.write(this.getName()
                +","+this.getEdad()
                +","+this.getPeso()
                +","+this.getMarDeOrigen()
                +","+this.isMale());
        writer.newLine();
        }
        catch(IOException e) {
            
        }
    }

    @Override
    public String toString() {
        String infos=super.toString()+"\n";
        infos+="Soy una ballena. ";
        infos+="Peso "+getPeso()+" Kg y vengo de "+getMarDeOrigen()+". ";
        if(isEstaVivante()){
            infos+="Estoy actualmente vivante. ";
        }
        else{
            infos+="Soy muerte :( (Pero puedo hablar, es genial) ";
        }
        return infos;
    }


    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getMarDeOrigen() {
        return marDeOrigen;
    }

    public void setMarDeOrigen(String marDeOrigen) {
        this.marDeOrigen = marDeOrigen;
    }

    public boolean isEstaVivante() {
        return estaVivante;
    }

    public void setEstaVivante(boolean estaVivante) {
        this.estaVivante = estaVivante;
    }
    
}
