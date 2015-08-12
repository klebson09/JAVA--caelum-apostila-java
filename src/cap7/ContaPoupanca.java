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
public class ContaPoupanca extends Conta{
    //public void atualiza(){}
       public  void atualiza (double taxa) {
        this.saldo += this.saldo * taxa;
    }
}
