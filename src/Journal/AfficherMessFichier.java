package Journal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Services.IJournal;

public class AfficherMessFichier implements IJournal {
	public void outPut_Msg(String message) throws IOException {
		File file = new File("fichier.txt");
		   if (!file.exists()) {
		    file.createNewFile();
		   }

		   FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
		   BufferedWriter bw = new BufferedWriter(fw);
		   bw.write(message);
		   bw.newLine();
		   bw.close();
	}
		
	
	}
	
