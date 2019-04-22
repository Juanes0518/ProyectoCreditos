package Vista;
import javax.swing.*;



import Controlador.Controlador;
import java.awt.BorderLayout;
import java.awt.Color;


public class InterfazGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 PanelEntrada panelentrada;
	 PanelResultados panelresultados;
	 PanelTabla paneltabla;
	
	public InterfazGUI(Controlador Control) {
		setSize( 700,700);
		setResizable(false);
	
	setTitle("Calculo de Creditos");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setLayout(new BorderLayout());
	panelentrada = new PanelEntrada();
	panelentrada.setBackground(Color.LIGHT_GRAY);
	add(panelentrada,BorderLayout.NORTH);
	panelresultados = new PanelResultados();
	panelresultados.setBackground(Color.LIGHT_GRAY);
	add(panelresultados,BorderLayout.CENTER);
	paneltabla = new PanelTabla();
	paneltabla.setBackground(Color.LIGHT_GRAY);
	add(paneltabla,BorderLayout.SOUTH);
	
	panelentrada.getbCalcular().addActionListener(Control);
	}
	public PanelEntrada getPanelentrada() {
		return panelentrada;
	}
	public void setPanelentrada(PanelEntrada panelentrada) {
		this.panelentrada = panelentrada;
	}
	public PanelResultados getPanelresultados() {
		return panelresultados;
	}
	public void setPanelresultados(PanelResultados panelresultados) {
		this.panelresultados = panelresultados;
	}
	public PanelTabla getPaneltabla() {
		return paneltabla;
	}
	public void setPaneltabla(PanelTabla paneltabla) {
		this.paneltabla = paneltabla;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
