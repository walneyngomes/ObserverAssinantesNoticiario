package observer;

public class ConsumidorA implements ConsomeNoticia {

	private String textoNoticia;
	private int dia, mes;
	private String topico;

	@Override
	public void notificaoNoticia(String textoNoticia, int dia, int mes, String topico) {
          this.setDia(dia);
          this.setMes(mes);
          this.setTextoNoticia(textoNoticia);
          this.setTopico(topico);
	}
	

	@Override
	public void notificar() {
        System.out.println("==================================");
		System.err.println("NOTICIA URGENTE. ULTIMA HORA");
		System.err.println("NOTICIA "+this.getTextoNoticia()+" TOPICO "+this.getTopico()+" DIA: "+this.getDia()+" MES "+" "+this.getMes());
        System.err.println("==================================");
        System.err.println("==================================");
        System.err.println("==================================");
        System.err.println("=======USUARIO ConsumidorA========");
        System.err.println("");

	}

	public String getTextoNoticia() {
		return textoNoticia;
	}

	public void setTextoNoticia(String textoNoticia) {
		this.textoNoticia = textoNoticia;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String getTopico() {
		return topico;
	}

	public void setTopico(String topico) {
		this.topico = topico;
	}
	

}
