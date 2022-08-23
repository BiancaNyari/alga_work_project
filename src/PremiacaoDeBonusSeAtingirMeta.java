import java.util.Scanner;

public class PremiacaoDeBonusSeAtingirMeta {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite a meta de faturamento do ano anterior: ");
		Double metaDeFaturamentoDoAnoAnterior = scanner .nextDouble();
		
		System.out.println("Digite o valor real de faturamento do ano anterior");
		Double valorRealDeFaturamentoDoAnoAnterior = scanner .nextDouble();
		
		System.out.println("Digite a média salário do funcionário no ano anterior: ");
		Double mediaSalarialDoFuncionarioNoAnoAnterior = scanner .nextDouble();
		
		Boolean paraReceberBonusDaMediaSalarialDoAnoAnterior = valorRealDeFaturamentoDoAnoAnterior >= metaDeFaturamentoDoAnoAnterior;
		
		Boolean paraReceber80PorCentoDaMediaSalarialDoAnoAnterior = (valorRealDeFaturamentoDoAnoAnterior < metaDeFaturamentoDoAnoAnterior) 
				&& (valorRealDeFaturamentoDoAnoAnterior >= ((valorRealDeFaturamentoDoAnoAnterior * 80) / 100));
		
		if (paraReceberBonusDaMediaSalarialDoAnoAnterior) {
			System.out.println("Valor prêmio será: " + mediaSalarialDoFuncionarioNoAnoAnterior);
		} else if (paraReceber80PorCentoDaMediaSalarialDoAnoAnterior) {
			System.out.println("Valor do prêmio será: " + ((mediaSalarialDoFuncionarioNoAnoAnterior * 80) / 100));
		} else {
			System.out.println("Os critérios necessários não foram atingidos.");
		}
		
		scanner.close();
		
	}

}
