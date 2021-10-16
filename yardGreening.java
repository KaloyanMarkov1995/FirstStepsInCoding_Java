package com.company;

import java.util.Scanner;

public class yardGreening {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double squaremeters = Double.parseDouble(scan.nextLine());
        double price = squaremeters * 7.61;
        double discount= 0.18*price;
        double finalprice = price - discount;

         System.out.printf("The final price is: %.2f lv.",finalprice);
         System.out.println();
         System.out.printf("The discount is : %.2f lv.",discount);



    }

}
