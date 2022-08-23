import java.util.Scanner;

public class DescontoFreteComprasAcimaCemReais {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner .nextDouble();
		
		Double frete = 15.00;
		
		if (valorProduto < 100) {
			
			System.out.println("Valor final " + (valorProduto + frete));
		} else {
			System.out.println("Valor Final  " + valorProduto);
		}
		
				
						
		
		
		
		
		
		
		
		
		scanner.close();
		
	}

}
