package EjercicioObligatoriosFicheros;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try	{
	BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\prueba\\clientes.txt"));// el crea directamente el archivo de texto
	// no añade, pisa el fichero con los datos que se metan si se ejecuta de nuevo
	
	bw.write("Alberto\n");
	bw.write("Eva\n");
	bw.write("Laura\n");
	bw.write("Antonio\n");
	
	System.out.println("Fichero creado");
	bw.close();
	
}catch (IOException ioe) {
	System.out.println("No ne ha podido escribir");
}

}
}