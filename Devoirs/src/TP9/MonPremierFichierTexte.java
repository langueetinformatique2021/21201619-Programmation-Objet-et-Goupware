package TP9;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class MonPremierFichierTexte {
	public static void main(String[] args) {

		try {
			PrintWriter pr = new PrintWriter(new File("21201619-Programmation-Objet-et-Goupware/Devoirs/src/TP9/Nom.txt"));
			pr.println("Victoria Eyhrabide");
			pr.println("Claude Montacié");
			pr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

