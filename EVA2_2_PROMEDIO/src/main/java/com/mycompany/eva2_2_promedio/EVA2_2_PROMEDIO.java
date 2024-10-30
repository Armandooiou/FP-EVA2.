/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author aaro1
 */
public class EVA2_2_PROMEDIO {

    private static int SumaCali;
    private static double sumaCali;

    public static void main(String[] args) {
        System.out.println("Hello World!");
    int califa;
    Scanner captu = new Scanner(System.in);
    for(int i = 1; i <= 10; i++){
        System.out.println("Estudiante # " + i);
        System.out.println("Cual es tu calificacion?");
        califa = captu.nextInt();
        captu.nextLine();
            //acumular las calificaciones
             SumaCali = SumaCali + califa;  
    }
    //CALCULAR EL PROMEDIO 
    //DIVISIONES EN JAVA --> SI DIVIDIMOS ENTEROS 
    double promedio = sumaCali / 10.0;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
