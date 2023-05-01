package EjercicioObligatorioFicheros2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			FileWriter script = new FileWriter("c:/prueba/git.sh");//instanciar el FILE
			BufferedWriter bs=new BufferedWriter(script);// instanciar BUFFeredWriter
			bs.write("git checkout -b jose\n");
			bs.write("git add creategit.sh\n");
			bs.write("git commit -m 'subido fichero'\n");
			bs.write("git push origin jose\n");
			bs.close();
			
				
		} catch (IOException e) {
			// todo Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
