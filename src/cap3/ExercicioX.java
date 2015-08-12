/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3;

/**
 *
 * @author klebsonsantana
 */
public class ExercicioX {

    public int ex1() {
        for (int i = 150; i < 301; i++) {
            System.out.println(i);
        }
        return 0;
    }

    public int ex2() {
        int resultado = 0;
        int ultimoValor;
        for (int x = 0; x <= 1000; x++) {
            ultimoValor = resultado;
            resultado += x;
            System.out.printf("%d = %d + %d\n", resultado, ultimoValor, x);
        }
        return 0;
    }

    public int ex3() {
        int numero = 0;
        int soma = 0;

        for (int i = 0; i < 1000; i++) {
            numero++;
            soma = soma + numero;
            System.out.println("N°" + numero + " Soma:" + soma);
        }
        return 0;
    }

    public int ex4() {
        for (int i = 1, fatorial = 1; i <= 10; i++) {
            fatorial = fatorial * (i);  
            System.out.println (i+"! = "+fatorial);  
        }  
        return 0;
    }

    public int ex5() {
       
//        for (int i = 1, fatorial = 1; i <= 40; i++) {
//            fatorial = fatorial * (i);  
//            System.out.println (i+"! = "+fatorial);  
//        }  
        
        for (long i = 1, fatorial = 1; i <= 40; i++) {
            fatorial = fatorial * (i);  
            System.out.println (i+"! = "+fatorial);  
        }  
        return 0;
    }

    public int ex6() {
        int r = 0;
        int n1 = 0;
        int n2 = 1;
         while (n1 + n2 < 180) {
           
        System.out.print(" "+n1);  
        n2 += n1 ;  
        System.out.print(" "+n2);   
        n1 += n2 ;    
    }
        return 0;
    }

    public int ex7() {
        return 0;
    }

    public int ex8() {
        return 0;
    }

    public static void main(String[] args) {
    ExercicioX ex = new ExercicioX();
        System.out.println("Exercicio 1");
    ex.ex1();
        System.out.println("----------------------------");
        System.out.println("Exercicio 2");
    ex.ex2();
    System.out.println("----------------------------");
        System.out.println("Exercicio 3");
    ex.ex3();
    System.out.println("----------------------------");
        System.out.println("Exercicio 4");
    ex.ex4();
    System.out.println("----------------------------");
        System.out.println("Exercicio 5");
    ex.ex5();
    System.out.println("----------------------------");
        System.out.println("Exercicio 6");
    ex.ex6();
    //ex.ex();
    
    }
}
