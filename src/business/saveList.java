/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import data.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author usuario
 */
public class saveList{
    private static ArrayList<Animal> animalList = new ArrayList<Animal>();

    public static void setList(ArrayList<Animal> animalList) {
        saveList.animalList=animalList;
    }
    
    public static void save() {
        BufferedWriter writer = null;
        JFileChooser guardarComo = new JFileChooser();
        guardarComo.setApproveButtonText("Guardar");
        guardarComo.showSaveDialog(null);
        File archivo = new File(guardarComo.getSelectedFile()+".txt");
        
        try{
        writer = new BufferedWriter(new FileWriter(archivo));

        for(int i=0; i<animalList.size();i++) {
            animalList.get(i).write(writer);
        }
        
        writer.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file...");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}