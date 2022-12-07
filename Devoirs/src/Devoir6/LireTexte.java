package Devoir6;

import java.io.*;
import java.util.*;

/** Lecture des mots d'un fichier-texte*/

public class LireTexte {
	private String NomFichier;
	private BufferedReader entrée;
	private String ligne;
	private StringTokenizer tok;
	
	
	/** Création d'une nouvelle instance de LireTexte
	* @param ft nom du fichier texte
	*/
	public LireTexte(String ft) {
		NomFichier = ft;
	}
	
	
	/** Ouverture d'un fichier texte,
	* Lecture de la première ligne,
	* Teste si le fichier est vide
	* @throws IOException Erreur à l'ouverture
	* @throws FichierVide Fichier vide
	*/
	protected void Ouvrir() throws IOException {
		try {
		entrée = new BufferedReader(
				new FileReader(new File("C:/Users/anfau/OneDrive/Documents/Mes données/Sorbonne Université/Cours/Programmation objet/Local Repository/2120161GI/FAURY_TD4/src/Devoir6/" + NomFichier)));
		ligne = entrée.readLine();
		System.out.println(ligne);

	} catch (IOException e) {
		e.printStackTrace();
		}
	}
	
	
	/** Fermeture du fichier
	* @throws IOException Erreur à la fermeture
	*/
	protected void Fermer() throws IOException {
		try {
		entrée.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/** Lecture mot à mot du fichier
	* @return prochain mot
	* @throws IOException Erreur de lecture
	*/
	public String readWord () throws IOException {
		try {
		String i = ligne;
		while (i != null) {
			tok = new StringTokenizer(i);
			while (tok.hasMoreTokens()) {
		         System.out.println(tok.nextToken());
		     }
			i = entrée.readLine();
		}
		} catch (IOException e) {
		e.printStackTrace();
			}
		return ligne;
	}


}
