
public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		Boolean carrinhoMaiorQue100 = true;
		Boolean periodoDePromocao = false;
		Boolean jaFezCompraNaLoja = true;
		Boolean pagamentoAVista = true;
		
		//Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao; //S� quero aplicar desconto se o carrinho foi maior que 100,00 e se estiver em per�odo de promo��o

		
		//Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
		
		//Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao && jaFezCompraNaLoja;
		
		//Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao || jaFezCompraNaLoja;
		
		//Boolean aplicarDesconto = carrinhoMaiorQue100 && (periodoDePromocao || jaFezCompraNaLoja); //primeiro valida se carrinho maior que 100 � true, depois valida se est� no per�odo de compra ou j� fez compra na loja
		
		Boolean aplicarDesconto = carrinhoMaiorQue100 && (periodoDePromocao || jaFezCompraNaLoja) & pagamentoAVista;
		
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplicar desconto");
		} else {
			System.out.println("N�o! N�o aplicar desconto");
		}
	
	
	}
	
		

}
