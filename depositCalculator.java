package com.company;

import java.util.Scanner;

public class depositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double depsum = Double.parseDouble(scan.nextLine());
        int depterm = Integer.parseInt(scan.nextLine());
        double interest=Double.parseDouble(scan.nextLine());

        double sum=depsum+depterm*((depsum*(interest/100))/12);
        System.out.println(sum);


    }
}
