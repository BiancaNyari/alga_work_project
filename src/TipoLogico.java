import java.util.Scanner;

public class TipoLogico {
	
	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		
		Boolean variavelFalsa = false;
		
		System.out.println("Vari�vel verdadeira: " + variavelVerdadeira);
		
		System.out.println("Vari�vel falsa: " + variavelFalsa);
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Exerc�cio para identificar se uma pessoa possui idade suficiente para tirar CNH");
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite sua idade: ");
		
		Integer idade = scanner .nextInt();
		
		Boolean podeTirarCNH = idade >= 18;
		
		// System.out.println("Pode tirar carteira de motorista? " + podeTirarCNH);
		
		if (podeTirarCNH) {
			System.out.println("Sim! Pode tirar a carteira de motorista");
		} else {
			System.out.println("N�o! Voc� n�o possui idade suficiente para tirar carteira de motorista");
		}
		
		
		
		
		
	}

}
