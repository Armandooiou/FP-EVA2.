/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author aaro1
 */
public class EVA2_3_POTENCIA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    int expo;
    int base;
    Scanner captu = new Scanner(System.in);
    System.out.println("BASE");
    base = captu.nextInt();
    captu.nextInt();
    System.out.println("Exponente:");
    expo = captu.nextInt();
    captu.nextInt();
    int resu = 1;
    for(int i = 1; i <= 3; i++){
        resu = resu * base;
           
   }
  System.out.println("El resultado es =" + resu);
    }
    
}
