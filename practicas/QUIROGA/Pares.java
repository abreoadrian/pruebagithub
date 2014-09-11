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
public class Pares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sumar=0;
     int sum=0;   
        for (int i=1; i<50; i=i+1){
        sumar=2*i;  
        sum=sum+sumar;
        System.out.println(sumar);
        
        }
        
        System.out.println("el resultad es  "+sum);
    }
    
}
