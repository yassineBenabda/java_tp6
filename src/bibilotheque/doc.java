package bibilotheque;

public class doc {
	private String titre;
	private int id;
	private int nbp;
	
	public doc(String titre, int id, int nbp) {
		this.titre=titre;
		this.id=id;
		this.nbp=nbp;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public int getId() {
		return id;
	}
	
	public int getNbp() {
		return nbp;
	}
	
	public void edition() {
		System.out.println("Document: "+titre+" ID: "+id+" le nombre de pages: "+nbp);
	}
}
