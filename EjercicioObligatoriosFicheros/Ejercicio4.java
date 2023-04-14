package EjercicioObligatoriosFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedReader br = new BufferedReader (new FileReader("C:\\prueba\\asignaturas.txt"));// lee el fichero txt
			
			String linea ="";
			System.out.println("Asignaturas de 1 de DAM: ");
			while (linea != null) {
				linea =br.readLine();
				if(linea !=null) {
					System.out.println(linea);
				}
			}
			
			br.close();
			
		} catch(IOException ioe) { // que hacer si hay un error en la lectura del fichero
			System.out.println("No se puede leer fichero asignaturas.txt");
		}

	}

	
	

	
	}


