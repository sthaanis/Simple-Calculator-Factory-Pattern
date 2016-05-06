/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculator;

import com.leapfrog.calculator.command.MathCommand;
import com.leapfrog.calculator.command.MathFactory;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Program {

    Scanner sc = new Scanner(System.in);
     double x, y, total;
    

    public void display() {
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Division");
        System.out.println("5.Power");
        System.out.println("Enter your choice[1-5]:");
    }

    public void showConfirmMessage() {
        System.out.println("Continue[y/n]");
        if (sc.next().equalsIgnoreCase("n")) {
            System.exit(0);
        }

    }

    public void userInput() {
       
        System.out.println("Enter First Number");
        x = sc.nextInt();
        System.out.println("Enter Second Number");
        y = sc.nextInt();
    }
    
    public void process(){
        MathCommand math = MathFactory.get(sc.next());
        if (math != null) {
            System.out.println(math.calculate(x, y));
        } else {
            System.out.println("Invalid Command");
        }
    }

    public static void main(String[] args) {
        Program p = new Program();
        while (true) {
            p.userInput();
            p.display();
            p.process();
            p.showConfirmMessage();

        }
    }
}
