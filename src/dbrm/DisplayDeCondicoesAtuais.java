package dbrm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DisplayDeCondicoesAtuais extends JFrame implements IDisplay{
	private static final long serialVersionUID = 1L;
	private JTable tabela;
    private DefaultTableModel modelo;
    private boolean conectado;
    
	public DisplayDeCondicoesAtuais() {
		
		conectado = true;
		setTitle("Dados Clima");
        setSize(800, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
		
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
        setarTable();
        add(botaoAdicionar, "South");
        setVisible(true);
	}
	
	public void setarTable() {
        modelo = new DefaultTableModel();
        modelo.addColumn("Temperatura");
        modelo.addColumn("Umidade");
        modelo.addColumn("Pressão");
        
        tabela = new JTable(modelo);
        JScrollPane painelRolagem = new JScrollPane(tabela);
        add(painelRolagem, "Center");
    }
	
    public void updateTable(double temperatura, double humidade, double pressao) {
    	modelo.addRow(new Object[]{temperatura,humidade,pressao});
    }
    
    public boolean getConectado() {
    	return conectado;
    }
}
