package com.company;

public class Main {

    public static void main(String[] args) {
        Object[] firstProduct = new Object[4];
        firstProduct[0]=4.0;
        firstProduct[1]="Apple";
        firstProduct[2]=2;

        Object[] secondProduct = new Object[4];
        secondProduct[0]=3.5;
        secondProduct[1]="Banana";
        secondProduct[2]=2;

        System.out.println(firstProduct[0].toString() +"\t"+ firstProduct[1].toString() +"\t"+ firstProduct[2].toString()+"\t"+(Double.parseDouble(firstProduct[0].toString())*Double.parseDouble(firstProduct[2].toString())) );
        System.out.println(secondProduct[0].toString() +"\t"+ secondProduct[1].toString() +"\t"+ secondProduct[2].toString()+"\t"+(Double.parseDouble(secondProduct[0].toString())*Double.parseDouble(secondProduct[2].toString())) );
    }
}
