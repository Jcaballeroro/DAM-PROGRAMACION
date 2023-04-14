package EjercicioObligatoriosFicheros;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedReader br = new BufferedReader(new FileReader("c:\\prueba\\pares.txt"));
			br.close();
			{
		String linea="";
		System.out.println(linea);
	}
	
} catch (IOException  e ) {
	System.out.println("Errror no se econtro fichero pares.txt");
}

}
}
