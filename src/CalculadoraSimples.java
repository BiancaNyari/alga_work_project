import java.util.Scanner;

public class CalculadoraSimples {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		Double primeiroNumero = scanner .nextDouble();
		
		System.out.print("Escolha qual opera��o a calculadora dever� fazer: [1] Adi��o / [2] Subtra��o / [3] Multiplica��o / [4] Divis�o: ");
		Integer operador = scanner .nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
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
