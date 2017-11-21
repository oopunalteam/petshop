/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


import java.io.Serializable;

public abstract class Acuatico extends Animal implements Serializable {
    private boolean comeOtrosPescados;

    public Acuatico(boolean isMale, String name, int edad, boolean comeOtrosPescados){
        super(isMale, name, edad);
        this.comeOtrosPescados=comeOtrosPescados;

    }

    public Acuatico() {

    }

    @Override
    public String toString() {
        String infos=super.toString()+"\n";
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
