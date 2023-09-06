/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplovetor;

/**
 *
 * @author kaua.1880
 */
public class Exemplovetor {

    public static void main(String args[]) {
     int[] numeros = new int[5];
     
     numeros[0] = 12;
     numeros[1] = 50;
     numeros[2] = 78;
     numeros[3] = 140;
     numeros[4] = 6;
     
     int soma = 0;
     for(int i = 0; i < 5; i++){
         //System.out.println("numeros na posição [" + i + "] possui valor " + numeros );
         soma = soma + numeros[i];
     }
    
          System.out.println(soma) ;
         
         
     }
     
    
    }
     
     
    