package Lab_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DOCENTE
 */
public class App5 {
  public static void main( String args[] )
{
int temperaturas[] = new int[5];
temperaturas[0] = 15;
temperaturas[1] = 29;
temperaturas[2] = 6;
temperaturas[3] = 23;
temperaturas[4] = 3;
int media, total=0;
//imprimimos las temperaturas
for (int i=0; i<5; i++)
{ 
System.out.println( "temperaturas["+i+"]: "+temperaturas[i] );
}
//cambiamos algunas temperaturas
temperaturas[0] += 4;
temperaturas[2] -= 2;
//calculamos la media
for (int i=0; i<5; i++)
{
total += temperaturas[i];
}
media = total / 5;
System.out.println( "\nTemperatura media: " + media );
}  
}
