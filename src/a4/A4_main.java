package a4;

//Start Importbereich, nicht aendern, nicht loeschen
import java.util.Arrays;
//Ende Importbereich

public class A4_main {
	/*
	 * Start des Deklarationsbereichs. Achten Sie unbedingt darauf, dass vor jeder
	 * Variablendeklaration das Schluesselwort static steht.
	 */
		static double einheiten[][] = {{500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};  
		static double input = 62.79;
		
	
	
	/*
	 * Ende des Deklarationsbereichs.
	 */

	public static void main(String[] args) {
		/*
		 * Start des algorithmischen Bereichs.
		 */
		for (int i = 0; i < einheiten[0].length;i++) {
			if(Math.abs(input - einheiten[0][i]) < 0.00001 || input>= einheiten[0][i]){
				einheiten[1][i]++;  
				input = input - einheiten[0][i];
				i--;
			}
		}
		
		
		
		/*
		 * Hier endet der algorithmische Bereich. Dieser Kommentar und damit alles, was
		 * darunter steht, darf verschoben werden (wenn Sie zum Beispiel mehr Zeilen
		 * brauchen).
		 * 
		 * Alles, was hinter diesem Kommentar steht, darf nicht veraendert werden!
		 * 
		 */

		System.out.println("Betraege: " + Arrays.toString(einheiten[0]));
		System.out.println("Anzahl: " + Arrays.toString(einheiten[1]));

	}

}
