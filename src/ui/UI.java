package ui;

import business.test;
import data.Animal;
import java.util.ArrayList;

import java.util.Scanner;

public class UI {
    private static Scanner reader = new Scanner(System.in);

    public static void printInfos(String infos) {
        System.out.println(infos);
    }

    public static void sayWelcome() {
        System.out.println("Welcolme to the PetShop !");
    }

    public static void pause() {
        System.out.println("\n\nPress Enter to continue...\n\n");
        reader.nextLine();
    }

    public static void printMenu1() {
        System.out.println("Please choose a pet category from the following list :\n");
        System.out.printf("%s%15s%10s%10s\n","0 - ","Ballena",test.getBallenaList().length," animal(es)");
        System.out.printf("%s%15s%10s%10s\n","1 - ","Paloma",test.getPalomaList().length," animal(es)");
        System.out.printf("%s%15s%10s%10s\n","2 - ","Papagayo", test.getPapagayoList().length," animal(es)");
        System.out.printf("%s%15s%10s%10s\n","3 - ","Rana", test.getRanaList().length," animal(es)");
        System.out.printf("%s%15s%10s%10s\n","4 - ","Salmon", test.getSalmonList().length," animal(es)");
        System.out.printf("%s%15s%10s%10s\n","5 - ","Vibora", test.getViboraList().length," animal(es)");
        System.out.printf("%s%15s%10s\n","6 - ","","EXIT THE PETSHOP");
    }

    public static void printMenu2(int length) {
        System.out.println("\n\nPlease, now choose an animal from the selected category :\n");
        for(int i=0; i<length;i++) {
            System.out.printf("%4s%10s\n",i," - Animal "+i);
        }
    }

    public static void sayGoodBy() {
        System.out.println("\n You're leaving the PetShop, See you soon !");
    }

    public static int askInt(int max) {
        int read=max+1;
        while(read<0 || !(read<=max)) {
            System.out.println("Your selection : ");
            read = reader.nextInt();
            if(read<0 || !(read<=max)) {
                System.out.println("ERROR, Please enter a number between 0 and "+max);
            }
        }
        return read;
    }


    public static void printMenuMyt(ArrayList<Animal> animalList) {
        System.out.println("Please select one or more animals in the following list :");
        System.out.println("(Format : x or x,y or x, y, z)\n");
        
        for(int i=0; i<animalList.size();i++) {
            System.out.println(i+" - "+animalList.get(i).getName());
        }
        
    }

    public static ArrayList<Integer> askIntMyt(int maxInt) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        while(intList.isEmpty()) {
            System.out.println("Your selection : ");
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
}
