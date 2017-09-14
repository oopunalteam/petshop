package business;

import data.Animal;
import data.Ballena;
import data.Paloma;
import data.Papagayo;
import data.Rana;
import data.Salmon;
import data.Vibora;
import java.util.ArrayList;
import ui.UI;


public class test1 {

    private static ArrayList<Animal> animalList = new ArrayList<Animal>();



    public static void main(String args[]){
        initAnimals();
        UI.sayWelcome();
        loop();
    }

    private static void loop() {
        boolean flag=true;
        while(flag) {
            UI.printMenuMyt(animalList);
            ArrayList<Integer> choices;
            choices = UI.askIntMyt(animalList.size());
            for(int i=0; i<choices.size();i++) {
                Animal animal = animalList.get(i);
                UI.printInfos(animal.printInfos());
            }

        UI.pause();
        }
    }

    private static void initAnimals() {
        Ballena ballena = new Ballena(true,"Mobodic", 150,true,200,15000,"Oceano Atlantico", false);
        Ballena ballena2 = new Ballena(false,"Ballena", 175,true,199,42000,"Oceano Atlantico", true);
        animalList.add(ballena);
        animalList.add(ballena2);

        Paloma paloma = new Paloma(false,"Paloma",15,"Colombia",30,"Bogota",true,2);
        Paloma paloma2 = new Paloma(true,"Piaf",5,"Colombia",29,"Medellin",false,42);
        animalList.add(paloma);
        animalList.add(paloma2);

        String[] colores={"Azul","Amarillo","Rojo"};
        Papagayo papagayo = new Papagayo(true,"Papagayo",5,"Francia",50,true,colores,false);
        animalList.add(papagayo);

        Rana rana = new Rana(false, "Rana",5,false,false,"Verde",500,50);
        animalList.add(rana);

        Salmon salmon = new Salmon(true,"Salmon",2,true,true,"Suarez",32265,true);
        Salmon salmon2 = new Salmon(false,"Pescadido",5,false,true,"Negro",35000,false);
        Salmon salmon3 = new Salmon(true,"Salmonnnn",10,true,true,"Suarez",42000,false);
        animalList.add(salmon);
        animalList.add(salmon2);
        animalList.add(salmon3);

        Vibora vibora = new Vibora(false,"Vibora",1,"Colombia",false,true,true,30);
        animalList.add(vibora);


        }
    }

