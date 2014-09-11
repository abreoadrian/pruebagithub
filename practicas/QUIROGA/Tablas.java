/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QUIROGA;

/**
 *
 * @author Estudiantes
 */
import java.util.Scanner;

public class Tablas {

    /**
     * @param args the command line arguments
     */
 

    public static void main (String [ ] args){
        Scanner sc =new Scanner(System.in); 
 int n;
 System.out.print("Introduzca un numero entero: ");
        n = sc.nextInt();
        System.out.println("Tabla de " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);
        }
         
}}
    
    
    

