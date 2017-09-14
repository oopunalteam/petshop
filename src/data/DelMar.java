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
public class DelMar extends Acuatico{
    private int profundidadDondeVive;

    public DelMar(boolean isMale, String name, int edad, boolean comeOtrosPescados, int profundidadDondeVive){
        super(isMale, name, edad, comeOtrosPescados);
        this.profundidadDondeVive=profundidadDondeVive;
    }

    @Override
    public String printInfos() {
        String infos=super.printInfos()+"\n";
        infos+="Vivo en el mar a una profundidad de "+getProfundidadDondeVive()+" metros. ";
        return infos;
    }

    public int getProfundidadDondeVive() {
        return profundidadDondeVive;
    }

    public void setProfundidadDondeVive(int profundidadDondeVive) {
        this.profundidadDondeVive = profundidadDondeVive;
    }
    
}
