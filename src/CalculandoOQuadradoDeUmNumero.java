import java.util.Scanner;

public class CalculandoOQuadradoDeUmNumero {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite um n�mero: ");
		
		Double numeroDigitado = scanner .nextDouble();
		
		Double quadradoNumero = numeroDigitado * numeroDigitado;
		
		System.out.print("O quadrado do n�mero " + numeroDigitado + " � igual a " + quadradoNumero);
		
		scanner.close();
		
		
	}

}
