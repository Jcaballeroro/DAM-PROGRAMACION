package EjercicioObligatorioFicheros2;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		String ruta="c:\\prueba\\";// ruta donde está
		String carpeta ="cliente";// como se llama la carpeta
		File fichero = new File(ruta + carpeta);
		
		
	try {	
		
		if (fichero.exists()==true) { // si existe ok
			System.out.println("La carpeta existe");//mensaje de la carpeta que existe
			
		}else {
			fichero.mkdir();// si no existe la crea
			System.out.println("carpeta creada");//mensaje para decir que está creada
		}
		
		System.out.println("Introduce tu usuario");
		String nameUsuario = s.nextLine();
		
		System.out.println("Introduce tu contraseña");
		String nameContraseña = s.nextLine();
		
		
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(ruta+carpeta+"\\"+"usuario2.txt"));
		bw.write(nameUsuario);
		bw.write(nameContraseña);
		bw.close();
		

	
	System.out.println("Lista de archivos guardados en usuario.txt");

	
	} catch (IOException ioe) {
		System.out.println("No se ha podido escribir en el fichero");
}
}
}


