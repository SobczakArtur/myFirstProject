package com.sobczak.artur;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println("Proszę podać wysokość choinki?");
        Scanner sc = new Scanner(System.in);
        int columnNumber = sc.nextInt();

        for (int i = 0; i < columnNumber; i++){
            for (int j = 0; j <= columnNumber - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k <= columnNumber - (columnNumber - i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("End program !!!!");

    }
}