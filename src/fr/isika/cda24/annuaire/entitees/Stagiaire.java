package fr.isika.cda24.annuaire.entitees;


public class Stagiaire {

	public String nom;
	public String prenom;
	public String departement;
	public String promo;
	public String annee;
	private Stagiaire filsGauche;
	private Stagiaire filsDroit;
	

	// Déclaration du constructeur Stagaire
	public Stagiaire(String nom, String prenom, String promo, String departement, String annee) {
		this.nom = nom;
		this.prenom = prenom;
		this.departement = departement;
		this.promo = promo;
		this.annee = annee;
	}

	
	
	
	
	
	
	
//	public static void main(String[] args) throws IOException {
//		
//		
//		List<Stagiaire> listeStagiaires = readFromListeDeStagiaire();
//		for (Stagiaire stagiaire : listeStagiaires) {
//			System.out.println(stagiaire.getNom() + "  " + stagiaire.getPrenom());
//		}
//	}

//	public static List<Stagiaire> readFromListeDeStagiaire() throws IOException {
//		List<Stagiaire> listeStagiaires = new ArrayList<>();
//
//		try {
//			FileReader frListeStagiaires = new FileReader("C:/Users/flaz8/Desktop/CoursGit/src/Doc/STAGIAIRES.DON"); // on pointe vers le doc
//			BufferedReader bfListeStagiaire = new BufferedReader(frListeStagiaires); // on met en place la méthode qui va cherche les lignes du doc
//			String ligne = bfListeStagiaire.readLine(); // lecture des lignes
//		
//			
//			// début de l'itération des blocs
//			int ligneIteration = 0;
//
//			
//			// début de boucle
//			while (ligne != null) {
//				
//				// délimitation des fiches
//				if (ligne.equals("*")) {
//					ligne = bfListeStagiaire.readLine();
//					ligneIteration++;
//				}
//				
//				// on enregistre les lignes successives pour les paramètres d'un stagiaire
//				switch (ligneIteration) {
//				case 1:
//					nom = ligne;
//					break;
//				case 2:
//					prenom = ligne;
//					break;
//				case 3:
//					departement = ligne;
//					break;
//				case 4:
//					promo = ligne;
//					break;
//				case 5:
//					annee = ligne;
//					listeStagiaires.add(new Stagiaire(nom, prenom, departement, promo,annee));
//					ligneIteration = 0; // on repart à zéro
//					break;
//				default:
//					break;
//				}
//				ligne = bfListeStagiaire.readLine();
//			}
//
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return listeStagiaires;
//	}


	
//	public Stagiaire rechercher(Stagiaire stagiaire, String nom, String // methode de recherche de stagiaire
//	prenom) {
//
//		if (stagiaire == null) {
//
//			return null;
//
//		} else if (nom.equals(stagiaire.getNom()) // sinon si le nom ou prénom tapés correspondent à celui du stagiaire,
//													// il sera affiché
//				|| prenom.equals(stagiaire.getPrenom())) {
//			return stagiaire;
//		}
//
//		else {
//			if (stagiaire.getFilsGauche() != null) // aller chercher du côté du fils gauche si le nom n'est pas trouvé
//
//				return rechercher(stagiaire.getFilsGauche(), nom, prenom);
//
//			else
//				return rechercher(stagiaire.getFilsDroit(), nom, prenom); // sinon chercher les informations du fils
//																			// droit
//
//		}
//
//	}

	// getters & setters --------------------------------------------
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}
	
	public Stagiaire getFilsGauche() {
		return filsGauche;
	}

	public void setFilsGauche(Stagiaire filsGauche) {
		this.filsGauche = filsGauche;
	}

	public Stagiaire getFilsDroit() {
		return filsDroit;
	}

	public void setFilsDroit(Stagiaire filsDroit) {
		this.filsDroit = filsDroit;
	}
	// ---------------------------------------------------------------

}
