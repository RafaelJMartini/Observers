package dbrm;

public interface IDisplay {
	abstract boolean getConectado();
	abstract void updateTable(double temperatura,double humidade, double pressao);
}
