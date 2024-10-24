package bibilotheque;

public class periodique extends doc {
	private String frequence;
	
	public periodique(String titre,int id,int nbp,String frequence) {
		super(titre,id,nbp);
		this.frequence=frequence;
	}
	
	public String getFrequence() {
		return frequence;
	}
	
	public void edition() {
		super.edition();
		System.out.println(" Frequence: "+frequence);
	}
}
