package Devoir4;

/** création et gestion d'une figure géométrique */

public abstract class FigureMétrique {
	protected String couleur = "noir"; // couleur par défaut
	/** création d'une nouvelle instance de FigureGeometrique
	* @param co couleur de la figure */
	public FigureMétrique (String co) {
		couleur = co; } // initialisation de la couleur
		/** calcul du périmètre d'une figure géométrique
		* @return périmètre */
		public abstract float périmètre();
		/** calcul de la surface d'une figure géométrique
		* @return surface */
		public abstract float surface();
		} // fin de définition de la classe
