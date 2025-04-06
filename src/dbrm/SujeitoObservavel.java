package dbrm;

public interface SujeitoObservavel {
	public void registraObservador(Observador o);
	public void removeObservador(Observador o);
	public void notificaObservadores();
	public void dadosMudaram();
}