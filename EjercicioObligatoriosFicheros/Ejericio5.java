package EjercicioObligatoriosFicheros;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejericio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\prueba\\pares.txt"));


			
			int count = 0;
			
			for( int i = 2; i <= 100; i +=2) {
				bw.write(Integer.toString(i) + "\n");
				count++;
			}
			bw.close();
			
			System.out.println("Se ha creado el fichero ' pares.txt'");
			System.out.println("Se han guardado" + count + "numeros pares");
		} catch (IOException ioe) {
			System.out.println("No se ha podido escribir en el fichero");
		}
	}

}
