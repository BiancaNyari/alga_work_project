import java.util.Scanner;

public class ValorTotalBaseadoNaQuantidade {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valorProduto = scanner .nextDouble();
		
		System.out.println("Digite a quantidade do produto: ");
		Integer quantidadeProduto = scanner .nextInt();
		
		Double subtotal = valorProduto * quantidadeProduto;
		
		Double desconto = 0.0;
		
		Boolean terDesconto = quantidadeProduto > 10;
		
		if (terDesconto) {
			desconto = 10.0;
			
		} else {
			
		}
		
		Double  valorASerSubtraido= subtotal * desconto / 100; // Cálculo para saber qual o valor que será descontado
		
		Double valorFinal = subtotal - valorASerSubtraido;
		
		System.out.println("O valor total do produto será: " + valorFinal);
	
		
		scanner.close();
	}

}
