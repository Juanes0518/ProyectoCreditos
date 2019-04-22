package Vista;
import java.awt.Color;
import java.awt.font.*;



import java.awt.GridLayout;

import javax.swing.BorderFactory;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
public class PanelResultados extends JPanel{

	/**
	 * 
	 */
	
	private JLabel etasaEfectiva;
	private JLabel evalorAnualidad;
	private JLabel evalorCuota;
	private JTextField tasaEfectiva;
	private JTextField valorAnualidad;
	private JTextField valorCuota;
	private static final long serialVersionUID = 1L;
	
	public PanelResultados() {
		setLayout(new GridLayout(3,3));
		TitledBorder border = BorderFactory.createTitledBorder("Resultados ");
		border.setTitleColor (Color.blue);
		setBorder(border);
		etasaEfectiva = new JLabel("Tasa efectiva:");
		add(etasaEfectiva);
		
		tasaEfectiva = new JTextField("");
		
        tasaEfectiva.setBackground(Color.WHITE);
		tasaEfectiva.setForeground(Color.BLACK);
		add(tasaEfectiva);
		 add(new JLabel(""));
		
		evalorAnualidad = new JLabel("Valor anualidad:");
		add(evalorAnualidad);
		valorAnualidad = new JTextField("");
		valorAnualidad.setBackground(Color.WHITE);
		valorAnualidad.setForeground(Color.BLACK);
		add(valorAnualidad);
		 add(new JLabel(""));
		
		evalorCuota = new JLabel("Valor cuota mensual:");
		add(evalorCuota);
		valorCuota = new JTextField("");
		valorCuota.setBackground(Color.WHITE);
		valorCuota.setForeground(Color.BLACK);
		add(valorCuota);
		 add(new JLabel(""));
		
		
	}

	public JLabel getEtasaEfectiva() {
		return etasaEfectiva;
	}

	public void setEtasaEfectiva(JLabel etasaEfectiva) {
		this.etasaEfectiva = etasaEfectiva;
	}

	public JLabel getEvalorAnualidad() {
		return evalorAnualidad;
	}

	public void setEvalorAnualidad(JLabel evalorAnualidad) {
		this.evalorAnualidad = evalorAnualidad;
	}

	public JLabel getEvalorCuota() {
		return evalorCuota;
	}

	public void setEvalorCuota(JLabel evalorCuota) {
		this.evalorCuota = evalorCuota;
	}

	public JTextField getTasaEfectiva() {
		return tasaEfectiva;
	}

	public void setTasaEfectiva(JTextField tasaEfectiva) {
		this.tasaEfectiva = tasaEfectiva;
	}

	public JTextField getValorAnualidad() {
		return valorAnualidad;
	}

	public void setValorAnualidad(JTextField valorAnualidad) {
		this.valorAnualidad = valorAnualidad;
	}

	public JTextField getValorCuota() {
		return valorCuota;
	}

	public void setValorCuota(JTextField valorCuota) {
		this.valorCuota = valorCuota;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
