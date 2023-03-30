package fr.isika.cda24.annuaire.entitees;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
			
public class Annuaire {
	
	public static void main(String[] args) {

		try {
			File myObj = new File("C:/Users/flaz8/Desktop/CoursGit/src/Doc/STAGIAIRES.DON");
			Scanner myReader = new Scanner(myObj);

			List<Stagiaire> laListeDeStagiaire = null;
		

			String data = myReader.nextLine(); 

			int ligneIteration = 0;
			
			while (myReader.hasNextLine()) {
				if (data == "*") {
					myReader.nextLine();
					ligneIteration++;
				}
				
				System.out.println(data);

				String nom, prenom, departement, promo, annee;
				
				switch (ligneIteration) {
				case 1:
					nom = data;
					break;
				case 2:
					prenom = data;
					break;
				case 3:
					departement = data;
					break;
				case 4:
					promo = data;
					break;
				case 5:
					annee = data;
					break;
				}
				ligneIteration++;
				laListeDeStagiaire.add(new Stagiaire(nom, prenom, departement, promo, annee));

			}
			
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Aïe, y'a un problème quelque part !");
			e.printStackTrace();
		}
	}
}