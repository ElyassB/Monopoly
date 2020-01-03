package fr.gtm.monopoly;

public class Pion {
	private String nom;
	private Case position;
	private Joueur joueur;
	 
	
	public Pion() {} 
	
	public Pion(String nom) {
		this.nom = nom;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public void setPosition(Case position) {
		this.position = position;
	}

	public Case getPosition() {
		return position;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void avancer (int r) {
		for (int i = 0; i < r-2; i++) {
			this.setPosition(this.getPosition().getNextCase());
			this.getPosition().survoler(this);
		}
		this.setPosition(this.getPosition().getNextCase());
		this.getPosition().arreter(this);
	}
	
	

}
