import java.util.Scanner;

public class PodeSeAposentar {
	
	static final Integer idadeMinimaParaSeAposentar = 55;
	
	static final Integer tempoMinimoDeContribuicaoParaSeAposentar = 25;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		Integer idade = scanner .nextInt();
		
		System.out.println("Por quanto tempo, voc� contribuiu com a previd�ncia privada? ");
		Integer tempoDeContribuicao = scanner .nextInt();
		
				
		Boolean podeSeAposentarPelaIdade = idade >= idadeMinimaParaSeAposentar;
		
		Boolean podeSeAposentarPeloTempoDeContribuicao = tempoDeContribuicao >= tempoMinimoDeContribuicaoParaSeAposentar;
		
		Boolean verificacaoSePodeSeAposentar= podeSeAposentarPelaIdade && podeSeAposentarPeloTempoDeContribuicao;
		
		if (verificacaoSePodeSeAposentar) {
			System.out.println("Sim! Esta pessoa pode se aposentar");
		} else {
			System.out.println("N�o! Esta pessoa n�o pode se aposentar");
			
		}
		
		scanner.close();
		
		
		
		
		
		
	}





	}
		


	
		
	
			
