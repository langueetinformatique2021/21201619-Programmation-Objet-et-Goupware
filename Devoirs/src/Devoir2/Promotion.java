package Devoir2;

	/** @author Anne Faury */

public abstract class Promotion {
	private String type_etude;
	private String niveau_etude;
	protected String nom_etudiant;
	protected String INE_etudiant;

	/**
	 * création d'une nouvelle instance de la classe Promotion2
	 * 
	 * @param domaine domaine d'étude de l'individu
	 * @param niveau niveau d'étude de l'individu (L | M | D)
	 * @param nom nom et prénom de l'individu
	 * @param INE Identifiant National Etudiant de l'individu
	 */
	
	public Promotion(String domaine, String niveau, String nom, String INE) {
		type_etude = domaine;
		niveau_etude = niveau;
		nom_etudiant = nom;
		INE_etudiant = INE;
	}
	
	/** présentation des caractéristiques de la promotion */
	public void présente() {
		System.out.println("J'appartiens à la promotion de " + niveau_etude + " en " + type_etude + ".");
	}
	
	/** Occupation de l'individu */
	public abstract void occupation();
}
