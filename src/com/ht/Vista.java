package com.ht;
import java.util.Scanner;

/**
 * Vista
 */
public class Vista {

    Scanner sc = new Scanner(System.in);

    /**
     * Show a welcome message to the user
     */
    public void welcome() {
        System.out.println("Bienvenido al generador de listas, disfrute su estadía");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /**
     * Show the menu to the user
     * @return
     */
    public String menu() {
        System.out.println("Elija su opción");
        System.out.println("1. Generar ArrayList Stack (Escriba AL) ");
        System.out.println("2. Generar Vector Stack (Escriba V) ");
        System.out.println("3. Generar Simple linked list stack (Escriba LS) ");
        System.out.println("4. Generar Doble linked list stack (Escriba DL) ");
        System.out.println("5. Salir (S)");
        String sl;
        sl = sc.nextLine();
        return sl;
    }


}