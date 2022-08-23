import java.util.Scanner;

public class AlterandoValorVariavel {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner .nextDouble();
		
		System.out.print("Forma de pagamento: [1] À vista / [2] Parcelado. Digite a opção desejada: ");
		Integer formaPagamento = scanner .nextInt();
		
		Boolean pagamentoAVista = formaPagamento.equals(1); // se forma pagamento for 1, então pagamentoAVista é true
		
		Double juros = 0.0; 
		
		if (pagamentoAVista) { //se pagamentoAVista for true, nada acontecerá.
			
		} else {
			juros = 10.0; //se pagamentoAVista for false, o valorProduto terá um juros de 10% 
		} // O valor da variável juros foi alterada, de 0.0 para 10.0, mas só precisei informar o tipo da variável quando a declarei. 
		
		Double acrescimo = valorProduto * juros / 100; //Regra de três = 100% equivale ao valor do produto, sem jutos, com juros de 10% quanto vale meu produto?
		
		Double valorFinal = valorProduto + acrescimo;
		
		System.out.println("O valor final do produto é: " + valorFinal);
		
		scanner.close();
	}
	

}
