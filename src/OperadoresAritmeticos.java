
public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		Integer adicao = 1 + 1;
		System.out.println("Adição: " + adicao);
		
		Integer subtracao = 10 - 5;
		System.out.println("Subtração: " + subtracao);
		
		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplicação: " + multiplicacao);
		
		Integer divisao = 10 / 2;
		System.out.println("Divisão: " + divisao);
		
		Integer modulo = 5 % 4;
		System.out.println("Módulo: " + modulo);
		
		System.out.println("-------------------------------------");
		System.out.println("Exemplos precedência");
		
		Integer precedencia01 = 1 + 1 *5; // Primeiro o java vai fazer a multiplicação e, depois, a soma
		System.out.println("Precedência01: " + precedencia01);
		
		Integer precedencia02 = (1 + 1) *5; // Como a soma está entre parênteses, o java resolverá a soma priemiro e, depois, a multiplicação
		System.out.println("Precedência02: " + precedencia02);
		
		Integer precedencia03 = 5 * (1 + 1); // Mesmo a soma aparecendo após a mulptiplicação, como está entre parênteses ela será resolvida primeiro
		System.out.println("Precedência03: " + precedencia03);
		
		Integer precedencia04 = 5 * (1 + 1) + 2; //Como 1 + 1 está entre parênteses, será executado primeiro, depois, pela ordem de precedênica, a multiplicação será resolvido e, por último, a adição do 2
		System.out.println("Precedência04: " + precedencia04);
		
		Integer precedencia05 = 5 * ((1 + 1) + 2); //Como 1 + 1 está entre parênteses, será executado primeiro, depois, como o java mais somar com 2, que também está entre parênteses, por último a multiplicação
		System.out.println("Precedência05: " + precedencia05);
		
		Integer precedenciaComVariaveis = precedencia05 + precedencia01;
		System.out.println("Precedência com variáveis: " + precedenciaComVariaveis);
	}

}
