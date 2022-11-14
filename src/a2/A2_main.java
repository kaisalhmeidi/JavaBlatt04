package a2;

public class A2_main {
	/*
	 * Start des Deklarationsbereichs. Achten Sie unbedingt darauf, dass vor jeder
	 * Variablendeklaration das Schluesselwort static steht.
	 */
		static int[] numbers; 
		static int d;
	
	/*
	 * Ende des Deklarationsbereichs.
	 */

	public static void main(String[] args) {
		/*
		 * Start des algorithmischen Bereichs.
		 */
		d = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			d = d + numbers[i]; 
		}
		
		d = (d/numbers.length);
		
		
		/*
		 * Hier endet der algorithmische Bereich. Dieser Kommentar und damit alles, was
		 * darunter steht, darf verschoben werden (wenn Sie zum Beispiel mehr Zeilen
		 * brauchen).
		 * 
		 * Alles, was hinter diesem Kommentar steht, darf nicht veraendert werden!
		 * 
		 */

		System.out.println("Durchschnittswert: " + d);
	}

}
