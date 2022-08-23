import java.util.Scanner;

public class CalcularValorTroco {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o valor do produto: "); 
		
		Double valorProduto = scanner .nextDouble(); //guardo variável valorProduto na memória/ 
		
		System.out.print("Digite o valor que o cliente entregou: "); 
		
		Double valorEntreguePeloCliente = scanner .nextDouble(); //guardo variável valorEntreguePeloCliente na memória
		
		Double resultado = valorEntreguePeloCliente - valorProduto; 
		
		System.out.println("Troco: " + resultado); 
		
		scanner.close();
		
		
	}

}
