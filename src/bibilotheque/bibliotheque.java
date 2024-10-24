package bibilotheque;

public class bibliotheque {
	doc[] listdoc;
	private int capacite;
	private int nbd;
	
	public bibliotheque(int capacite) {
		this.capacite=capacite;
		listdoc = new doc[capacite];
		this.nbd=0;
	}
	
	public int getCapacite() {
		return capacite;
	}
	
	public int getNombreDocuments() {
		return nbd;
	}
	
	public void ajoutDoc(doc d) {
		if (nbd < capacite) {
			listdoc[nbd]=d;
			nbd++;
		} else {
			System.out.println("Bibliotheque pleine !");
		}
	}
	
	public void Supprim_doc(int num) {
		for (int i = 0; i < nbd; i++) {
			if (listdoc[i].getId() == num) {
				for (int j = i; j < nbd - 1; j++) {
					listdoc[j] = listdoc[j + 1];
				}
				listdoc[nbd - 1]=null;
				nbd--;
				break;
			}
		}	
	}
	
	public void inventaireDoc() {
	    for (int i = 0; i < nbd; i++) {
	        listdoc[i].edition();
	        System.out.println();
	    }
	}

	public bibliotheque listeLivre() {
		bibliotheque bibliolivres = new bibliotheque(capacite);
		for (int i = 0; i < nbd; i++) {
			if (listdoc[i] instanceof livre) {
				bibliolivres.ajoutDoc(listdoc[i]);
			}
		}
		return bibliolivres;
	}	
	
	public bibliotheque listeArticle() {
		bibliotheque biblioarticles = new bibliotheque(capacite);
		for (int i = 0; i < nbd; i++) {
			if (listdoc[i] instanceof article) {
				biblioarticles.ajoutDoc(listdoc[i]);
			}
		}
		return biblioarticles;
	}
	
	public bibliotheque docSimple() {
		bibliotheque biblioDocSimple = new bibliotheque(capacite);
		for (int i = 0; i < nbd; i++) {
			biblioDocSimple.ajoutDoc(listdoc[i]);
		}
		return biblioDocSimple;
	}
	
	public bibliotheque listePeriodique() {
		bibliotheque biblioperiodiques = new bibliotheque(capacite);
		for (int i = 0; i < nbd; i++) {
			if (listdoc[i] instanceof periodique) {
				biblioperiodiques.ajoutDoc(listdoc[i]);
			}
		}
		return biblioperiodiques;
	}
}
