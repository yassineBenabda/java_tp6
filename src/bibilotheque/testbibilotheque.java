package bibilotheque;

public class testbibilotheque {

	public static void main(String[] args) {
		bibliotheque b1 = new bibliotheque(10);
		
		doc d1 = new doc("document 1",97,70);
		article a1 = new article("article 1",98,80,"auteur 1");
		livre l1 = new livre("livre 1",99,90,"auteur 2","editeur 1");
		periodique p1 = new periodique("periodique 1",100,50,"chaque mois");
		
		b1.ajoutDoc(d1);
		b1.ajoutDoc(a1);
		b1.ajoutDoc(l1);
		b1.ajoutDoc(p1);
		
		System.out.println("inventaire:");
		b1.inventaireDoc();
		
		System.out.println("\nListe des Livres:");
		bibliotheque livres = b1.listeLivre();
		livres.inventaireDoc();
	}
}
