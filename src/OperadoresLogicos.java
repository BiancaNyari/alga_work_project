
public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		Boolean carrinhoMaiorQue100 = true;
		Boolean periodoDePromocao = false;
		Boolean jaFezCompraNaLoja = true;
		Boolean pagamentoAVista = true;
		
		//Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao; //Só quero aplicar desconto se o carrinho foi maior que 100,00 e se estiver em período de promoção

		
		//Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
		
		//Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao && jaFezCompraNaLoja;
		
		//Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao || jaFezCompraNaLoja;
		
		//Boolean aplicarDesconto = carrinhoMaiorQue100 && (periodoDePromocao || jaFezCompraNaLoja); //primeiro valida se carrinho maior que 100 é true, depois valida se está no período de compra ou já fez compra na loja
		
		Boolean aplicarDesconto = carrinhoMaiorQue100 && (periodoDePromocao || jaFezCompraNaLoja) & pagamentoAVista;
		
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplicar desconto");
		} else {
			System.out.println("Não! Não aplicar desconto");
		}
	
	
	}
	
		

}
