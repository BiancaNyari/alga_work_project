import java.util.Scanner;

public class CalcularValorTroco {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o valor do produto: "); 
		
		Double valorProduto = scanner .nextDouble(); //guardo vari�vel valorProduto na mem�ria/ 
		
		System.out.print("Digite o valor que o cliente entregou: "); 
		
		Double valorEntreguePeloCliente = scanner .nextDouble(); //guardo vari�vel valorEntreguePeloCliente na mem�ria
		
		Double resultado = valorEntreguePeloCliente - valorProduto; 
		
		System.out.println("Troco: " + resultado); 
		
		scanner.close();
		
		
	}

}
