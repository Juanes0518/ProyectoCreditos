package vista;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelE extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel lbTasaEfectiva;

	private JLabel lbPeriodo;
	
	private JLabel lbInteres;
	
	private JLabel lbValorCuota;
	
	private JLabel lbInversion;
	
	private JLabel lbValorAnualidad;
	
	private JTextField txtValorCuota;
	private JTextField txtPeriodo;
	private JTextField txtTasaEfectiva;
	private JTextField txtInteres;
	private JTextField txtInversion;
	private JTextField txtValorAnualidad;
	
	
	private JButton btnTotal;
	
	Font fuente = new Font("Rockwell",Font.BOLD,12);
	
	private VentanaPrincipal interfaz;
	
	public PanelE(VentanaPrincipal pInterfaz){
		
		interfaz = pInterfaz;
		setLayout(null);
		setBorder(new TitledBorder("Calculo credito"));
		btnTotal = new JButton("Totalizar");
		btnTotal.setActionCommand(interfaz.TOTALIZAR_CUENTA);
		
		txtPeriodo = new JTextField();
		txtInteres = new JTextField();
		txtInversion = new JTextField();
		txtTasaEfectiva = new JTextField();
		txtValorAnualidad = new JTextField();
		txtValorCuota = new JTextField();
		
		lbPeriodo = new JLabel("Cuotas :");
		lbInteres = new JLabel("Interes :");
		lbInversion = new JLabel("Inversion :");
		lbTasaEfectiva = new JLabel("Tasa Efectiva :");
		lbValorAnualidad = new JLabel("Valor anualidad :");
		lbValorCuota = new JLabel("Valor cuota :");
		
		add(lbPeriodo);
		lbPeriodo.setBounds(40, 20, 120, 20);
		lbPeriodo.setForeground(Color.orange);
		lbPeriodo.setFont(fuente);
		add(txtPeriodo);
		txtPeriodo.setBounds(170, 20, 190, 20);
		txtPeriodo.setFont(fuente);
		
		add(lbInteres);
		lbInteres.setBounds(40, 50, 120, 20);
		lbInteres.setForeground(Color.DARK_GRAY);
		lbInteres.setFont(fuente);
		add(txtInteres);
	    txtInteres.setBounds(170, 50, 190, 20);
		txtInteres.setFont(fuente);
		
		add(lbInversion);
		lbInversion.setBounds(40, 80, 120, 20);
		lbInversion.setForeground(Color.GREEN);
		lbInversion.setFont(fuente);
		add(txtInversion);
		txtInversion.setBounds(170, 80, 190, 20);
		txtInversion.setFont(fuente);
		
		add(lbTasaEfectiva);
		lbTasaEfectiva.setBounds(40, 110, 120, 20);
		lbTasaEfectiva.setForeground(Color.RED);
		lbTasaEfectiva.setFont(fuente);
		add(txtTasaEfectiva);
		txtTasaEfectiva.setBounds(170, 110, 190, 20);
		txtTasaEfectiva.setFont(fuente);
		txtTasaEfectiva.setEditable(false);
		
		add(lbValorAnualidad);
		lbValorAnualidad.setBounds(40, 140, 120, 20);
		lbValorAnualidad.setFont(fuente);
		lbValorAnualidad.setForeground(Color.BLUE);
		add(txtValorAnualidad);
		txtValorAnualidad.setBounds(170, 140, 190, 20);
		txtValorAnualidad.setFont(fuente);
		txtValorAnualidad.setEditable(false);
		
		add(lbValorCuota);
		lbValorCuota.setBounds(40, 170, 120, 20);
		lbValorCuota.setForeground(Color.CYAN);
		lbValorCuota.setFont(fuente);
		add(txtValorCuota);
		txtValorCuota.setBounds(170, 170, 190, 20);
		txtValorCuota.setFont(fuente);
		txtValorCuota.setEditable(false);
		
		add(btnTotal);
		btnTotal.setBounds(40, 230, 157, 30);
		btnTotal.setFont(fuente);
	}

	public JLabel getLbPeriodo() {
		return lbPeriodo;
	}

	public void setLbPeriodo(JLabel lbPeriodo) {
		this.lbPeriodo = lbPeriodo;
	}

	public JLabel getLbInteres() {
		return lbInteres;
	}

	public void setLbInteres(JLabel lbInteres) {
		this.lbInteres = lbInteres;
	}

	public JLabel getLbInversion() {
		return lbInversion;
	}

	public void setLbInversion(JLabel lbInversion) {
		this.lbInversion = lbInversion;
	}

	public JLabel getLbTasaEfectiva() {
		return lbTasaEfectiva;
	}

	public void setLbTasaEfectiva(JLabel lbTasaEfectiva) {
		this.lbTasaEfectiva = lbTasaEfectiva;
	}

	public JLabel getLbValorAnualidad() {
		return lbValorAnualidad;
	}

	public void setLbValorAnualidad(JLabel lbValorAnualidad) {
		this.lbValorAnualidad = lbValorAnualidad;
	}

	public JLabel getLbValorCuota() {
		return lbValorCuota;
	}

	public void setLbValorCuota(JLabel lbValorCuota) {
		this.lbValorCuota = lbValorCuota;
	}

	public JTextField gettxtPeriodo() {
		return txtPeriodo;
	}

	public void settxtPeriodo(JTextField txtPeriodo) {
		txtPeriodo = txtPeriodo;
	}

	public JTextField gettxtInteres() {
		return txtInteres;
	}

	public void settxtInteres(JTextField txtInteres) {
		txtInteres = txtInteres;
	}

	public JTextField gettxtInversion() {
		return txtInversion;
	}

	public void settxtInversion(JTextField txtInversion) {
		this.txtInversion = txtInversion;
	}

	public JTextField gettxtTasaEfectiva() {
		return txtTasaEfectiva;
	}

	public void settxtTasaEfectiva(JTextField txtTasaEfectiva) {
		txtTasaEfectiva = txtTasaEfectiva;
	}

	public JTextField gettxtValorAnualidad() {
		return txtValorAnualidad;
	}

	public void settxtValorAnualidad(JTextField txtValorAnualidad) {
		txtValorAnualidad = txtValorAnualidad;
	}

	public JTextField gettxtValorCuota() {
		return txtValorCuota;
	}

	public void settxtValorCuota(JTextField txtValorCuota) {
		txtValorCuota = txtValorCuota;
	}

	public JButton getbtnTotal() {
		return btnTotal;
	}

	public void setbtnTotal(JButton btnTotal) {
		this.btnTotal = btnTotal;
	}

	public VentanaPrincipal getInterfaz() {
		return interfaz;
	}

	public void setInterfaz(VentanaPrincipal interfaz) {
		this.interfaz = interfaz;
	}
	

}
