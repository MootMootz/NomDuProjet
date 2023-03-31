package fr.isika.cda24.annuaire.lanceur;


import java.util.ArrayList;
import java.util.List;

import fr.isika.cda24.annuaire.entitees.Stagiaire;
import fr.isika.cda24.annuaire.staff.User;



public class Lanceur {

	public static void main(String[] args) {
		
		User staff= new User("Vincent", "jebdf", "hkevd", "hvckjcd"); 
		
		List <Stagiaire> listStagiaire = new ArrayList<>();
	
		
		((Stagiaire) listStagiaire).ajouterStagiaire("Aitcheou David") ; 
		((Stagiaire) listStagiaire).ajouterStagiaire("Lestieux Florian") ; 
		((Stagiaire) listStagiaire).ajouterStagiaire("Bastos André") ; 
		
		((Stagiaire) listStagiaire).ajouterStagiaire("Gaudel Vincent") ; 

	
		
	}

}
