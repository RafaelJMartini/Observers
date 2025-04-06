package dbrm;

public class Observador {
	
	private int id;
	private double temperatura;
	private double humidade;
	private double pressao;
	private IDisplay iGrafica;
	
	public Observador(IDisplay iGrafica) {
		this.iGrafica = iGrafica;
	}

	public void atualizar(double temperatura, double humidade, double pressao) {
		if(iGrafica.getConectado()) {
		this.temperatura = temperatura;
		this.humidade = humidade;
		this.pressao = pressao;
		iGrafica.updateTable(temperatura,humidade,pressao);
		}
	}

	public int getId() {
		return id;
	}
	public double getTemperaturaAtual() {
		return temperatura;
	}
	public double getHumidadeAtual() {
		return humidade;
	}

	public double getPressaoAtual() {
		return pressao;
	}
}
