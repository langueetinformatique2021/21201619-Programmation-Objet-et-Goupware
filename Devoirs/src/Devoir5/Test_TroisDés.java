package Devoir5;

public class Test_TroisDés {
	public static void main(String[] args) {
		Aleat random = new Aleat(6);
		TroisDés TD = new TroisDés(random.get(), random.get(), random.get());
		TroisDés TD2 = new TroisDés(2, 1, 4); //forcer l'exception
		TD.lancerDés();
		TD2.lancerDés(); // résultat de l'exception forcée
	}

}