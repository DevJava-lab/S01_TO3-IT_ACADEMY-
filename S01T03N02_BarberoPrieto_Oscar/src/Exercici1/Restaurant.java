package Exercici1;

import java.util.Objects;

public class Restaurant {

	private String nom;
	private int puntuacio;

	public Restaurant(String nom, int puntuacio) {
		this.nom = nom;
		this.puntuacio = puntuacio;
	}
	
	@Override
	public boolean equals(Object obj) {

		Restaurant rest = (Restaurant) obj;

		if (rest.getNom().equals(nom) && rest.puntuacio == puntuacio)
			return true;
		else
			return false;

	}

	@Override
	public int hashCode() {

		return Objects.hash(nom,puntuacio);
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
	public String toString() {
		
		return "Nom restaurant= " + nom + " ,  Puntuació = " + puntuacio ;
	}

	
}
