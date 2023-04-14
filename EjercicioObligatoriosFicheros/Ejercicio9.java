package EjercicioObligatoriosFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedWriter br1 = new BufferedWriter(new FileWriter("c:\\prueba\\menu1.txt"));
			br1.write("Lentejas, ensalada y pan\n");
			
			BufferedWriter br2 = new BufferedWriter(new FileWriter("c:\\prueba\\menu2.txt"));
			br2.write("Cocido, ensalada y pan\n");
			
			
			System.out.println("Fichero creado");
			br1.close();
			br2.close();
			
			
		} catch ( IOException ioe) {
			System.out.println("No se ha podido escribir");
			
			
		
	


		
		}
	}
}

		
		
	


