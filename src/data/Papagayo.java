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
public class Papagayo extends Pajaro{
    private boolean puedeHablar;
    private String[] coloresDePlumas;
    private boolean puedeVolar;

    public Papagayo(boolean isMale, String name, int edad, String paisDeOrigen, int tamanoDeAlas, boolean puedeHablar, String[] coloresDePlumas, boolean puedeVolar) {
        super(isMale, name, edad, paisDeOrigen, tamanoDeAlas);
        this.puedeHablar=puedeHablar;
        this.coloresDePlumas=coloresDePlumas;
        this.puedeVolar=puedeVolar;
    }

    @Override
    public String toString() {
        String infos=super.toString()+"\n";
        infos+="Soy un papagayo. ";
        infos+="Las colores de mis plumas son : ";
        for(int i=0; i<coloresDePlumas.length;i++){
            infos+=coloresDePlumas[i];
            if(i!=coloresDePlumas.length-1) {
                infos+=", ";
            }
            else {
                infos+=". ";
            }
        }
        if(puedeHablar()){
            infos+="Puedo hablar y ";
        }
        else{
            infos+="No puedo hablar y ";
        }
        if(!puedeVolar()){
            infos+="no ";
        }
        infos+="puedo volar. ";
        return infos;
    }


    public boolean puedeHablar() {
        return puedeHablar;
    }

    public void setPuedeHablar(boolean puedeHablar) {
        this.puedeHablar = puedeHablar;
    }

    public String[] getColoresDePlumas() {
        return coloresDePlumas;
    }

    public void setColoresDePlumas(String[] coloresDePlumas) {
        this.coloresDePlumas = coloresDePlumas;
    }

    public boolean puedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }
    
    
}
