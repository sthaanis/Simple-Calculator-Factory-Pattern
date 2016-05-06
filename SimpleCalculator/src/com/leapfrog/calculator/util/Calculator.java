/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculator.util;

/**
 *
 * @author User
 */
public class Calculator {

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double division(double x, double y) {
        return x / y;
    }

    public double power(double x, double y) {
        double total = 1;
        for (int i = 1; i <= y; i++) {
            total = total * x;
        }
        return total;
    }

}
