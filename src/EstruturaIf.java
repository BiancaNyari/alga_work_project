
public class EstruturaIf {
	
	public static void main(String[] args) {
		
		
		
		Boolean movimentaPeloMenosMetadeDoValor = true;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
		Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor && aContaTemTempoSuficienteDeAbertura && temNomeLimpo;
		
		if (liberarEmprestimo) {
			System.out.println("Sim! Pode liberar empr�stimo.");
		} else {
			System.out.println("N�o! N�o pode liberar empr�stimo");
		}
	}

}
