package bridge;

public class ExportadorPedido implements Exportartavel {

	FormatoAquivo formato;
	
	 public ExportadorPedido(FormatoAquivo formato) {
		this.formato = formato;
	}
	
	@Override
	public void exportarDados() {
		formato.exportarValor("Primeiro valor");
		formato.exportarValor("Segundo valor");
		formato.exportarValor("Terceiro valor");
	}
}
