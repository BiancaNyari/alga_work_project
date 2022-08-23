import java.util.Scanner;

public class DiaDaSemana {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o dia da semana: ");
		Integer diaDaSemana = scanner .nextInt();
		
		String nomeDiaDaSemana = "segunda-feira";
		
		switch (diaDaSemana) {
		
			case 1: nomeDiaDaSemana = "segunda-feira";
			break;
			case 2: nomeDiaDaSemana = "terça-feira";
			break;
			case 3: nomeDiaDaSemana = "quarta-feira";
			break;
			case 4: nomeDiaDaSemana = "quinta-feira";
			break;
			case 5: nomeDiaDaSemana = "sexta-feira";
			break;
			case 6: nomeDiaDaSemana = "sábado";
			break;
			case 7: nomeDiaDaSemana = "domingo";
			break;
			default: {
				System.err.println("Dia inválido!");
				System.exit(1);
				
				
				
			}
			
			
		} System.out.println("Dia da semana escolhido: " + nomeDiaDaSemana);
		
		scanner.close();
		
		
	}

}
