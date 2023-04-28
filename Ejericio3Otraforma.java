package pruebaborrardirectorio;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
	 
	public class Ejericio3 {
	    public static void main(String[] args) throws IOException {
	        File directory = new File("c:\\prueba\\cliente");
	        FileUtils.forceDelete(directory);
	    }
	}


