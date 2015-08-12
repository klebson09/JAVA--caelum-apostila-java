/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap4;

/**
 *pagina 51 - 55 ex 4.12
 * @author klebsonsantana
 */


public class FuncionarioTeste {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        f1.setNomeFuncionario("leo");
        f1.setSalario(100);
        f1.recebeAumento(50);

        Funcionario f2 = f1; //é igual por q aponta para o mesmo objeto... #joinha
        
//        Funcionario f2 = new Funcionario();
//        f2.setNomeFuncionario("leo"); 
//        f2.setSalario(100);
        // mesmo tendo os mesmos valores o resultado é igual
        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

        System.out.println("salario anual: " + f1.getSalario());
        System.out.println("ganho anual: " + f1.calculaGanhoAnual());
    }

}
