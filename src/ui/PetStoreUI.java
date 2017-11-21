package ui;

import data.Animal;
import java.util.ArrayList;
import java.util.Scanner;

public class PetStoreUI implements UI {
    private static Scanner reader = new Scanner(System.in);

    public void printPet(Animal Pet) {
        System.out.println(Pet);
    }

    public void printFileCreation() {
        System.out.println("File DataBase doesn't exist, the file will be created automatically.");
    }

    public void sayWelcome() {
        System.out.println("Welcolme to the PetShop !");
    }

    public void pause() {
        reader.reset();
        System.out.println("\n\nPress Enter to continue...\n\n");
        reader.nextLine();
    }

    public void sayGoodBy() {
        System.out.println("\n You're leaving the PetShop, See you soon !");
    }


    public void printMenuMyt(ArrayList<Animal> animalList) {
        System.out.println("Please select one or more animals in the following list :");
        System.out.println("(Format : x or x,y or x, y, z)\n");

        for(int i=0; i<animalList.size();i++) {
            System.out.println(i+" - "+animalList.get(i).getName());
            if(i==animalList.size()-1) {
                System.out.println((i+1)+" - Export datas");
            }
        }

    }
    public ArrayList<Integer> askIntMyt(int maxInt) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        while(intList.isEmpty()) {
            System.out.println("Your selection is: ");
            reader.reset();
            String read = reader.nextLine();
            read=read.replace(" ", "");
            String[] readList = read.split(",");
            for(int i=0; i<readList.length;i++) {
                int x = Integer.parseInt(readList[i]);
                if(x<0 || !(x<=maxInt)) {
                    System.out.println("ERROR, Please enter numbers between 0 and "+maxInt+", number "+readList[i]+" ignored.");
                }
                else {
                    intList.add(x);
                }
            }

        }

        return intList;
    }

    public boolean askQuit() {
        boolean flag=true;
        boolean loopFlag=true;
        while(loopFlag) {
            System.out.println("Do you want to Quit the PetStore (Q) or Search for others Pets (S) ?");
            System.out.print("Please type Q or S : ");
            reader.reset();
            String read = reader.nextLine();
            read = read.toUpperCase();
            switch (read.charAt(0)) {
                case 'Q':
                    flag=false;
                    loopFlag=false;
                    break;
                case 'S':
                    flag=true;
                    loopFlag=false;
                    break;
                default:
                    System.out.println("ERROR, you must type Q or S !\n\n\n");
                    break;
            }
        }
        return flag;
    }
}