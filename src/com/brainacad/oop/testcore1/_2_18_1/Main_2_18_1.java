package com.brainacad.oop.testcore1._2_18_1;

import java.util.Scanner;

public class Main_2_18_1 {

    public static void main(String[] args) {

        int N;
        Scanner factorial = new Scanner(System.in);
        System.out.println("\nPlease enter an integer: ");
        N = factorial.nextInt();

        int fact = 1;

        if(N <= 0)

        {
            System.out.println(" Factorial must be positive");
        }

        for(int i = 1; i <= N; i++) {
            fact *= i;

        }

        System.out.println("\n\nThe "+ N +" Factorial is : "+" "+ fact);
    }

}
