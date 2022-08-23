
public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		
		Boolean tresMaiorQueDois = 3 > 2;
		System.out.println("3 > 2? " + tresMaiorQueDois);
		
		Boolean tresMenorQueDois = 3 < 2;
		System.out.println("3 < 2? " + tresMenorQueDois);
		
		Boolean tresMaiorQueTres = 3 > 3;
		System.out.println("3 > 3? " + tresMaiorQueTres);
		
		Boolean tresMaiorOuIgualATres = 3 >= 3;
		System.out.println("3 >= 3? " + tresMaiorOuIgualATres);
		
		Boolean tresMenorOuIgualATres = 3 <= 3;
		System.out.println("3 <= 3? " + tresMenorOuIgualATres);
		
		Boolean tresIgualATres = 3== 3;
		System.out.println("3 == 3? " + tresIgualATres);
		
		Boolean doisDiferenteDeSete = 2 != 7;
		System.out.println("2 != ? " +  doisDiferenteDeSete );
		
		Integer quatro = 4;
		Boolean quatroMaiorQueQuatro = quatro > quatro;
		System.out.println("4 > 4 " + quatroMaiorQueQuatro);
		
		Boolean quatroIgualAQuatro = quatro.equals(quatro);
		System.out.println("quatro.equals(quatro)? " + quatro.equals(quatro));
		
		Integer seis = 6;
		Boolean seisIgualAQuatro = seis.equals(quatro);
		System.out.println("seis.equals(quatro)? " + seis.equals(quatro));
		
			
	}

}
