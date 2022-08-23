import java.util.Scanner;

public class CalculoGastoFamiliar {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Luz: ");
		Double luz = scanner .nextDouble();
		
		Double total = luz;
		System.out.println("Total: " + total);
		
		System.out.print("Água: ");
		Double agua = scanner .nextDouble();
		
		total += agua;
		System.out.println("Total: " + total);
		
		System.out.print("Telefone: ");
		Double telefone = scanner .nextDouble();
		
		total += telefone;
		System.out.println("Total: " + total);
		
		System.out.print("Escola do filho: ");
		Double escolaFilho = scanner .nextDouble();
		
		total += escolaFilho;
		System.out.println("Total: " + total);
		
		System.out.print("Fatura do cartão de crédito: ");
		Double cartaoDeCredito = scanner .nextDouble();
		
		total += cartaoDeCredito;
		System.out.println("Total: " + total);
		
		System.out.print("Supermercado: ");
		Double supermercado = scanner .nextDouble();
		
		total += supermercado;
		System.out.println("O gasto total foi de: " + total);
		
		scanner.close();
		
		
		
		
		
		
		
		
		
	}

}
