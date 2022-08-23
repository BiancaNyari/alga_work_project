import java.util.Scanner;

public class NotaAluno {
	
	static final Integer NOTA_MINIMA_PARA_SER_APROVADO = 7;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite a nota do aluno: ");
		Integer notaAluno = scanner .nextInt();
		
		
		
		Boolean alunoPassouDeAno = notaAluno >= NOTA_MINIMA_PARA_SER_APROVADO;
		
		if (alunoPassouDeAno) {
			System.out.println("Este aluno(a) tirou nota acima de 7.0, portanto está aprovado (a).");
			
		}  else {
			System.out.println("Este aluno(a) não tirou nota acima de 7.0, portanto está reprovado(a)");
		}
		
		scanner.close();
	}
	

}
