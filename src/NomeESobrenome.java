import java.util.Scanner;

public class NomeESobrenome {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu primeiro nome: ");
		String primeiroNome = scanner .nextLine();
		
		System.out.print("Digite seu último nome: ");
		String ultimoNome = scanner .nextLine();
		
		System.out.print(primeiroNome + " " + ultimoNome);
		
		scanner.close();
		
				
		
	}

}
