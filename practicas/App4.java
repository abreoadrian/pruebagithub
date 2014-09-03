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
public class App4 {
   public static void main( String args[] )
{
int arrayint[] = new int[3];
char arraychar[] = {'a', 'b', 'c'};
//rellenamos el array de enteros
for (int i=0; i<3; i++)
{
arrayint[i]=i;
}
//imprimimos su valor
for (int i=0; i<3; i++)
{
System.out.println( "arrayint["+i+"]: "+arrayint[i] );
}
//incrementamos en 1 cada valor
for (int i=0; i<3; i++)
{
arrayint[i]+=1;
System.out.println( "arrayint["+i+"]: "+arrayint[i] );
}
//incrementamos en 1 cada letra
for (int i=0; i<3; i++)
{
arraychar[i]+=1;
}
//imprimimos su valor
for (int i=0; i<3; i++)
{
System.out.println( "arraychar["+i+"]: "+arraychar[i] );
}
}
}

