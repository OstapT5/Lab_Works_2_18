#Lab Works 2-18

2_18_1

Write program which calculates the factorial of N, where N is set at random 
in the range of 10 to 50 (use BigInteger to get the result). 
1) Create a class Main with a factorial() method, which takes one argument as 
an integer number N and returns it the factorial. 
2) Add in Main class the main() method, which defines a positive integer number, 
passes it to the method factorial() and prints the result. 
3) Execute the program.

```java
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

```

