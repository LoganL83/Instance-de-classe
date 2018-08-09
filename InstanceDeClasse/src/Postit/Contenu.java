package Postit;

public class Contenu {

	
	String natureContenu;
	boolean vide;
	boolean isvide() {
		return vide;
	}
	Pen pencil = new Pen();
	public String getNatureContenu() {
		return natureContenu;
	}
	public void setNatureContenu(String natureContenu) {
		this.natureContenu = natureContenu;
	}
	public boolean isVide() {
		return vide;
	}
	public void setVide(boolean vide) {
		this.vide = vide;
	}
	public Pen getPencil() {
		return pencil;
	}
	public void setPencil(Pen pencil) {
		this.pencil = pencil;
	}
}
