/*
Imprimir os números de 1 a 10
 */

package com.mycompany.exercicio1while;

import java.util.Scanner;

public class Exercicio1While {

    public static void main(String[] args) {
     
       Scanner teclado = new Scanner(System.in);
       int x = teclado.nextInt();
       
       while(x > 0 && x <= 10){
           x = teclado.nextInt();
       }
        teclado.close();
        System.out.println("Fim");
    }
}
