package com.company;

import java.util.Scanner;

public class fruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sumStrawberriesKg=Double.parseDouble(scan.nextLine());
        double bananasKg=Double.parseDouble(scan.nextLine());
        double orangeKg=Double.parseDouble(scan.nextLine());
        double raspberriesKg=Double.parseDouble(scan.nextLine());
        double strawberriesKg=Double.parseDouble(scan.nextLine());

        double sumRaspberriesKg=sumStrawberriesKg/2;
        double sumOrangesKg=sumRaspberriesKg*0.6;
        double sumBananaKg=sumRaspberriesKg*0.2;

        double sumRaspberries=raspberriesKg*sumRaspberriesKg;
        double sumOranges=orangeKg*sumOrangesKg;
        double sumBananas=bananasKg*sumBananaKg;
        double sumStrawberries=strawberriesKg*sumStrawberriesKg;

        double totalSum=sumStrawberries+sumRaspberries+sumOranges+sumBananas;
        System.out.printf("%.2f",totalSum);

    }
}
