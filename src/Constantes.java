import java.util.Scanner;

public class Constantes {
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_CNH = 18;
	
	public static void main(String[] args) {
				
		
		Scanner scanner = new Scanner (System.in);
		
		//final Integer idadeMinimaParaTirarCNH = 18;
		
		System.out.print("Digite sua idade: ");
		
		Integer idade = scanner .nextInt();
		
		Boolean podeTirarCNH = idade >= IDADE_MINIMA_PARA_TIRAR_CNH;
		
		// System.out.println("Pode tirar carteira de motorista? " + podeTirarCNH);
		
		if (podeTirarCNH) {
			System.out.println("Sim! Pode tirar a carteira de motorista");
		} else {
			System.out.println("Não! Você não possui idade suficiente para tirar carteira de motorista");
		}
		
		scanner.close();
	}

	
}
