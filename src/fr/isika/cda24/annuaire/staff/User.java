package fr.isika.cda24.annuaire.staff;

import fr.isika.cda24.annuaire.entitees.Stagiaire;

public class User extends Employe {

	// on écrit les attributs propres aux utilisateurs c'est à dire le login et le
	// mot de passe

	private String login;
	private String mdp;
	private Stagiaire racine;

	public String getLogin() {
		return login;
	}

	public Stagiaire getRacine() {
		return racine;
	}

	public void setRacine(Stagiaire racine) {
		this.racine = racine;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public User(String Nom, String Prenom, String login, String mdp) {
		super(Nom, Prenom);

		this.login = login;
		this.mdp = mdp;
	}

	@Override
	public void imprimer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajouterStagiaire(String stagiaire) {

		// si arbre vide

		if (racine == null) { // cas de terminaison
			racine = new Stagiaire(stagiaire);
		} else {
			this.racine.ajouterStagiaire(stagiaire); // cas de base
		}

	}

	@Override
	public void rechercheAvancée() {
		// TODO Auto-generated method stub

	}

	public String rechercher(String recherche )  {       

    if (recherche.equals(recherche)) {
    	
		
		    }
		  

		}

	@Override
	public void ajouterStagiaire() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rechercher() {
		// TODO Auto-generated method stub

	}

}
