/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

public abstract class DeAguaDulce extends Acuatico{
    private boolean puedeSubirLosRios;

    public DeAguaDulce(boolean isMale, String name, int edad, boolean comeOtrosPescados, boolean puedeSubirLosRios){
        super(isMale, name, edad, comeOtrosPescados);
        this.puedeSubirLosRios=puedeSubirLosRios;
    }

    @Override
    public String toString() {
        String infos=super.toString()+"\n";
        if(isPuedeSubirLosRios()) {
            infos+="Me gusta tan nadar que puedo subir los rios con mis amigos. ";
        }
        else {
            infos+="Soy muy cansado, entonces prefiero no subir los rios, es demasiado dificil. ";
        }
    return infos;
    }
    
    public boolean isPuedeSubirLosRios() {
        return puedeSubirLosRios;
    }

    public void setPuedeSubirLosRios(boolean puedeSubirLosRios) {
        this.puedeSubirLosRios = puedeSubirLosRios;
    }
    
}
