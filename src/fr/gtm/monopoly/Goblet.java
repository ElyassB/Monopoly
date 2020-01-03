package fr.gtm.monopoly;

public class Goblet {
	private De de1 = new De();
	private De de2 = new De();
	
	public void lancer() {
		de1.lancer();
		de2.lancer();
	}
	
	public int getValue() {
		return de1.getValeur() + de2.getValeur();
	}
	
	public boolean isSame() {
		return de1.getValeur() == de2.getValeur();
		
	}

}
