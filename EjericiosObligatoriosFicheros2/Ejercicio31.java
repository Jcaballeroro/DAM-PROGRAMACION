package EjercicioObligatorioFicheros2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
	 
	public class Ejercicio31 {
	    public static void main(String[] args) throws IOException {
	        File directory = new File("c:\\prueba\\cliente");
	        FileUtils.forceDelete(directory);
	    
	    System.out.println("Carpeta y fichero borrado");
	}
	}