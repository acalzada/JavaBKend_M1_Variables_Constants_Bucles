
public class Fase3APP {

	public static void main(String[] args) {
		
		final int ANY_TRASPAS = 1948;
		
		final int PERIODE = 4;
		
		int anyNaixement = 1982;
		
		Boolean anyNaixementTraspas = (anyNaixement % 4 == 0);
		
		String fraseAnyNaixementTraspas = "L'any de naixement es un any de traspas!!!";
		
		String fraseAnyNaixementNormal = "L'any de naixement es un any regular sense pena ni glòria.";
		
		
		
		
		// MOSTRAR ANYS DE TRASPAS ENTRE PERIODE
		
		System.out.println("Anys de traspas entre " + ANY_TRASPAS + " i " + anyNaixement + ":\n");
		
		System.out.print(ANY_TRASPAS);
		
		for (int any = ANY_TRASPAS + PERIODE; any <= anyNaixement; any += PERIODE)
		{
			System.out.print(" , " + any);
		}
		
		System.out.println(".\n");
		
		
		
		
		// REVISAR SI L'ANY DE NAIXEMENT ES DE TRASPAS
		
		if (anyNaixementTraspas)
		{
			System.out.println(fraseAnyNaixementTraspas);
		}else
		{
			System.out.println(fraseAnyNaixementNormal);
		}
		
			
		
	}

}
