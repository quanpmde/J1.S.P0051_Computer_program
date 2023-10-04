/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import controller.Manager;
import model.Calculate;

/**
 *
 * @author dell
 */
public class Main {
    public static void main(String[] args) {
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Calculate.normalCalculator();
                    break;
                case 2:
                    Calculate.BMICalculator();
                    break;
                case 3:
                    return;
            }
        }

    }
}