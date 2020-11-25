package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        iSave timPlayer = new Player("Tim", 10,15);
        System.out.println(timPlayer.toString());
        saveObj(timPlayer);

        iSave wolf = new Monsterek("Wolf", 10,15);
        System.out.println(wolf.toString());
        saveObj(wolf);
    }
        public static List<String> readValues(){
        List<String> values = new ArrayList<String>();


            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            int index = 0;
            System.out.println("Choose\n " +
                    "1 to enter a string\n" +
                    "0 to quit");
            while (!quit){
                System.out.println("Choose an option");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch(choice){
                    case 0:
                        quit = true;
                        break;
                    case 1:
                        System.out.println("Enter a string");
                        String stringInput = scanner.nextLine();
                        values.add(index, stringInput);
                        index++;
                        break;
                }
            }
            return values;
        }
        public static void saveObj(iSave objectToSave){
        for(int i=0; i < objectToSave.save().size(); i++){
            System.out.println("Saving " + objectToSave.save().get(i) + " to storage device");

            }
        }

        public static void loadObj(iSave objToLoad){
        List<String> values = readValues();
        objToLoad.read(values);
        }
}
