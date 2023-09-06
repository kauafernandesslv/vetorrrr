/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplovetor;
import java.util.Scanner;
/**
 *
 * @author kaua.1880
 */
public class exemplovetor2 {
    
    
    
     public static void main(String args[]) {

     Scanner scanner = new Scanner(System.in);
   
     int[] numeros = new int [5];
     
     for (int i = 0; i < 5; i++ ){
      System.out.println("informe o valor para a posição [" + i +"] : ");
     numeros[i] = scanner.nextInt();
     
     
   }
     
     for (int i = 0; i < 5; i++){
      System.out.println("valor na posição [" + i + "] :" + numeros[i]  );
         }
}
}