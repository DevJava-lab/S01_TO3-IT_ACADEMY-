package Exercici2;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		List<Integer> llista1 = new ArrayList<>();
		List<Integer> llista2 = new ArrayList<>();

		llista1.add(1);
		llista1.add(2);
		llista1.add(3);
		llista1.add(4);
		llista1.add(5);

		ListIterator<Integer> it = llista1.listIterator(llista1.size());

		while (it.hasPrevious()) {

			llista2.add(it.previous());
		}

		System.out.println("Llista 1 : " + llista1);
		System.out.println("Llista 2 : " + llista2);
	}

}
