package Exercici2;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		SortedSet<Restaurant> llistaOrdenada = new TreeSet<>();

		Restaurant restaurant1 = new Restaurant("CosaNostra", 5);
		Restaurant restaurant2 = new Restaurant("Salamanca", 8);
		Restaurant restaurant3 = new Restaurant("MariCel", 4);
		Restaurant restaurant4 = new Restaurant("Montanyà", 6);
		Restaurant restaurant5 = new Restaurant("CosaNostra", 7);
		Restaurant restaurant6 = new Restaurant("MariCel", 4);
		Restaurant restaurant7 = new Restaurant("Olimpic", 4);


		llistaOrdenada.add(restaurant1);
		llistaOrdenada.add(restaurant2);
		llistaOrdenada.add(restaurant3);
		llistaOrdenada.add(restaurant4);
		llistaOrdenada.add(restaurant5);
		llistaOrdenada.add(restaurant6);
		llistaOrdenada.add(restaurant7);
		
		
		Iterator<Restaurant> it = llistaOrdenada.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}
}
