package Vista;

import java.awt.BorderLayout;



import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel eperiodo;
	private JLabel eInteres;
	private JLabel einversion;
	private JTextField periodo;
	private JTextField interes;
	private JTextField inversion;
	private JButton bCalcular;
	public static final String CALCULAR = "Calcular";
	
	
	public PanelEntrada() {
		setLayout(new GridLayout(4,2));
		 TitledBorder border = BorderFactory.createTitledBorder("Datos entrada");
		 border.setTitleColor(Color.BLACK);
		 setBorder(border);
		 
		eperiodo = new JLabel("Ingrese el periodo");
		
		add(eperiodo);
		
		periodo = new JTextField("");
		
		periodo.setBackground(Color.WHITE);
		periodo.setForeground(Color.BLACK);
		add(periodo);
		 add(new JLabel(""));
		
		eInteres = new JLabel("Ingrese el interes");
		
		add(eInteres);
		
		interes= new JTextField("");
		
		interes.setBackground(Color.WHITE);
		interes.setForeground(Color.BLACK);
		add(interes);
		 add(new JLabel(""));
		
		einversion = new JLabel("Ingrese la inversion");
	
		add(einversion);
		
		inversion = new JTextField();
		
		inversion.setBackground(Color.WHITE);
		inversion.setForeground(Color.BLACK);
		add(inversion);
		 add(new JLabel(""));
		 add(new JLabel(""));
		 add(new JLabel(""));
		
		bCalcular = new JButton("CALCULAR");
		bCalcular.setActionCommand(CALCULAR);
		add(bCalcular);
		 
	}
	public JLabel getEperiodo() {
		return eperiodo;
	}
	public void setEperiodo(JLabel eperiodo) {
		this.eperiodo = eperiodo;
	}
	public JLabel geteInteres() {
		return eInteres;
	}
	public void seteInteres(JLabel eInteres) {
		this.eInteres = eInteres;
	}
	public JLabel getEinversion() {
		return einversion;
	}
	public void setEinversion(JLabel einversion) {
		this.einversion = einversion;
	}
	public JTextField getPeriodo() {
		return periodo;
	}
	public void setPeriodo(JTextField periodo) {
		this.periodo = periodo;
	}
	public JTextField getInteres() {
		return interes;
	}
	public void setInteres(JTextField interes) {
		this.interes = interes;
	}
	public JTextField getInversion() {
		return inversion;
	}
	public void setInversion(JTextField inversion) {
		this.inversion = inversion;
	}
	public JButton getbCalcular() {
		return bCalcular;
	}
	public void setbCalcular(JButton bCalcular) {
		this.bCalcular = bCalcular;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static String getCalcular() {
		return CALCULAR;
	}
	
	
	
	
	

}
