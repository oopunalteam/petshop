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
public class Reptil  extends Terrestre{
    private boolean tienePatas;

    public Reptil(boolean isMale, String name, int edad, String paisDeOrigen, boolean tienePatas) {
        super(isMale, name, edad, paisDeOrigen);
        this.tienePatas=tienePatas;
    }

    @Override
    public String printInfos() {
        String infos=super.printInfos()+"\n";
        infos+="Soy tambien un reptil y ";
        if(!tienePatas()) {
            infos+="no ";
        }
        infos+="tengo patas. ";
        return infos;
    }
    
    public boolean tienePatas() {
        return tienePatas;
    }

    public void setTienePatas(boolean tienePatas) {
        this.tienePatas = tienePatas;
    }
    
}
