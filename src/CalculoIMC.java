import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//IMC = PESO / (ALTURA * ALTURA)
		
		System.out.print("Digite o seu peso: ");
		
		Double peso = scanner .nextDouble();
		
		System.out.print("Digite sua altura: ");
		Double altura = scanner .nextDouble();
		
		
		Double valorFinalAltura = altura * altura;
		
		Double resultado = peso / valorFinalAltura;
		
		System.out.printf("IMC = %.2f %n ", + resultado); //Para deixar 2 casas depois da vírgula
		
		
		Boolean AbaixoDoNormal = resultado < 18.54564;
		Boolean PesoNormal = (resultado > 18.5) && (resultado < 24.9);
		Boolean ExcessoDePeso = (resultado < 25.0) && (resultado > 29.9);
		Boolean ObesidadeTipoUm = (resultado < 30.0) && (resultado > 34.9);
		Boolean ObesidadeTipoDois = (resultado < 35.0) && (resultado > 39.9);
		Boolean ObesidadeTipoTres = (resultado <= 40.0);
		
		if (AbaixoDoNormal) {
			System.out.println("Abaixo do normal");
		} else if (PesoNormal) {
			System.out.println("Peso normal");
		} else if (ExcessoDePeso) {
			System.out.println("Excesso de peso");
		} else if (ObesidadeTipoUm) {
			System.out.println("Obesidade tipo I");
		} else if (ObesidadeTipoDois) {
			System.out.println("Obesidade tipo II");
		} else if (ObesidadeTipoTres) {
			System.out.println("Obesidade tipo III");
		} 
			
		
		
		
		scanner.close();
		
		
	}

}
