package dbrm;

public class DadosClima {
	private double temperaturamedia;
	private double humidademedia;
	private double pressaomedia;
	private double temperaturamax;
	private double humidademax;
	private double pressaomax;
	private double temperaturamin;
	private double humidademin;
	private double pressaomin;
	
	public double getTemperaturamedia() {
		return temperaturamedia;
	}

	public double getHumidademedia() {
		return humidademedia;
	}

	public double getPressaomedia() {
		return pressaomedia;
	}

	public double getTemperaturamax() {
		return temperaturamax;
	}

	public double getHumidademax() {
		return humidademax;
	}

	public double getPressaomax() {
		return pressaomax;
	}

	public double getTemperaturamin() {
		return temperaturamin;
	}

	public double getHumidademin() {
		return humidademin;
	}

	public double getPressaomin() {
		return pressaomin;
	}

	public DadosClima(double temperaturamedia, double humidademedia, double pressaomedia, double temperaturamax,
			double humidademax, double pressaomax, double temperaturamin, double humidademin, double pressaomin) {
		super();
		this.temperaturamedia = temperaturamedia;
		this.humidademedia = humidademedia;
		this.pressaomedia = pressaomedia;
		this.temperaturamax = temperaturamax;
		this.humidademax = humidademax;
		this.pressaomax = pressaomax;
		this.temperaturamin = temperaturamin;
		this.humidademin = humidademin;
		this.pressaomin = pressaomin;
	}
	
	
}

