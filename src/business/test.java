package business;

import data.Ballena;
import data.Paloma;
import data.Papagayo;
import data.Rana;
import data.Salmon;
import data.Vibora;
import ui.UI;


public class test {

    private static Ballena[] ballenaList;
    private static Paloma[] palomaList;
    private static Papagayo[] papagayoList;
    private static Rana[] ranaList;
    private static Salmon[] salmonList;

    public static Ballena[] getBallenaList() {
        return ballenaList;
    }

    public static void setBallenaList(Ballena[] ballenaList) {
        test.ballenaList = ballenaList;
    }

    public static Paloma[] getPalomaList() {
        return palomaList;
    }

    public static void setPalomaList(Paloma[] palomaList) {
        test.palomaList = palomaList;
    }

    public static Papagayo[] getPapagayoList() {
        return papagayoList;
    }

    public static void setPapagayoList(Papagayo[] papagayoList) {
        test.papagayoList = papagayoList;
    }

    public static Rana[] getRanaList() {
        return ranaList;
    }

    public static void setRanaList(Rana[] ranaList) {
        test.ranaList = ranaList;
    }

    public static Salmon[] getSalmonList() {
        return salmonList;
    }

    public static void setSalmonList(Salmon[] salmonList) {
        test.salmonList = salmonList;
    }

    public static Vibora[] getViboraList() {
        return viboraList;
    }

    public static void setViboraList(Vibora[] viboraList) {
        test.viboraList = viboraList;
    }

    private static Vibora[] viboraList;


    public static void main(String args[]){
        initAnimals();
        UI.sayWelcome();
        loop();
    }

    private static void loop() {
        boolean flag=true;
        while(flag) {
            UI.printMenu1();
            int choice = UI.askInt(6);
            int length=0;
            switch (choice) {
                case 0:
                    length=test.getBallenaList().length;
                    UI.printMenu2(length);
                    length=UI.askInt(length-1);
                    UI.printInfos(getBallenaList()[length].printInfos());
                    break;
                case 1:
                    length=test.getPalomaList().length;
                    UI.printMenu2(length);
                    length=UI.askInt(length-1);
                    UI.printInfos(getPalomaList()[length].printInfos());
                    break;
                case 2:
                    length=test.getPapagayoList().length;
                    UI.printMenu2(length);
                    length=UI.askInt(length-1);
                    UI.printInfos(getPapagayoList()[length].printInfos());
                    break;
                case 3:
                    length=test.getRanaList().length;
                    UI.printMenu2(length);
                    length=UI.askInt(length-1);
                    UI.printInfos(getRanaList()[length].printInfos());
                    break;
                case 4:
                    length=test.getSalmonList().length;
                    UI.printMenu2(length);
                    length=UI.askInt(length-1);
                    UI.printInfos(getSalmonList()[length].printInfos());
                    break;
                case 5:
                    length=test.getViboraList().length;
                    UI.printMenu2(length);
                    length=UI.askInt(length-1);
                    UI.printInfos(getViboraList()[length].printInfos());
                    break;
                case 6:
                    flag = false;
                    UI.sayGoodBy();
                    break;
            }
        UI.pause();
        }
    }

    private static void initAnimals() {
        Ballena ballena = new Ballena(true,"Mobodic", 150,true,200,15000,"Oceano Atlantico", false);
        Ballena ballena2 = new Ballena(false,"Ballena", 175,true,199,42000,"Oceano Atlantico", true);

        Ballena[] formatBallenaList={ballena,ballena2};
        test.ballenaList=formatBallenaList;

        Paloma paloma = new Paloma(false,"Paloma",15,"Colombia",30,"Bogota",true,2);
        Paloma paloma2 = new Paloma(true,"Piaf",5,"Colombia",29,"Medellin",false,42);

        Paloma[] formatPalomaList={paloma,paloma2};
        test.palomaList=formatPalomaList;

        String[] colores={"Azul","Amarillo","Rojo"};
        Papagayo papagayo = new Papagayo(true,"Papagayo",5,"Francia",50,true,colores,false);
        Papagayo[] formatPapagayoList={papagayo};
        test.papagayoList=formatPapagayoList;

        Rana rana = new Rana(false, "Rana",5,false,false,"Verde",500,50);
        Rana[] formatRanaList={rana};
        test.ranaList=formatRanaList;

        Salmon salmon = new Salmon(true,"Salmon",2,true,true,"Suarez",32265,true);
        Salmon salmon2 = new Salmon(false,"Pescadido",5,false,true,"Negro",35000,false);
        Salmon salmon3 = new Salmon(true,"Salmonnnn",10,true,true,"Suarez",42000,false);

        Salmon[] formatSalmonList={salmon,salmon2,salmon3};
        test.salmonList=formatSalmonList;

        Vibora vibora = new Vibora(false,"Vibora",1,"Colombia",false,true,true,30);
        Vibora[] formatViboraList={vibora};
        test.viboraList=formatViboraList;

        /*System.out.println(test.viboraList[0].printInfos());
        System.out.println(test.ranaList[0].printInfos());
        System.out.println(test.papagayoList[0].printInfos());
        System.out.println(test.palomaList[0].printInfos());
        System.out.println(test.ballenaList[0].printInfos());
        System.out.println(test.salmonList[0].printInfos());*/

        }
    }

