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
public class EmpresaTeste {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.empregados = new Funcionario[10];
        
        Funcionario f1 = new Funcionario();
        f1.setNomeFuncionario("val");
        f1.setSalario(1000);
        empresa.adiciona(f1);

        Funcionario f2 = new Funcionario();
        f2.setNomeFuncionario("Ana");
        f2.setSalario(5000);
        empresa.adiciona(f2);
        
        empresa.mostraEmpregados();
    }

}
