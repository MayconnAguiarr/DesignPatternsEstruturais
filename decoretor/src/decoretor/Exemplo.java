package decoretor;

public class Exemplo {

	public static void main(String[] args) {
		Informacoes dados;
		dados = new InfoUsuario();

		System.out.println("sem Decorator - " + dados.obterDados());

		dados = new DecoratorLocalidade(dados);
		dados = new DecoratorBrowser(dados);
		dados = new DecoratorDispositivo(dados);

		System.out.println("com Decorator - " + dados.obterDados());
	}

}
