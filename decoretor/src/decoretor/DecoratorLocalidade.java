package decoretor;

public class DecoratorLocalidade implements Informacoes {
	
	
	private Informacoes objetoParaDecorar;
	
	public DecoratorLocalidade (Informacoes objeto) {
		this.objetoParaDecorar = objeto;
	}

	@Override
	public String obterDados() {
		String dados = objetoParaDecorar.obterDados();
		dados += "Umuarama / PR ";		
		return dados;
	}
}
