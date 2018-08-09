package Postit;

public class Postit {

	
	String couleur;
	String forme;
	int taillecm;
	Contenu cont = new Contenu();
	boolean iscollant;
	boolean collant() {
		return iscollant;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getForme() {
		return forme;
	}
	public void setForme(String forme) {
		this.forme = forme;
	}
	public int getTaillecm() {
		return taillecm;
	}
	public void setTaillecm(int taillecm) {
		this.taillecm = taillecm;
	}
	public Contenu getCont() {
		return cont;
	}
	public void setCont(Contenu cont) {
		this.cont = cont;
	}
	public boolean isIscollant() {
		return iscollant;
	}
	public void setIscollant(boolean iscollant) {
		this.iscollant = iscollant;
	}

}
