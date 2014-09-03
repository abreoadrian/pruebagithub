package Lab_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author DOCENTE
 */
public class App8 {
    public static void main( String args[] ) throws IOException
{
//Objeto para leer una cadena del teclado
BufferedReader entrada=
new BufferedReader(new InputStreamReader(System.in));
int edad;
String nombre;
System.out.println( "\nIntroduce tu nombre: " );
nombre = entrada.readLine();
System.out.println( "\nIntroduce tu edad: " );
//conversión de cadena a número
edad = Integer.parseInt(entrada.readLine());
System.out.print( "\nTe llamas " + nombre + " y tienes "
+ edad + " años.");
}
}
