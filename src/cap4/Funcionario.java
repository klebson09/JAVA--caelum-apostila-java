/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap4;

/**
 * pagina 51 - 55 ex 4.12
 *
 * @author klebsonsantana
 */
public class Funcionario {

    private String nomeFuncionario, departamento, dataEntradaBanco, rg;
    private double salario;
   // public Data dataDeEntrada;

    //construtor
    public Funcionario() {
// construtor sem argumentos
        
    }

    public void mostra() {
        System.out.println("Nome: " + this.getNomeFuncionario());
        System.out.println("Data de Entrada no Banco: " + this.getDataEntradaBanco());
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("RG: " + this.getRg());
        System.out.println("Salario: " + this.getSalario());
        // imprimir aqui os outros atributos...
        // também pode imprimir this.calculaGanhoAnual()

//        System.out.println("Dia: " + this.dataDeEntrada.dia);
//        System.out.println("Mês: " + this.dataDeEntrada.mes);
//        System.out.println("Ano: " + this.dataDeEntrada.ano);
    }

    public void recebeAumento(double aumento) {

        salario = salario + aumento;

    }

    public double calculaGanhoAnual() {

        salario = salario * 12;
        return salario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataEntradaBanco() {
        return dataEntradaBanco;
    }

    public void setDataEntradaBanco(String dataEntradaBanco) {
        this.dataEntradaBanco = dataEntradaBanco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
