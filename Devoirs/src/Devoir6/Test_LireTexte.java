package Devoir6;

import java.io.IOException;

public class Test_LireTexte {
	public static void main(String[] args) throws IOException {
		LireTexte lt = new LireTexte("Texte.txt");
		lt.Ouvrir();	
		lt.readWord();
		lt.Fermer();
	}

}
