package decoretor;

public class DecoratorDispositivo implements Informacoes {
	
	
	private Informacoes objetoParaDecorar;
	
	public DecoratorDispositivo (Informacoes objeto) {
		this.objetoParaDecorar = objeto;
	}

	@Override
	public String obterDados() {
		String dados = objetoParaDecorar.obterDados();
		dados += "Google Chrome v.64 ";		
		return dados;
	}
}
