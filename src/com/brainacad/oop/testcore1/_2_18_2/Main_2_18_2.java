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
