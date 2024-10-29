/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylist5;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class arraylist5 {
     public static int contarPares(ArrayList<Integer> numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(4);
        numeros.add(6);
        numeros.add(7);
        numeros.add(10);

        System.out.println("Quantidade de números pares: " + contarPares(numeros));
    }
}
