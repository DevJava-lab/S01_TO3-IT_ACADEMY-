package Exercici2;


public class Restaurant implements Comparable<Restaurant> {

	private String nom;
	private int puntuacio;

	public Restaurant(String nom, int puntuacio) {
		this.nom = nom;
		this.puntuacio = puntuacio;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	@Override
	public int compareTo(Restaurant o) {

		if (nom.compareTo(o.getNom()) != 0)
			return nom.compareTo(o.getNom());
		else
			return o.getPuntuacio()-puntuacio;
	}

	@Override
	public String toString() {

		return "Nom restaurant= " + nom + " ,  Puntuació = " + puntuacio;
	}

}
