
public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		Integer adicao = 1 + 1;
		System.out.println("Adi��o: " + adicao);
		
		Integer subtracao = 10 - 5;
		System.out.println("Subtra��o: " + subtracao);
		
		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplica��o: " + multiplicacao);
		
		Integer divisao = 10 / 2;
		System.out.println("Divis�o: " + divisao);
		
		Integer modulo = 5 % 4;
		System.out.println("M�dulo: " + modulo);
		
		System.out.println("-------------------------------------");
		System.out.println("Exemplos preced�ncia");
		
		Integer precedencia01 = 1 + 1 *5; // Primeiro o java vai fazer a multiplica��o e, depois, a soma
		System.out.println("Preced�ncia01: " + precedencia01);
		
		Integer precedencia02 = (1 + 1) *5; // Como a soma est� entre par�nteses, o java resolver� a soma priemiro e, depois, a multiplica��o
		System.out.println("Preced�ncia02: " + precedencia02);
		
		Integer precedencia03 = 5 * (1 + 1); // Mesmo a soma aparecendo ap�s a mulptiplica��o, como est� entre par�nteses ela ser� resolvida primeiro
		System.out.println("Preced�ncia03: " + precedencia03);
		
		Integer precedencia04 = 5 * (1 + 1) + 2; //Como 1 + 1 est� entre par�nteses, ser� executado primeiro, depois, pela ordem de preced�nica, a multiplica��o ser� resolvido e, por �ltimo, a adi��o do 2
		System.out.println("Preced�ncia04: " + precedencia04);
		
		Integer precedencia05 = 5 * ((1 + 1) + 2); //Como 1 + 1 est� entre par�nteses, ser� executado primeiro, depois, como o java mais somar com 2, que tamb�m est� entre par�nteses, por �ltimo a multiplica��o
		System.out.println("Preced�ncia05: " + precedencia05);
		
		Integer precedenciaComVariaveis = precedencia05 + precedencia01;
		System.out.println("Preced�ncia com vari�veis: " + precedenciaComVariaveis);
	}

}
