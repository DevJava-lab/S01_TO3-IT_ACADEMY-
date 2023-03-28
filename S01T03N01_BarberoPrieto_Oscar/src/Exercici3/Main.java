package Exercici3;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Map<String, String> llista_Pais_Capital = createMapFromFile("countries.txt");

		String resultat=test(llista_Pais_Capital);
		
		crearArxiu("classificacio.txt", resultat);

	}

	public static void crearArxiu(String nom, String resultat) {

		File arxiu;
		FileWriter escriure;

		try {

			arxiu = new File(nom);

			if (arxiu.createNewFile()) {
				System.out.println("L' arxiu s'ha creat correctament.");

				escriure = new FileWriter(nom);
				escriure.write(resultat);
				escriure.close();
			}
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
	
	// Mètode principal del exercici
	
	public static String test(Map<String, String> nom) {

		String usuari = introWord("Quin és el teu nom ? :");
		int encerts = 0;

		for (int i = 1; i <= 10; i++) {

			String pais = randomMap(nom);
			String resposta = introWord("Pots indicar la capital de " + pais + " : ");

			// Convertir primera lletra resposta en majúscula;

			String validar = resposta.substring(0, 1).toUpperCase() + resposta.substring(1);

			if (validar.equals(nom.get(pais))) {

				encerts++;
			}
		}

		String resultat = String.valueOf(encerts);

		return "Hola, " + usuari + ". Has aconseguit " + resultat + " punts.";

	}

	// Mètode return key aleatòria d'un HashMap

	public static String randomMap(Map<String, ?> nom) {

		Random rand = new Random();

		List<String> keysList = new ArrayList<>(nom.keySet());

		String randomKey = keysList.get(rand.nextInt(keysList.size()));

		return randomKey;

	}

	// Mètode return HashMap d'una llista .txt

	public static HashMap<String, String> createMapFromFile(String archivo) {

		String cadena;
		ArrayList<String> llista = new ArrayList<String>();
		Map<String, String> llistaMap = new HashMap<String, String>();

		try {

			FileReader lector = new FileReader(archivo);
			BufferedReader text = new BufferedReader(lector);

			// Crear Arraylist a partir de les línies del .txt

			while ((cadena = text.readLine()) != null) {

				String[] paraula = cadena.split("\n");

				for (String p : paraula) {

					llista.add(p);

				}

			}

			// Separar Strings de cada línia i introduir al HashMap

			for (String elemento : llista) {

				String[] datos = elemento.split(" ");
				llistaMap.put(datos[0], datos[1]);

			}

			text.close();
			lector.close();

		} catch (FileNotFoundException e) {

			System.out.println("Error : " + e.getMessage());

		} catch (IOException e) {

			System.out.println("Error : " + e.getMessage());

		}
		return (HashMap<String, String>) llistaMap;
	}

	// Metòde obtenir resposta

	public static String introWord(String missatge) {
		Scanner sc = new Scanner(System.in);
		System.out.println(missatge);
		return sc.next();
	}

}
