package fr.isika.cda24.annuaire.staff;

import fr.isika.cda24.annuaire.entitees.FonctionsAdmin;

public class UserAdmin extends User implements FonctionsAdmin {

	public UserAdmin(String Nom, String Prenom, String login, String mdp) {
		super(Nom, Prenom, login, mdp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mettreAjourStagiaire() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerStagiaire() {
		// TODO Auto-generated method stub
		
	}

}
