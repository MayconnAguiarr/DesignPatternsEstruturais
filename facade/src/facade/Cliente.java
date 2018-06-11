package facade;

public class Cliente {

	public static void main(String[] args) {		
		System.out.println(calcular());		
	}

	public static float calcular() {
		Facade facade = new Facade();
		return facade.processarViagem("Umuarama", "Maringá");
	}	
}
