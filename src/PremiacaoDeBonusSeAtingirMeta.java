import java.util.Scanner;

public class PremiacaoDeBonusSeAtingirMeta {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite a meta de faturamento do ano anterior: ");
		Double metaDeFaturamentoDoAnoAnterior = scanner .nextDouble();
		
		System.out.println("Digite o valor real de faturamento do ano anterior");
		Double valorRealDeFaturamentoDoAnoAnterior = scanner .nextDouble();
		
		System.out.println("Digite a m�dia sal�rio do funcion�rio no ano anterior: ");
		Double mediaSalarialDoFuncionarioNoAnoAnterior = scanner .nextDouble();
		
		Boolean paraReceberBonusDaMediaSalarialDoAnoAnterior = valorRealDeFaturamentoDoAnoAnterior >= metaDeFaturamentoDoAnoAnterior;
		
		Boolean paraReceber80PorCentoDaMediaSalarialDoAnoAnterior = (valorRealDeFaturamentoDoAnoAnterior < metaDeFaturamentoDoAnoAnterior) 
				&& (valorRealDeFaturamentoDoAnoAnterior >= ((valorRealDeFaturamentoDoAnoAnterior * 80) / 100));
		
		if (paraReceberBonusDaMediaSalarialDoAnoAnterior) {
			System.out.println("Valor pr�mio ser�: " + mediaSalarialDoFuncionarioNoAnoAnterior);
		} else if (paraReceber80PorCentoDaMediaSalarialDoAnoAnterior) {
			System.out.println("Valor do pr�mio ser�: " + ((mediaSalarialDoFuncionarioNoAnoAnterior * 80) / 100));
		} else {
			System.out.println("Os crit�rios necess�rios n�o foram atingidos.");
		}
		
		scanner.close();
		
	}

}
