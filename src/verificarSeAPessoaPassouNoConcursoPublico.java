import java.util.Scanner;

public class verificarSeAPessoaPassouNoConcursoPublico {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("Digite a nota de matemática: ");
		Double notaMatematica = scanner .nextDouble();
		
		
		System.out.println("Digite a nota de português: ");
		Double notaPortugues = scanner .nextDouble();
		
		Double somaDasNotas = notaMatematica + notaPortugues;
		System.out.println("Soma das duas notas = " + somaDasNotas);
		
		Boolean notaMinimaSomaTotalParaPassarDeAno = somaDasNotas >= 150.0;
		Boolean notaMinimaDeMatematica = notaMatematica >= 60.0;
		Boolean notaMinimaDePortugues = notaPortugues >= 60.0;
		
		Boolean podePassarDeAnoPoisTirouNotaMinimaNasProvas = notaMinimaDeMatematica && notaMinimaDePortugues;
		Boolean podePassarDeAno = podePassarDeAnoPoisTirouNotaMinimaNasProvas && notaMinimaSomaTotalParaPassarDeAno;
		
		if (podePassarDeAno) {
			System.out.println("Aluno foi aprovado!");
		} else {
			System.out.println("Aluno não foi aprovado");
		}
		
		scanner.close();
		
		
		
		
		
		
	}

}
