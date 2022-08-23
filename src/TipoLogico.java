import java.util.Scanner;

public class TipoLogico {
	
	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		
		Boolean variavelFalsa = false;
		
		System.out.println("Variável verdadeira: " + variavelVerdadeira);
		
		System.out.println("Variável falsa: " + variavelFalsa);
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Exercício para identificar se uma pessoa possui idade suficiente para tirar CNH");
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite sua idade: ");
		
		Integer idade = scanner .nextInt();
		
		Boolean podeTirarCNH = idade >= 18;
		
		// System.out.println("Pode tirar carteira de motorista? " + podeTirarCNH);
		
		if (podeTirarCNH) {
			System.out.println("Sim! Pode tirar a carteira de motorista");
		} else {
			System.out.println("Não! Você não possui idade suficiente para tirar carteira de motorista");
		}
		
		
		
		
		
	}

}
