import java.util.Scanner;

public class CalculandoOQuadradoDeUmNumero {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		
		Double numeroDigitado = scanner .nextDouble();
		
		Double quadradoNumero = numeroDigitado * numeroDigitado;
		
		System.out.print("O quadrado do número " + numeroDigitado + " é igual a " + quadradoNumero);
		
		scanner.close();
		
		
	}

}
