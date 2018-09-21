package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // This is an example of how to use arrays to store values. You can prompt for user input the same way you would in any other application.
        Object[] firstProduct = new Object[4];
        Object[] secondProduct = new Object[4];

        firstProduct[0]=4.0;
        firstProduct[1]="Apple";
        firstProduct[2]=2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product price");
        secondProduct[0] = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter product name");
        secondProduct[1] = sc.nextLine();

        System.out.println("Enter product quantity");
        secondProduct[2] = sc.nextInt();
        sc.nextLine();


        System.out.println(firstProduct[0].toString() +"\t"+ firstProduct[1].toString() +"\t"+ firstProduct[2].toString()+"\t"+(Double.parseDouble(firstProduct[0].toString())*Double.parseDouble(firstProduct[2].toString())) );
        System.out.println(secondProduct[0].toString() +"\t"+ secondProduct[1].toString() +"\t"+ secondProduct[2].toString()+"\t"+(Double.parseDouble(secondProduct[0].toString())*Double.parseDouble(secondProduct[2].toString())) );
    }
}
