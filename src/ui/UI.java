package ui;

import data.Animal;

import java.util.ArrayList;

public interface UI {
    void printPet(Animal Pet);

    void printFileCreation();

    void sayWelcome();

    void pause();

    void sayGoodBy();

    void printMenuMyt(ArrayList<Animal> animalList);

    ArrayList<Integer> askIntMyt(int maxInt);

    boolean askQuit();
}
