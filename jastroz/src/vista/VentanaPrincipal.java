package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import controlador.Controlador;

public class VentanaPrincipal extends JFrame{

	private static final long serialVersionUID = 1L;
	private PanelE panelEntrada;
	private PanelTabla panelTabla;
	private Controlador control;
	Font fuente = new Font("Rockwell",Font.BOLD,12);
	
	public final static String TOTALIZAR_CUENTA = "Entrada";
	public static final String ACTUALIZAR_TABLA = "Actualizar";
	
	public VentanaPrincipal(Controlador pControlador){
		control = pControlador;
		
		setTitle("CÁLCULO DE CRÉDITOS DE CUOTA FIJA");

		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1100,500);
		this.setFont(fuente);
		
		this.setLayout(null);
		
		panelTabla= new PanelTabla(this);
		panelTabla.getBtnTotal().addActionListener(control);
		panelTabla.setBounds(470, 20, 570, 300);
		
		panelEntrada = new PanelE(this);
		panelEntrada.getbtnTotal().addActionListener(control);
		panelEntrada.setBounds(40, 20, 400, 300);
		
		
		add(panelEntrada);
		add(panelTabla);
		
		
		
	}

	public PanelE getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelE panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public Controlador getControl() {
		return control;
	}

	public void setControl(Controlador control) {
		this.control = control;
	}

	public Font getFuente() {
		return fuente;
	}

	public void setFuente(Font fuente) {
		this.fuente = fuente;
	}

	public static String getTotalizarCuenta() {
		return TOTALIZAR_CUENTA;
	}

	public PanelTabla getPanelTabla() {
		return panelTabla;
	}

	public void setPanelTabla(PanelTabla panelTabla) {
		this.panelTabla = panelTabla;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getActualizarTabla() {
		return ACTUALIZAR_TABLA;
	}
	
	
	
	
	
	

}
