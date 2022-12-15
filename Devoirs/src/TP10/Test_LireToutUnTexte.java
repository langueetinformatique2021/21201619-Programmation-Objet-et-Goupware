package TP10;

import java.io.File;

public class Test_LireToutUnTexte {


	public static void main(String[] args) {
		
		LireToutUnTexte lt = new LireToutUnTexte(new File("livres/adelaide.txt"));
		//lt.afficher();
		System.out.println(lt.Chercher("Rothbanner"));
		
		System.out.println(lt.ChercherVoir("Rothbanner", 10));
	}

}