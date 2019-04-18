package observer;

import java.util.ArrayList;

public class NoticiarioJPB extends Noticiario {
	ArrayList<ConsomeNoticia> consumidores = new ArrayList<ConsomeNoticia>();

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		for (ConsomeNoticia c : consumidores) {
			c.notificaoNoticia(textoNoticia, dia, mes, topico);

		}

	}

	@Override
	public void addConsumidor(ConsomeNoticia consumidor) {
		consumidores.add(consumidor);

	}

}
