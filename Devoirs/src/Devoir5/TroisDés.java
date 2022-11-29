package Devoir5;

public class TroisDés {
	private int d1,d2,d3;
	
	public TroisDés(int d1, int d2, int d3) {
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}
	public void lancerDés() {
		if (((d1 == 4) || (d2 == 4) || (d3==4)) && ((d1 == 2) || (d2 == 2) || (d3==2)) && ((d1 == 1) || (d2 == 1) || (d3==1))) {
			System.out.println("Exception : Bob a fait " + d1 + d2 + d3);
			
		}
		else {
			System.out.println("Bob : Lancer1 : " + d1 + " ; Lancer2 : " + d2 + " ; Lancer3 : " + d3);
		}
	}

}
