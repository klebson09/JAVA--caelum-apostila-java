/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

import java.util.List;

/**
 *
 * @author klebsonsantana
 */
public class BubleSort {

    public static int[] ordenar(String listaString) {

        String[] arrayStringDeInteiros = listaString.split(" ");
        int[] arrayInteiros = new int[arrayStringDeInteiros.length];

        for (int i = 0; i < arrayStringDeInteiros.length; i++) {
            Integer inteiro = Integer.valueOf(arrayStringDeInteiros[i]);
            arrayInteiros[i] = inteiro;
        }

        int aux = 0;
        
        System.out.println("Vetor desordenado: ");
        for (int i = 0; i < arrayInteiros.length; i++) {
            System.out.println(" " + arrayInteiros[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < arrayInteiros.length; i++) {
            for (int j = 0; j < arrayInteiros.length -1; j++) {
                if (arrayInteiros[j] > arrayInteiros[j + 1]) {
                    aux = arrayInteiros[j];
                    arrayInteiros[j] = arrayInteiros[j + 1];
                    arrayInteiros[j + 1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado:");
        for (int i = 0; i < arrayInteiros.length; i++) {
            System.out.println(" " + arrayInteiros[i]);
        }

        return arrayInteiros;
    }
    public static void main(String[] args) {
        BubleSort.ordenar("1 32 6 41 5 112 3 2 4 5 6 7 8 99");
        
        
    }

}
