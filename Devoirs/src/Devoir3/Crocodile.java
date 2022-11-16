package Devoir3;

/** @author Anne Faury */

/** Création et gestion de Crocodile */
public class Crocodile extends Reptile {
	protected String museau = "un long museau triangulaire";

	/**
	 * le constructeur de Crocodile fait appel au constructeur de la sur-classe Reptile
	 */
	public Crocodile() { 
		super("crocodiles");
		System.out.println("J'ai " + museau);
	}

	/** cri du Crocodile */
	public void crie() {
		if (ecailles == false) super.crie();
		else 
			System.out.println("Je suis une anomalie");
	}
	

	
}