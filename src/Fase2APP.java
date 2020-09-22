
public class Fase2APP {

	public static void main(String[] args) {
		
		final int ANY_TRASPAS = 1948;
		
		final int PERIODE = 4;
		
		// Data de naixement recopilat de la Fase1
		int dia = 28, mes = 10, anyNaixement = 1982;
		
		float quantitatAnysTraspas = (anyNaixement - ANY_TRASPAS) / (float)PERIODE;  // Faig el cast a float per obtenir els decimals
		
		/* Si tenim un nombre fraccionari vol dir que ja hem tornat a tenir un
		 * any de traspas, per tant arodonim cal al proper enter superior. */
		System.out.println("anys de traspas dividint: " + (int) Math.ceil(quantitatAnysTraspas) );
	}

}
