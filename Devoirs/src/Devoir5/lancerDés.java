package Devoir5;

public class lancerDés extends Aleat {
	
	public lancerDés() {
		super(6);
		
	}
	
	
	public TroisDés lancer() {
		TroisDés tire = new TroisDés(super.get(), super.get(), super.get());
		return tire;
		
	}

}