package com.company;

import java.util.Scanner;

public class petShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numDogs = Integer.parseInt(scan.nextLine());
        int numAnimals = Integer.parseInt(scan.nextLine());

        double costs = numDogs*2.5 + numAnimals*4.0;

        System.out.printf("%.1f lv.", costs);


    }
}
