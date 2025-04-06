package dbrm;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayEstatistico extends JFrame implements IDisplay{
	
	private static final long serialVersionUID = 1L;
	private JTable tabela;
    private DefaultTableModel modelo;
    private boolean conectado = true;
    private Calculador calculadora;
    
	public DisplayEstatistico() {
		calculadora = new Calculador();
		setTitle("Dados Clima");
        setSize(800, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn(" ");
        modelo.addColumn("Média");
        modelo.addColumn("Máx");
        modelo.addColumn("Mín");
        
      //Criação do botão
        JButton botaoAdicionar = new JButton("Desconectar monitor");
        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	conectado = !conectado;
            	if(conectado) {
            		botaoAdicionar.setText("Desconectar monitor");
            	}
            	else {
            		botaoAdicionar.setText("Conectar monitor");
            	}
            }
        });
        
        tabela = new JTable(modelo);
        JScrollPane painelRolagem = new JScrollPane(tabela);
        add(painelRolagem, "Center");
        add(botaoAdicionar, "South");
        setVisible(true);
	}
	
	public void updateTable(double temperatura,double humidade, double pressao) {
		calculadora.add(temperatura, humidade, pressao);
		printaTable(calculadora.calcula());
		
		}
	
	
	public void printaTable(DadosClima dados) {
		modelo.setRowCount(0);
		modelo.addRow(new Object[]{"Temperatura",dados.getTemperaturamedia(),dados.getTemperaturamax(),dados.getTemperaturamin()});
		modelo.addRow(new Object[]{"Humidade",dados.getHumidademedia(),dados.getHumidademax(),dados.getHumidademin()});
		modelo.addRow(new Object[]{"Pressão",dados.getPressaomedia(),dados.getPressaomax(),dados.getPressaomin()});
	}

	@Override
	public boolean getConectado() {
		return conectado;
	}
	
}
