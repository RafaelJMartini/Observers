package dbrm;

import java.util.ArrayList;
import java.util.Collections;
public class Calculador {
	
	private ArrayList<Double>temperaturas;
	private ArrayList<Double>humidades;
	private ArrayList<Double>pressoes;
	
	public Calculador() {
		temperaturas = new ArrayList<Double>();
		humidades = new ArrayList<Double>();
		pressoes = new ArrayList<Double>();
	}
	
	public void add(double temperatura, double humidade, double pressao) {
		temperaturas.add(temperatura);
		humidades.add(humidade);
		pressoes.add(pressao);
	}
	
	public DadosClima calcula() {
		double temperaturamedia = 0;
		double humidademedia = 0;
		double pressaomedia = 0;
		double temperaturamax = 0;
		double humidademax = 0;
		double pressaomax = 0;
		double temperaturamin = 0; 
		double humidademin = 0;
		double pressaomin = 0;
		//Medias
        for (double temperatura : temperaturas) {
            temperaturamedia += temperatura;
        }
        temperaturamedia = temperaturamedia / temperaturas.size();
        
        for (double humidade : humidades) {
            humidademedia += humidade;
        }
        humidademedia = humidademedia / humidades.size();
        
        for (double pressao : pressoes) {
            pressaomedia += pressao;
        }
        pressaomedia = pressaomedia / pressoes.size();
		
        //Máximas
		temperaturamax = Collections.max(temperaturas);
		humidademax = Collections.max(humidades);
		pressaomax = Collections.max(pressoes);
		
		//Mínimas
		temperaturamin = Collections.min(temperaturas);
		humidademin = Collections.min(humidades);
		pressaomin = Collections.min(pressoes);
        
		return new DadosClima(temperaturamedia, humidademedia, pressaomedia, temperaturamax,humidademax, pressaomax, temperaturamin, humidademin, pressaomin);
		
	}
	
}
