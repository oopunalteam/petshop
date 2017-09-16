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
public class Rana extends DeAguaDulce{
    private String colorDelPiel;
    private int frecuencia;
    private int alturaDelSalto;

    public Rana(boolean isMale, String name, int edad, boolean comeOtrosPescados, boolean puedeSubirLosRios, String colorDelPiel, int frecuencia, int alturaDelSalto){
        super(isMale, name, edad, comeOtrosPescados, puedeSubirLosRios);
        this.colorDelPiel=colorDelPiel;
        this.frecuencia=frecuencia;
        this.alturaDelSalto=alturaDelSalto;
    }

    @Override
    public String toString() {
        String infos=super.toString()+"\n";
        infos+="Soy una rana, ";
        infos+="mi piel es de color "+getColorDelPiel()+", puedo saltar a una altura de "+getAlturaDelSalto()+"cm, y hablo a una frecuencia de "+getFrecuencia()+" Hz. ";
        return infos;
    }


    public String getColorDelPiel() {
        return colorDelPiel;
    }

    public void setColorDelPiel(String colorDelPiel) {
        this.colorDelPiel = colorDelPiel;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getAlturaDelSalto() {
        return alturaDelSalto;
    }

    public void setAlturaDelSalto(int alturaDelSalto) {
        this.alturaDelSalto = alturaDelSalto;
    }
    
    
}
