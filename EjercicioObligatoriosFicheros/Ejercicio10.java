package EjercicioObligatoriosFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try {
			
			BufferedReader br1 =  new BufferedReader(new FileReader("c:\\prueba\\menu1.txt"));
			BufferedReader br2 =  new BufferedReader(new FileReader("c:\\prueba\\menu2.txt"));
			
			String linea="";
			System.out.println("Contenido del fichero menu1.txt;");
			while ((linea = br1.readLine()) !=null){
				System.out.println(linea);
			}
			
			System.out.println("Contenido del fichero menu2.txt;");
			while ((linea = br2.readLine()) !=null){
				System.out.println(linea);
			
		}
			
			br1.close();
			br2.close();

	




	} catch (IOException ioe) {
		System.out.println("Se ha producido un error de lectura");
		System.out.println(ioe.getMessage());
}
}
}