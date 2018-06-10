package decoretor;

public class DecoratorBrowser implements Informacoes {
	
	
	private Informacoes objetoParaDecorar;
	
	public DecoratorBrowser (Informacoes objeto) {
		this.objetoParaDecorar = objeto;
	}

	@Override
	public String obterDados() {
		String dados = objetoParaDecorar.obterDados();
		dados += "NotBook - Windows 10 ";		
		return dados;
	}
}
