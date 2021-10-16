package com.company;

import java.util.Scanner;

public class fishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length=Integer.parseInt(scan.nextLine());
        int width=Integer.parseInt(scan.nextLine());
        int height=Integer.parseInt(scan.nextLine());
        double percent=Double.parseDouble(scan.nextLine());

        int volumeTank=length*width*height;
        double volumeTankLiters=volumeTank*0.001;
        double realPercent=percent/100.0;
        double liters=volumeTankLiters*(1-realPercent);

        System.out.printf("%.2f",liters);
    }
}
