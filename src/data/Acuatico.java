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
public class Acuatico extends Animal{
    private boolean comeOtrosPescados;

    public Acuatico(boolean isMale, String name, int edad, boolean comeOtrosPescados){
        super(isMale, name, edad);
        this.comeOtrosPescados=comeOtrosPescados;

    }
    @Override
    public String printInfos() {
        String infos=super.printInfos()+"\n";
        infos+="Soy un animal aquatico. ";
        if(isComeOtrosPescados()) {
            infos+="Algunas veces, como otros pescados. ";
        }
        else {
            infos+="Me gustan tan mis amigos que no puedo comer otros pescados. ";
        }
        return infos;
    }

    public boolean isComeOtrosPescados() {
        return comeOtrosPescados;
    }

    public void setComeOtrosPescados(boolean comeOtrosPescados) {
        this.comeOtrosPescados = comeOtrosPescados;
    }
    
}
