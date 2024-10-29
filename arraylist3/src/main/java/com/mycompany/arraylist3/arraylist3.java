/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylist3;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class arraylist3 {
     public static boolean buscarFruta(ArrayList<String> frutas, String fruta) {
        return frutas.contains(fruta);
    }

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Manga");
        frutas.add("Uva");

        String frutaProcurada = "Banana";
        System.out.println("Fruta " + frutaProcurada + " encontrada: " + buscarFruta(frutas, frutaProcurada));
    }
}
