package bridge;

public class FormatoJson implements FormatoAquivo {

	@Override
	public void exportarValor(String valor) {
		// Exportar o valor para uma tabela
		System.out.println("Formato Json - " + valor);
	}

	@Override
	public void salvarArquivo() {
		System.out.println("Json");
	}

}
