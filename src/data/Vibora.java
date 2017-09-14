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
public class Vibora extends Reptil{
    private boolean puedeNadar;
    private boolean esPeligroso;
    private int tamano;

    public Vibora(boolean isMale, String name, int edad, String paisDeOrigen, boolean tienePatas, boolean puedeNadar, boolean esPeligroso, int tamano) {
        super(isMale, name, edad, paisDeOrigen, tienePatas);
        this.puedeNadar=puedeNadar;
        this.esPeligroso=esPeligroso;
        this.tamano=tamano;
    }
    
    @Override
    public String printInfos() {
        String infos=super.printInfos()+"\n";
        infos+="Soy una vibora, ";
        infos+="mido "+getTamano()+"cm. ";
        if(isEsPeligroso()){
            infos+="Tiene que ser cuidado, porque soy muy peligroso. ";
        }
        else {
            infos+="No soy peligroso. ";
        }
        if(isPuedeNadar()){
            infos+="Ademas, puedo nadar. ";
        }
        else {
            infos+="Pero no puedo nadar. ";
        }
        return infos;
    }


    public boolean isPuedeNadar() {
        return puedeNadar;
    }

    public void setPuedeNadar(boolean puedeNadar) {
        this.puedeNadar = puedeNadar;
    }

    public boolean isEsPeligroso() {
        return esPeligroso;
    }

    public void setEsPeligroso(boolean esPeligroso) {
        this.esPeligroso = esPeligroso;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
}
