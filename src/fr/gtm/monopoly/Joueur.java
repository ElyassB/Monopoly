package fr.gtm.monopoly;



public class Joueur {
	private String nom;
	private Pion pion;
	
	public void setPion(Pion pion) {
		this.pion = pion;
	}

	public Pion getPion() {
		return pion;
	}

	public Joueur(String nom) { // constructeur
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void jouer(Goblet goblet) {
		goblet.lancer();
		int r = goblet.getValue();
		this.pion.avancer(r);
		
		
	}
	

}
