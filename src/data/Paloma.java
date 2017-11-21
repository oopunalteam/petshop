/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author usuario09
 */
public class Paloma  extends Pajaro{
    private String ciudadDeOrigen;
    private boolean estaAmaestrado;
    private int numeroDePatas;

    public Paloma(boolean isMale, String name, int edad, String paisDeOrigen, int tamanoDeAlas, String ciudadDeOrigen, boolean estaAmaestrado, int numeroDePatas) {
        super(isMale, name, edad, paisDeOrigen, tamanoDeAlas);
        this.ciudadDeOrigen=ciudadDeOrigen;
        this.estaAmaestrado=estaAmaestrado;
        this.numeroDePatas=numeroDePatas;
    }
    
    @Override
    public void write(BufferedWriter writer) {
        try{
       writer.write("Nombre - edad - PaisDeOrigen - EstaAmaestrado - TamanoDeAlas");
        writer.newLine();
        writer.write(this.getName()
                +","+this.getEdad()
                +","+this.getPaisDeOrigen()
                +","+this.isEstaAmaestrado()
                +","+this.getTamanoDeAlas()+"\n");
        writer.newLine();
        }
        catch(IOException e) {
            
        }
    }

    @Override
    public String toString() {
        String infos=super.toString()+"\n";
        infos+="Soy un paloma. ";
        infos+="Vengo de la ciudad "+getCiudadDeOrigen()+", tengo "+getNumeroDePatas()+" patas y ";
        if(!isEstaAmaestrado()){
            infos+="no ";
        }
        infos+=" estoy amaestrado. ";
        return infos;
    }

    public String getCiudadDeOrigen() {
        return ciudadDeOrigen;
    }

    public void setCiudadDeOrigen(String ciudadDeOrigen) {
        this.ciudadDeOrigen = ciudadDeOrigen;
    }

    public boolean isEstaAmaestrado() {
        return estaAmaestrado;
    }

    public void setEstaAmaestrado(boolean estaAmaestrado) {
        this.estaAmaestrado = estaAmaestrado;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }
    
    
}
