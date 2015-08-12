/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author klebsonsantana
 */
public class Paragrafo {

  List<String> textos;

    public Paragrafo() {
        this.textos = new ArrayList<>();
    }
    
    public void adicionar(String texto){
        
        textos.add(texto);
    }
    
    public void imprimir (){
        for (String texto : textos) {
            System.out.print(texto+ " ");
        }
    }
    
    public void maiuscula(String texto){
         textos.add(texto.toUpperCase());
        
    }
    public static void main(String[] args) {
        Paragrafo p = new Paragrafo();
        p.adicionar("Implemente uma classe Paragrafo q");
        p.adicionar("...representa uma lista de String.");
        p.maiuscula("texto qualquer");
        p.imprimir();
    }
            
}

