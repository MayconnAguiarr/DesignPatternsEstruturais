package bridge;

public class Bridge {

	private static ExportadorPedido pedidoSelecionado;

	public static void main(String[] args) {

		pedidoSelecionado = new ExportadorPedido(new FormatoHtml());
		pedidoSelecionado.exportarDados();

		System.out.println();
		System.out.println();

		pedidoSelecionado = new ExportadorPedido(new FormatoJson());
		pedidoSelecionado.exportarDados();
	}
}
