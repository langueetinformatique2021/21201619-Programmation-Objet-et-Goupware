package Devoir3;

/** @author Anne Faury */

/** Création et gestion de Reptile */
public class Reptile extends Animal {
	protected boolean ecailles = false;

	/**
	 * le constructeur de Reptile fait appel au constructeur de la sur-classe Animal
	 */
	public Reptile(String type) {
		super(type, 0 | 4);
	}

	/** présentation des caractéristiques du Réptile */
	public void présente() {
		super.présente();
		String type_peau = (ecailles) ? "n'a pas d'écailles" : "a des écailles" ;
		System.out.println("Je suis un animal qui " + type_peau + ".");
	}

	/** cri du Réptile */
	public void crie() {
		System.out.println("Je lamente.");
	}
}