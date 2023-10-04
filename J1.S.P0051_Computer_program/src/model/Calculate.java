/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import view.Validation;

/**
 *
 * @author Admin
 */
public class Calculate {
    public static void normalCalculator() {
        double memory;
        System.out.print("Enter number: ");
        memory = Validation.checkInputDouble();
        while (true) {
            System.out.print("Enter operator: ");
            String operator = Validation.checkInputOperator();
            if (operator.equalsIgnoreCase("+")) {
                memory += Validation.inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("-")) {
                memory -= Validation.inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("*")) {
                memory *= Validation.inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("/")) {
                memory /= Validation.inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("^")) {
                memory = Math.pow(memory, Validation.inputNumber());
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("=")) {
                System.out.println("Result: " + memory);
                return;
            }
        }

    }

    public static String BMIStatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard.";
        } else if (bmi >= 19 && bmi < 25) {
            return "Standard.";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight.";
        } else if (bmi >= 30 && bmi < 40) {
            return "Fat-should lose weight";
        } else {
            return "Very fat - should lose weight immediately";
        }
    }

    public static void BMICalculator() {
        System.out.print("Enter Weight(kg): ");
        double weight = Validation.checkInputDouble();
        System.out.print("Enter Height(cm): ");
        double height = Validation.checkInputDouble();
        double bmi = weight * 10000 / (height * height);
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + BMIStatus(bmi));
    }
}
