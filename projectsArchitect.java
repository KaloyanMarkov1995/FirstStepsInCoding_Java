package com.company;

import java.util.Scanner;

public class projectsArchitect {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String architectName = scan.nextLine();
        int projects = Integer.parseInt(scan.nextLine());
        int hours = projects*3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",architectName,hours,projects);

    }
}
