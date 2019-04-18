package observer;

public abstract class Noticiario {

	public abstract void notificaNoticia(String textoNoticia, int dia, int mes, String topico);

	public abstract void addConsumidor(ConsomeNoticia consumidor);
}
