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
public class Salmon extends DeAguaDulce{
    private String rioDeOrigen;
    private int numeroDeEspamas;
    private boolean listoParaComer;

    public Salmon(boolean isMale, String name, int edad, boolean comeOtrosPescados, boolean puedeSubirLosRios, String rioDeOrigen, int numeroDeEspamas, boolean listoParaComer){
        super(isMale, name, edad, comeOtrosPescados, puedeSubirLosRios);
        this.rioDeOrigen=rioDeOrigen;
        this.numeroDeEspamas=numeroDeEspamas;
        this.listoParaComer=listoParaComer;
    }
    
        @Override
        public void write(BufferedWriter writer) {
        try{
        writer.write("Nombre - edad - NumeroDeEspamas - RioDeOrigen - ¿isMacho?");
        writer.newLine();
        writer.write(this.getName()
                +","+this.getEdad()                
                +","+this.getNumeroDeEspamas()
                +","+this.getRioDeOrigen()
                +","+this.isMale()+"\n");
        writer.newLine();
        }
        catch(IOException e) {
            
        }
    }

    @Override
    public String toString() {
        String infos=super.toString()+"\n";
        infos+="Soy un salmon, ";
        infos+="vengo del Rio "+getRioDeOrigen()+", tengo "+getNumeroDeEspamas()+" espamas y ";
        if(isListoParaComer()) {
            infos+="soy listo para ser comido. ";
        }
        else {
            infos+="tiene que esperar un poco para comerme. ";
        }
        return infos;
    }


    public boolean isListoParaComer() {
        return listoParaComer;
    }

    public void setListoParaComer(boolean listoParaComer) {
        this.listoParaComer = listoParaComer;
    }

    public String getRioDeOrigen() {
        return rioDeOrigen;
    }

    public void setRioDeOrigen(String rioDeOrigen) {
        this.rioDeOrigen = rioDeOrigen;
    }

    public int getNumeroDeEspamas() {
        return numeroDeEspamas;
    }

    public void setNumeroDeEspamas(int numeroDeEspamas) {
        this.numeroDeEspamas = numeroDeEspamas;
    }

}
