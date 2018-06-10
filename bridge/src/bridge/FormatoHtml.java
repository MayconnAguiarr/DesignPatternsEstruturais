package bridge;

public class FormatoHtml implements FormatoAquivo{

	@Override
	public void exportarValor(String valor) {
		// Exportar o valor para uma tabela HTML
		System.out.println("Formato HTML - " + valor);
	}

	@Override
	public void salvarArquivo() {
		System.out.println("Salvar arquivo HTML");
	}

}
