package fr.gtm.monopoly;

public class Plateau {
private Case[] cases = new Case[40];
	
	public Plateau() {
		creerCases();
		lierCases();
	}
	/*
	 * positioner la case suivante
	 * la case 0 a pour suivante les case 1
	 * ...
	 * la case 39 a pour suivante la case 0
	 */

	private void lierCases() { 
		
		for (int i = 0; i < cases.length-1;i++){ 
			cases[i].setNextCase (cases[i+1]);         ;
		}
		cases[cases.length-1].setNextCase(cases[0]);
		
	}
	/*
	 * méthode qui permet créer les 40 cases
	 * les 40 elts du plateau
	 * les cases sont nommées : case 0, case 1...
	 */

	private void creerCases() {
		
		for (int i = 0; i < cases.length; i++) {
			cases[i] = new Case(); 
			cases[i].setNom("case"+ i);
		}
		
	}
	
	public Case getCaseDepart() {
		return cases[0]; 
	}


}
