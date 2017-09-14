/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author usuario09
 */
public class Ballena extends DelMar{
    private int peso;
    private String marDeOrigen;
    private boolean estaVivante;

    public Ballena(boolean isMale, String name, int edad, boolean comeOtrosPescados, int profundidadDondeVive, int peso, String marDeOrigen,boolean estaVivante){
        super(isMale, name, edad, comeOtrosPescados, profundidadDondeVive);
        this.peso=peso;
        this.marDeOrigen=marDeOrigen;
        this.estaVivante=estaVivante;
    }

    @Override
    public String printInfos() {
        String infos=super.printInfos()+"\n";
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