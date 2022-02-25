package com.ht;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Vista vista = new Vista();
        StackFactory<Double> stackFactory = new StackFactory<>();
        Scanner sc = new Scanner(System.in);    // Scanner for user input
        InfixCalculator calculator = InfixCalculator.instance();
        try {
            Vista v = new Vista();  // Init view

            int ot = 0; // Save the user option
            while (ot != 5) {

                File file = new File("datos.txt");  // File to be loaded
                Scanner rd; // Scanner for the file
                rd = new Scanner(file); // Init scanner with file

                ot = v.menu();   // Show the menu
                if (ot == 1) {
                    calculator.setStack(stackFactory.getStack("AL"));
                } else if(ot == 2) {
                    calculator.setStack(stackFactory.getStack("V"));
                } else if (ot == 3) {
                    calculator.setStack(stackFactory.getStack("LS"));
                } else if(ot == 4) {
                    calculator.setStack(stackFactory.getStack("DL"));
                } else if (ot == 5) {
                    System.out.println("Saliendo");
                    continue;
                } else {
                    System.out.println("No es una opcion valida");
                    continue;
                }
                while (rd.hasNextLine()){
                    String line = rd.nextLine();
                    try {
                        double result = calculator.calculate(line);
                        System.out.printf("Result is: %.1f\n", result);
                    } catch (Exception e) {
                        System.out.printf("Error: La operacion: %s no tiene el formato adecuado.\n",line);    // Calculate each line
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error cargando el archivo datos.txt");
        } catch (InputMismatchException e) {
            System.out.println("Error, por favor ingresa un numero.");
        }
    }
}
