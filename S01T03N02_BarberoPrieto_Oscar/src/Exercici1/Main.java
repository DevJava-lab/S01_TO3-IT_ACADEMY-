package Exercici1;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Set<Restaurant> llistaRestaurants = new HashSet<>();

		Restaurant restaurant1 = new Restaurant("CosaNostra", 7);
		Restaurant restaurant2 = new Restaurant("Salamanca", 8);
		Restaurant restaurant3 = new Restaurant("MariCel", 4);
		Restaurant restaurant4 = new Restaurant("Montanyà", 6);
		Restaurant restaurant5 = new Restaurant("CosaNostra", 5);
		Restaurant restaurant6 = new Restaurant("MariCel", 4);
		Restaurant restaurant7 = new Restaurant("Olimpic", 4);

		llistaRestaurants.add(restaurant1);
		llistaRestaurants.add(restaurant2);
		llistaRestaurants.add(restaurant3);
		llistaRestaurants.add(restaurant4);
		llistaRestaurants.add(restaurant5);
		llistaRestaurants.add(restaurant6);
		llistaRestaurants.add(restaurant7);
		
		Iterator<Restaurant> it = llistaRestaurants.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

	}
}