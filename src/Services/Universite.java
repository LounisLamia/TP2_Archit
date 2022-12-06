package Services;

public class Universite {

 private int i_univ; //identifiant unique de l'université
 private String nom;
 private Repository.TypePackage pack;
 
	public Universite(int i_univ, String nom, Repository.TypePackage p) {
	super();
	this.i_univ = i_univ;
	this.nom = nom;
	this.pack = p;
}
	public int getI_univ() {
		return i_univ;
	}
	public void setI_univ(int i_univ) {
		this.i_univ = i_univ;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Repository.TypePackage getPack() {
		return pack;
	}
	public void setPack(Repository.TypePackage pack) {
		this.pack = pack;
	}
	 
 

 
 
}
