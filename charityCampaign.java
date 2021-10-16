package com.company;

import java.util.Scanner;

public class charityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days=Integer.parseInt(scan.nextLine());
        int bakers=Integer.parseInt(scan.nextLine());
        int cakes=Integer.parseInt(scan.nextLine());
        int waffles=Integer.parseInt(scan.nextLine());
        int pancakes=Integer.parseInt(scan.nextLine());

        double sumcakes=cakes*45.0;
        double sumwaffles=waffles*5.80;
        double sumpancakes=pancakes*3.20;

        double sumperday=(sumcakes+sumpancakes+sumwaffles)*bakers;
        double sumfull=sumperday*days;
        double sumfinal=sumfull-sumfull/8;

System.out.printf("%.2f",sumfinal);


    }

}
