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
    public String printInfos() {
        String infos=super.printInfos()+"\n";
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
