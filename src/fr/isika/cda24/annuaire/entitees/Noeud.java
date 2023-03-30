package fr.isika.cda24.annuaire.entitees;

public class Noeud {
	
	private Stagiaire cle;
	private Noeud filsGauche;
	private Noeud filsDroit;
	
	
	
	public Noeud(Stagiaire cle, Noeud filsGauche, Noeud filsDroit) {
		super();
		this.cle = cle;
		this.filsGauche = filsGauche;
		this.filsDroit = filsDroit;
	}
		
		public Noeud(Stagiaire cle, Noeud filsDroit) {
			super();
			this.cle = cle;
			this.filsDroit = filsDroit;
		
	}
		
		public Noeud(Stagiaire cle) {
			super();
			this.cle = cle;
		}
		
		
	public Stagiaire getCle() {
		return cle;
	}
	public void setCle(Stagiaire cle) {
		this.cle = cle;
	}
	public Noeud getFilsGauche() {
		return filsGauche;
	}
	public void setFilsGauche(Noeud filsGauche) {
		this.filsGauche = filsGauche;
	}
	public Noeud getFilsDroit() {
		return filsDroit;
	}
	public void setFilsDroit(Noeud filsDroit) {
		this.filsDroit = filsDroit;
	}
	
	public 
	
	
	public void ajouterNoeud(Stagiaire cleAjout, Noeud filsDroit, Noeud filsGauche) {  //ajout de noeud dans notre arbre binaire
		
		//arbre binaire de recherche ABR
		// a gauche ce qui est plus petit que la racine
		//a droite ce qui est plus grand que la racine
		
		int comparaison = this.cle.getNom().compareTo(cleAjout.getNom());
		
		// int < 0 si this < cleAjout
		// int > 0 si this > cleAjout
		// 0 this = cleAjout
		
		if (comparaison > 0 ) {
			
			//this plus grand que cleAjout donc cleAjout va à gauche
			
			if (this.filsGauche == null) { // cas de terminaison
				
				this.filsGauche = new Noeud(cleAjout, filsDroit, null);
				
			} else {
				//cas de base
				
				this.filsGauche.ajouterNoeud(cleAjout, filsDroit, filsGauche);
			}
		} else /*if(comparaison < 0)*/{
			//si this plus petit ou egal � cleAjout on va � droite
			
			if(this.filsDroit == null) {
				
				this.filsDroit = new Noeud(cleAjout,null,filsGauche);
				
			} else {
				this.filsDroit.ajouterNoeud(cleAjout, filsDroit, filsGauche);
			}
		} /*else {
			//comparaison = 0 
			return ;
		}*/
	}
	
	public void affichageInfixeNoeud() {
		
		if(this.filsGauche != null) {
			
			this.filsGauche.affichageInfixeNoeud();
		}
		System.out.println(this.cle);
		
		if(this.filsDroit != null) {
			
			this.filsDroit.affichageInfixeNoeud();
		}
	}

}
