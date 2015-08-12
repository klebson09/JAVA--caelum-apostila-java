/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap7;

/**
 *
 * @author klebsonsantana
 */
public class ContasTeste {

    public static void main(String[] args) {
//        Conta c = new Conta();
//        ContaCorrente cc = new ContaCorrente();
//        ContaPoupanca cp = new ContaPoupanca();

        Conta c = new ContaCorrente();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);
        System.out.println("Conta: ");
        System.out.println(c.getSaldo());
        System.out.println("Conta corrente: ");
        System.out.println(cc.getSaldo());
        System.out.println("Conta poupança: ");
        System.out.println(cp.getSaldo());

        
    }
}
