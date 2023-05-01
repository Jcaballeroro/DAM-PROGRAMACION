package EjercicioObligatorioFicheros2;
//Realiza el siguiente ejercicio, utilizando la clase File y un array
//que me muestre los ficheros por pantalla.


import java.io.File;
import java.io.File;
import java.util.Scanner;



public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File( "c:/prueba"); // se intancia File
		
		String [] fichero=f.list(); // metemos array
		
		System.out.println("Contenido de prueba");
		
		
		
		for ( String monfile : fichero) { //
		
		System.out.println( monfile);//imprime listado de prueba
		
		
	
	}
		
		System.out.println("Lista de archivos guardados en listado.txt");
		
	}
	
}