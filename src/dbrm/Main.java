package dbrm;

public class Main {

	public Main() {
		EquipamentoDeMonitoramento maquinaMonitoramento = new EquipamentoDeMonitoramento();
		MonitorDeDadosDoClima monitorDeDados = new MonitorDeDadosDoClima(maquinaMonitoramento);
		maquinaMonitoramento.setMonitorDadosClima(monitorDeDados);
		
		//Criar observadores:
		monitorDeDados.registraObservador(new Observador(new DisplayDeCondicoesAtuais()));
		monitorDeDados.registraObservador(new Observador(new DisplayEstatistico()));
		//Coletar dados:
		try {
			maquinaMonitoramento.coletar();
		} catch (InterruptedException e) {
			;
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
