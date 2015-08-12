/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap4.cap5;

import cap4.Funcionario;

/**
 *
 * @author klebsonsantana
 */
public class Empresa {

    String nomeEmpresa, cnpj;
    Funcionario[] empregados;

    public void adiciona(Funcionario f) {
        this.empregados[empregados.length] = f;

        // 1- adicionar um objeto funcionario no array com os atributos
        //2- precisa verificar o tamanho do array e se está livre
        //3- 
    }

    void mostraEmpregados() {
        for (int i = 0; i < this.empregados.length; i++) {
            
            System.out.println("Funcionario na posição: " +i);
        }
    }
}
