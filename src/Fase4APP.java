
public class Fase4APP {

	public static void main(String[] args) {
		
		String nom = "Angel", cognom1 ="Calzada", cognom2 = "Defez";
		
		String nomComplert = nom + " " + cognom1 + " " + cognom2;
		
		int dia = 28, mes = 10, anyNaixement = 1982;
		
		String dataNaixement = Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(anyNaixement);
		
		
		String fraseAnyNaixementTraspas = "El meu any de naixement es un any de traspas!!!";
		
		String fraseAnyNaixementNormal = "El meu any de naixement es un any regular sense pena ni glòria.";
		
		
		System.out.println( "El meu nom és " + nomComplert + "\n");
		
		System.out.println( "Vaig néixer el " + dataNaixement + "\n");
		
		
		// REVISAR SI L'ANY DE NAIXEMENT ES DE TRASPAS
		
		if (anyNaixement % 4 == 0)
		{
			System.out.println(fraseAnyNaixementTraspas);
		}else
		{
			System.out.println(fraseAnyNaixementNormal);
		}
		

		
		

	}

}
