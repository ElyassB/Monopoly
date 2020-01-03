package fr.gtm.monopoly;

public class Case {
	private String nom;
	private Case nextCase;
	
	
	public Case () {}
	
	public Case (String nom) {  // constructeur
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}

		
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Case getNextCase() {	
		return nextCase;
	} 
	
	public void setNextCase(Case nextCase) {
		this.nextCase = nextCase;
	}

	

	public void survoler(Pion pion) {
		System.out.println("SURVOL de "+nom+" par "+pion.getNom());
		
	}

	public void arreter(Pion pion) {
		System.out.println("ARRET sur "+nom+" par "+pion.getNom());
		
	} 
	
	
}
