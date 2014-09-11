/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multi;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author JOHAN
 */
public class moises {
   public void mult () throws IOException { 
   BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        
        int numero1 = Integer.parseInt(br.readLine());
        int numero2 = Integer.parseInt(br.readLine());
        
        try{ 
         System.out.println("Introduce el primer número:");			
         numero1 = Integer.parseInt(br.readLine());			
         System.out.println("Introduce el segundo número:");
         numero2 = Integer.parseInt(br.readLine());
        } catch (IOException ioe){
        }
        int resultado = numero1*numero2;
        System.out.println("La multiplicación es " + numero1 + " x " + numero2 + " = " + resultado);
    }
	
}
