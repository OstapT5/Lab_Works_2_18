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
2_18_2

Write a program that counts how many nails can be purchased at $1 and what will surrender 
if they buy one of each kind of the nail (nails cost: $0.1, $0.2, $0.3, etc). 
The program output must be like next example: 4 items bought.

```java
package com.brainacad.oop.testcore1._2_18_2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.NumberFormat;
import java.util.Locale;

public class Main_2_18_2 {

    public static void main(String[] args) {

        BigInteger amount = new BigInteger("1");
        BigDecimal step = new BigDecimal("0.1");
        BigDecimal counter = new BigDecimal(step.toString());
        BigDecimal lastNail = new BigDecimal("0.4");
        BigDecimal surrender = new BigDecimal(amount.toString());

        for(counter = new BigDecimal("0.1");
            counter.compareTo(lastNail) <= 0;
            counter = counter.add(step))
        {
            surrender.subtract(counter);
        }

        NumberFormat curDef = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Money left over: " + curDef.format(surrender));
    }
}

```
