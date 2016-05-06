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
public class MultiplyCommand extends MathCommand {

    @Override
    public double calculate(double x, double y) {
       return x*y;
    }
    
}
