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
public class App3 {
    public static void main( String args[] )
{
int x=5, y=2;
//igual
if (x==5) System.out.println("x=5");
//distinto
if (x!=2) System.out.println("x!=2");
//y lógico
if (x==5 && y==2) System.out.println("x=5, y=2");
//o lógico
if (x==5 || y==1) System.out.println("x=5");
//operación
if (x+y>10)
{
System.out.println("x+y>10");
}
else
    {
System.out.println("x+y<10");
}
}
}
