package Devoir2;

/**
 * @author Anne Faury
 */

/** Création et gestion de Etudiant */
public class Etudiant extends Promotion {
	protected boolean etudiant = true;
	
	/**
	 * le constructeur de Etudiant fait appel au constructeur de la sur-classe Promotion
	 */
	public Etudiant(String niveau, String nom, String INE) {
		super("SDL", niveau, nom, INE);
	}

	/** présentation des caractéristiques de l'Etudiant */
	public void présente() {
		// appel de la méthode de la sur-classe
		super.présente();
		String statut = (etudiant) ? "étudiant" : "responsable";
		System.out.println("Je suis un " + statut + ".");
	}
	
	/** Occupation de l'étudiant */
	public void occupation() {
		System.out.println("J'étudie.");
	}
	
}
