package bibilotheque;

public class livre extends article {
	private String editeur;
	
	public livre(String titre,int id,int nbp,String auteur,String editeur) {
		super(titre,id,nbp,auteur);
		this.editeur=editeur;
	}
	
	public String getEditeur() {
		return editeur;
	}
	
	public void edition() {
		super.edition();
		System.out.println(" Editeur: "+editeur);
	}
}
