package facade;

public class Facade {
	
	public float processarViagem(String ponto1, String ponto2) {
		int distancia;
		float calculo;
		
		SubSystemDistancia rotina1 = new SubSystemDistancia();
		SubSystemCaculo rotina2 = new SubSystemCaculo();
		SubSystemHistorico rotina3 = new SubSystemHistorico();
		
		distancia = rotina1.consultarDistancia(ponto1, ponto2);
		calculo = rotina2.calcularViagem(distancia);
		rotina3.registrarHistorico(ponto1, ponto2, calculo);
		
		return calculo;		
	}
}
