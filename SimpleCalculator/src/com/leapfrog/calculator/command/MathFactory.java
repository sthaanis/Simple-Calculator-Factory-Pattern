/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculator.command;

/**
 *
 * @author User
 */
public class MathFactory {

    public static MathCommand get(String value) {
        if (value.equalsIgnoreCase("1")) {
            return new AddCommand();
        } else if (value.equalsIgnoreCase("2")) {
            return new SubtractCommand();
        } else if (value.equalsIgnoreCase("3")) {
            return new MultiplyCommand();
        } else if (value.equalsIgnoreCase("4")) {
            return new DivisionCommand();
        } else if (value.equalsIgnoreCase("5")) {
            return new PowerCommand();
        }
        return null;
    }
}
