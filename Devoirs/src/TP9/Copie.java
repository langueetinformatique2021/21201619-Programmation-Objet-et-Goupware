package TP9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class Copie {
	public static void main(String[] args) {

		try {
			File fin = new File("21201619-Programmation-Objet-et-Goupware/Devoirs/src/TP9/Nom.txt");
			FileInputStream fsource = new FileInputStream(fin);	
			byte[] tmp = new byte[(int)fin.length()];
			fsource.read(tmp);
			fsource.close();
			
			FileOutputStream fcible = new FileOutputStream(
					new File("21201619-Programmation-Objet-et-Goupware/Devoirs/src/TP9/NomC.txt"));
			fcible.write(tmp);
			fcible.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
