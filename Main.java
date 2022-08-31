package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Sveiki atvykę į zoologijos sodo aplikaciją!");
        boolean shouldContinue = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Julian");
        animals.add("Simba");
        animals.add("Balu");
        animals.add("Jerry");

        while (shouldContinue) {
            menu();
            int opt = sc.nextInt();
            sc.nextLine();
            switch (opt) {
                case 0:
                    System.out.println("Ačiū, kad naudojates mūsų programa.");
                    shouldContinue = false;
                    break;
                case 1:
                    System.out.println("spausdinu sarasa");
                    printAnimals(animals);
                    break;
                case 2:
                    System.out.println("pridedu gyvuna");
                    addAnimal(sc, animals);
                    break;
                case 3:
                    System.out.println("gyvūno redagavimas.");
                    editAnimal(sc, animals);
                    break;
                case 4:
                    System.out.println("gyvūno šalinimas.");
                    deleteAnimal(sc, animals);
                    break;
                default:
                    System.out.println("Ar tikrai gerai pasirinkote?");
            }
            System.out.println("--------------------------");
        }


    }

    public static void menu() {
        System.out.println("Norėdami pamatyti gyvūnų sąrašą spauskite 1.");
        System.out.println("Norėdami pridėti gyvūną spauskite 2.");
        System.out.println("Norėdami redaguoti gyvūną spauskite 3.");
        System.out.println("Norėdami ištrinti gyvūną spauskite 4.");
        System.out.println("Norėdami išeiti iš programos parašykite 0.");
    }

    public static void printAnimals(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(i + 1 + ". " + arr.get(i));
        }
    }

    public static void addAnimal(Scanner sc, ArrayList<String> arr) {
        arr.add(sc.nextLine());
    }

    public static void editAnimal(Scanner sc, ArrayList<String> arr) {
        printAnimals(arr);
        System.out.println("pasirinkite gyvūno nr kurį norite redaguoti");
        int nr = sc.nextInt();
        sc.nextLine();
        System.out.println("Jūs redaguojate gyvūną " + arr.get(nr - 1) + ". Suveskite jo naują vardą");
        arr.set(nr - 1, sc.nextLine());
    }

    public static void deleteAnimal(Scanner sc, ArrayList<String> arr) {
        printAnimals(arr);
        System.out.println("pasirinkite gyvūno nr kurį norite pašalinti");
        int nr = sc.nextInt();
        sc.nextLine();
        System.out.println("Jūs sėkmingai pašalinote " + arr.get(nr - 1) + ".");
        arr.remove(nr - 1);
    }


}
