package com.company;

import java.util.Scanner;

public class vacationBookList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numPages=Integer.parseInt(scan.nextLine());
        int pagesPerHour=Integer.parseInt(scan.nextLine());
        int daysToRead=Integer.parseInt(scan.nextLine());

        int fullTime=numPages/pagesPerHour;
        int hours=fullTime/daysToRead;

        System.out.println(hours);

    }
}
