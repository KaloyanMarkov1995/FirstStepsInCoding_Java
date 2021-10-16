package com.company;

import java.util.Scanner;

public class birthdayParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rent=Integer.parseInt(scan.nextLine());

        double cake=rent*20/100.0;
        double drinks=cake*55/100;
        double animator=rent/3.0;
        double sum=rent+cake+drinks+animator;

        System.out.println(sum);


    }
}
