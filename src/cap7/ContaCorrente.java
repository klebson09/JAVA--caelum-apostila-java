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
public class ContaCorrente extends Conta {

//    public void atualiza(double taxa) {
//        super.saldo += super.saldo * taxa * 2;
//    }

       public void atualiza (double taxa) {
        this.saldo += this.saldo * taxa;
    }
    public void deposita(double valor) {
        super.saldo += valor - 0.10;
    }
}
