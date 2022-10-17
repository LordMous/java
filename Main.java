package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        //1,feladat
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        System.out.println((f1 > f2) ? f1 : f2);

        //2.feladat
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        System.out.println(Math.pow(i1,i2));

        //3.feladat
        System.out.println(Math.sqrt(i2));

        //4.feladat
        int i = -120;
        System.out.println(Math.abs(i));

        //5.feladat
        System.out.println(Math.floor(Math.random()*90+1));

        //6.feladat
        System.out.println(Math.floor(Math.random()*6)+5);

        //7.feladat
        System.out.println(Math.ceil(Math.random()*10)+20);



        //8.feladat
        System.out.println(Math.round(Math.random()*21)-11);


        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        System.out.println(Math.abs(i1) > Math.abs(i2) ? i1 : i2);
        */
        for(int i = 1; i < 20; i++){
            System.out.println(Math.round(Math.random()*21)-11);
        }



    }
}