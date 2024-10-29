/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylist4;

/**
 *
 * @author Admin
 */

import java.util.ArrayList;
import java.util.Collections;

public class arraylist4 {
     public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);
        numeros.add(4);

        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);
    }
}
