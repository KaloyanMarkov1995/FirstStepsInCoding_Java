package com.company;

import java.util.Scanner;

public class radToDeg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double rad=Double.parseDouble(scan.nextLine());
        double deg=rad * 180 / Math.PI;

        System.out.printf("%.0f",deg);

    }
}
