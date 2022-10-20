package TP5;

public class Carafe_test {
	

	public static void main(String[] args) {
		Ex3_Carafe c1 = new Ex3_Carafe (0,7);
		Ex3_Carafe c2 = new Ex3_Carafe (0,5);
		
		c1.remplir();
		c2.vider();
		
		System.out.println(c1.contenu());
		System.out.println(c2.capacite());
	}

}
