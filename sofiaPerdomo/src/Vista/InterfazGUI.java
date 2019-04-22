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
public PanelEntrada getPanelEntrada() {
	return panelentrada;
}
public void setPanelEntrada(PanelEntrada panelEntrada) {
	this.panelentrada = panelEntrada;
}
public PanelTabla getPanelTabla() {
	return paneltabla;
}
public void setPanelTabla(PanelTabla panelResultados) {
	this.paneltabla = panelResultados;
}
public PanelResultados getPanelResultados() {
	return panelresultados;
}
public void setPanelResultados(PanelResultados panelResultados) {
	this.panelresultados = panelResultados;
}
}