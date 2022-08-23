import java.util.Scanner;

public class AlterandoValorVariavel {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner .nextDouble();
		
		System.out.print("Forma de pagamento: [1] � vista / [2] Parcelado. Digite a op��o desejada: ");
		Integer formaPagamento = scanner .nextInt();
		
		Boolean pagamentoAVista = formaPagamento.equals(1); // se forma pagamento for 1, ent�o pagamentoAVista � true
		
		Double juros = 0.0; 
		
		if (pagamentoAVista) { //se pagamentoAVista for true, nada acontecer�.
			
		} else {
			juros = 10.0; //se pagamentoAVista for false, o valorProduto ter� um juros de 10% 
		} // O valor da vari�vel juros foi alterada, de 0.0 para 10.0, mas s� precisei informar o tipo da vari�vel quando a declarei. 
		
		Double acrescimo = valorProduto * juros / 100; //Regra de tr�s = 100% equivale ao valor do produto, sem jutos, com juros de 10% quanto vale meu produto?
		
		Double valorFinal = valorProduto + acrescimo;
		
		System.out.println("O valor final do produto �: " + valorFinal);
		
		scanner.close();
	}
	

}
