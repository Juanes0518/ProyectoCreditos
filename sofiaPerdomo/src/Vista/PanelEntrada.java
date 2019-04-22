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
	private JLabel tPeriodo;
	private JLabel tInteres;
	private JLabel tInversion;
	private JTextField txtPeriodo;
	private JTextField txtInteres;
	private JTextField txtInversion;
	private JButton botonCalcular;
	public static final String CALCULAR = "Calcular";
	
	
	public PanelEntrada() {
			setLayout(new GridLayout(4,3));
		 TitledBorder border = BorderFactory.createTitledBorder("Ingrese los siguientes datos:");
		 border.setTitleColor(Color.blue);
		 setBorder(border);
		 
		tPeriodo = new JLabel("Número de cuotas");
		
		add(tPeriodo);
		
		txtPeriodo = new JTextField("");
		
		txtPeriodo.setBackground(Color.WHITE);
		txtPeriodo.setForeground(Color.BLACK);
		add(txtPeriodo);
		 add(new JLabel(""));
		
		tInteres = new JLabel("Porcentaje de interes");
		
		add(tInteres);
		
		txtInteres= new JTextField("");
		
		txtInteres.setBackground(Color.WHITE);
		txtInteres.setForeground(Color.BLACK);
		add(txtInteres);
		 add(new JLabel(""));
		
		tInversion = new JLabel("Monto de inversión");
	
		add(tInversion);
		
		txtInversion = new JTextField();
		
		txtInversion.setBackground(Color.WHITE);
		txtInversion.setForeground(Color.BLACK);
		add(txtInversion);
		 add(new JLabel(""));
		 add(new JLabel(""));
		
		botonCalcular = new JButton("Calcular");
		botonCalcular.setActionCommand(CALCULAR);
		botonCalcular.setBackground(Color.blue);
		botonCalcular.setForeground(Color.white);
		add(botonCalcular);
		 
	}
	public JLabel getEperiodo() {
		return tPeriodo;
	}
	public void setEperiodo(JLabel eperiodo) {
		this.tPeriodo = eperiodo;
	}
	public JLabel geteInteres() {
		return tInteres;
	}
	public void seteInteres(JLabel eInteres) {
		this.tInteres = eInteres;
	}
	public JLabel getEinversion() {
		return tInversion;
	}
	public void setEinversion(JLabel einversion) {
		this.tInversion = einversion;
	}
	public JTextField getPeriodo() {
		return txtPeriodo;
	}
	public void setPeriodo(JTextField periodo) {
		this.txtPeriodo = periodo;
	}
	public JTextField getInteres() {
		return txtInteres;
	}
	public void setInteres(JTextField interes) {
		this.txtInteres = interes;
	}
	public JTextField getInversion() {
		return txtInversion;
	}
	public void setInversion(JTextField inversion) {
		this.txtInversion = inversion;
	}
	public JButton getbCalcular() {
		return botonCalcular;
	}
	public void setbCalcular(JButton bCalcular) {
		this.botonCalcular = bCalcular;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static String getCalcular() {
		return CALCULAR;
	}
	
	
	
	
	

}
