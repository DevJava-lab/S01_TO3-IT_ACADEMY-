package Exercici1;

import java.util.*;

public class Main {

	public static void main(String[] args) {


		Month gener=new Month("Gener");
		Month febrer=new Month("Febrer");
		Month març=new Month("Març");
		Month abril=new Month("Abril");
		Month maig=new Month("Maig");
		Month juny=new Month("Juny");
		Month juliol=new Month("Juliol");
		Month setembre=new Month("Setembre");
		Month octubre=new Month("Octubre");
		Month novembre=new Month("Novembre");
		Month desembre=new Month("Desembre");

		ArrayList<Month> llistaMesos = new ArrayList<Month>();
		
		llistaMesos.add(gener);
		llistaMesos.add(febrer);
		llistaMesos.add(març);
		llistaMesos.add(abril);
		llistaMesos.add(maig);
		llistaMesos.add(juny);
		llistaMesos.add(juliol);
		llistaMesos.add(setembre);
		llistaMesos.add(octubre);
		llistaMesos.add(novembre);
		llistaMesos.add(desembre);
		
		// Insertar el mes Agost a la seva posició dins l'Arraylist
		
		Month agost= new Month("Agost");
		llistaMesos.add(7, agost);

		// Recorrer ArrayList

		for (Month mes : llistaMesos) {

			System.out.println(mes.getName());
		}

		// Insertar objectes repetits

		llistaMesos.add(març);
		llistaMesos.add(setembre);
	

		// Convertir ArrayList a HashSet

		Set<Month> hashMesos = new HashSet<>(llistaMesos);

		// Recorrer HashSet amb  For
		
		System.out.println("-----------------------------");
		
		for (Month mes : hashMesos) {

			System.out.println(mes.getName());
		}

		// Recorrer HashSet amb  Iterador
		
		System.out.println("-----------------------------");
		
		Iterator<Month> it = hashMesos.iterator();

		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}


	}

}
