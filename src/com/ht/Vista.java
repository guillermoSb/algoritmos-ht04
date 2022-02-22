package com.ht;


/**
 * Vista
 */
public class Vista {
    public void welcome() {
        System.out.println("Bienvenido al generador de listas, disfrute su estadía");
        Thread.sleep(1000);

    }
    public String menu() {
        System.out.println("Elija su opción");
        System.out.println("1. Generar ArrayList Stack");
        System.out.println("2. Generar Vector Stack");
        System.out.println("3. Generar List Stack");
    }
    public void liststack() {
        System.out.println("elija si quiere que sea doble (1 sí y 2 no)");
    }
}