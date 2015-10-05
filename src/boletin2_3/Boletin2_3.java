/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author Nuria
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float euros, cambio, total;
        System.out.println("Introduce cantidad de Euros a cambiar");
        Scanner cantidadEuros = new Scanner(System.in);
        euros = cantidadEuros.nextFloat();
        System.out.println("Introduce el valor actual de los dolares en euros");
        Scanner cambioDolares = new Scanner(System.in);
        cambio = cambioDolares.nextFloat();
        total = euros*cambio;
        System.out.println(total);
        
       
    }
    
}
