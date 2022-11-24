package Devoir4;

/** création et gestion d'un cercle */
public class Cercle extends FigureMétrique implements Comparable{

	final double PI = 3.14;
	protected float rayon = 0;
	/** Création d'une nouvelle instance de Cercle */
	public Cercle(float x) {
	super("rouge"); rayon = x; }
	/** calcul du périmètre d'un cercle
	* @return périmètre */
	public float périmètre() { 
	System.out.println("Périmètre : "  + (2*Math.PI*rayon) ) ;
	return (float) (2*Math.PI*rayon);}
	/** calcul de la surface d'un cercle
	* @return surface */
	public float surface() { 
	System.out.println("Surface : "  + (Math.PI*rayon*rayon) );
	return (float) (Math.PI*rayon*rayon);}

}
	
	// Implement the compareTo() method

//    public int compareTo(Object compareTo) {

//        Cercle compareToC = (Cercle)compareTo;

//        if (couleur == compareToC.couleur) return 0;

 //      if (couleur > compareToC.couleur) return 1;

  //      return -1;        

//    }

 // fin de définition