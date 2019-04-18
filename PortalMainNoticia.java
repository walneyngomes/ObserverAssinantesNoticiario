package observer;

public class PortalMainNoticia {

	public static void main(String[] args) {
		// Observadores
		ConsomeNoticia consumidor1 = new ConsumidorA();
		ConsomeNoticia consumidor2 = new ConsumidorA();

		// Observados
		Noticiario jpb = new NoticiarioJPB();
		Noticiario sbt = new NoticiariaBorborema();

		jpb.addConsumidor(consumidor1);
		sbt.addConsumidor(consumidor2);
		jpb.notificaNoticia(
				"Josivaldo vende cocada em frente à UniFacisa por 1 real. Quanto custa a cocada Josivaldo vende o que?Onde está vendendo a cocada",
				31, 04, "Comida");
		sbt.notificaNoticia("Josivaldo é preso por  vender cocaina em frente à UniFacisa por 1 real.", 31, 04,
				"Comida");
		// Notificar usuarios
		System.out.println("Usuarios notificados");
		consumidor1.notificar();
		consumidor2.notificar();
	}

}
