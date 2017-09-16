/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

public abstract class Pajaro extends Terrestre {
    private int tamanoDeAlas;

    public Pajaro(boolean isMale, String name, int edad, String paisDeOrigen, int tamanoDeAlas) {
        super(isMale, name, edad, paisDeOrigen);
        this.tamanoDeAlas=tamanoDeAlas;
    }

    @Override
    public String toString() {
        String infos=super.toString()+"\n";
        infos+="Soy un parajo y mis alas miden "+getTamanoDeAlas()+"centimetros de longitud. ";
        return infos;
    }
    
    public int getTamanoDeAlas() {
        return tamanoDeAlas;
    }

    public void setTamanoDeAlas(int tamanoDeAlas) {
        this.tamanoDeAlas = tamanoDeAlas;
    }
    
}
