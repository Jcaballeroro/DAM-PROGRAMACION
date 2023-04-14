package EjercicioObligatoriosFicheros;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;




public class Ejercicio3 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\prueba\\asignaturas.txt"));
			bw.write("Sistemas\n");
			bw.write("Leguaje\n");
			bw.write("Datos\n");
			bw.write("Sistemas\n");
			bw.write("Foll\n");
			bw.write("Entorno\n");
			
			System.out.println("Fichero creado");
			bw.close();
		} catch ( IOException ioe) {
			System.out.println("No se ha podido escribir");
		}
	}
}
		
		

	


