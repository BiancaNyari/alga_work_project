import java.util.Scanner;

public class UtilizandoIfEncadeado {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o peso: ");
		Double peso = scanner .nextDouble();
		
		Boolean pesoLeve = (peso <= 60.0) && (peso >= 10.0);
		Boolean pesoMedio = (peso > 60.0) && (peso <=90.0);
		Boolean pesoPesado = peso > 90.0;
		
//		if (pesoLeve) {
//			System.out.println("Lutodor(a) está na categoria de peso leve");
//		} else {
//			if (pesoMedio) {
//				System.out.println("Lutodor(a) está na categoria de peso medio");
//				
//			} else {
//				if (pesoPesado) {
//					System.out.println("Lutodor(a) está na categoria de peso pesado");
//				}
//				
//			}
//		}
		
		if (pesoLeve) {
			System.out.println("Lutodor(a) está na categoria de peso leve");
			
		} else if (pesoMedio) {
			System.out.println("Lutodor(a) está na categoria de peso médio");
			
		} else if (pesoPesado) {
			System.out.println("Lutodor(a) está na categoria de peso pesado");
			
		} else {
			System.out.println("Lutador (a) não se enquadra em nenhuma categoria");
		}
		
		
		
		
		
		
		
		
		scanner.close();
	}

}
