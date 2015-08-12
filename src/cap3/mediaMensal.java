/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3;

/**
 *pagina 20
 * @author klebsonsantana
 */
public class mediaMensal {
    
     public static void main(String[] args) {
        // TODO code application logic here
        int gastosJaneiro = 15000; 
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        
         System.out.println(gastosTrimestre);
         
         int mediaMensal = gastosTrimestre /3;
         System.out.println("Valor da média mensal = " +mediaMensal);
     }
    
}
