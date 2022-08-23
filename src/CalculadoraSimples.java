import java.util.Scanner;

public class CalculadoraSimples {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o primeiro número: ");
		Double primeiroNumero = scanner .nextDouble();
		
		System.out.print("Escolha qual operação a calculadora deverá fazer: [1] Adição / [2] Subtração / [3] Multiplicação / [4] Divisão: ");
		Integer operador = scanner .nextInt();
		
		System.out.print("Digite o segundo número: ");
		Double segundoNumero = scanner .nextDouble();
		
		Double resultado = null;		
		
		
		if (operador.equals(1)) {
			resultado = primeiroNumero + segundoNumero;
		} 
		
		if (operador.equals(2)) {
			resultado = primeiroNumero - segundoNumero;	
		}
		
		if (operador.equals(3)) {
			resultado = primeiroNumero * segundoNumero;
		}
		
		if (operador.equals(4)) {
			resultado = primeiroNumero / segundoNumero;
		}
		
		System.out.println("Resultado = " + resultado);
		
		
		
		
		
		
		
		scanner.close();
	}

}
