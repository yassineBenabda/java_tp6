package bibilotheque;

public class article extends doc {
	private String auteur;
	
	public article(String titre,int id,int nbp,String auteur) {
		super(titre,id,nbp);
		this.auteur=auteur;
	}
	
	public String getAuteur() {
		return auteur;
	}
	
	public void edition() {
		super.edition();
		System.out.println(" Auteur: "+auteur);
	}
}
