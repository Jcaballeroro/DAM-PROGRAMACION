package EjercicioObligatorioTema12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejericio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
String nombreFichero = "c:\\prueba\\cliente\\usuario2.txt";
		
		File fichero = new File(nombreFichero);
		
		if (fichero.exists()==true) { // si existe ok
			fichero.delete();
			System.out.println("El fichero se ha borrado correctamente");
			
		
		} else {
			
			System.out.println("El fichero" + nombreFichero + " no existe");
		}

		

		
		
	}
	
	
	
	
	
		
	}