/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad El Bosque (Bogotá - Colombia)
 * Facultad de ingeniería
 *
 * Proyecto: JU_Calculo_Creditos
 * Autor: Jairo Urbina
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
/**
 * Panel de entradas de la aplicación
 * @author Jairo Urbina
 */
public class PanelDatos extends JPanel{
	
	// -----------------------------------------------------------------
	// Constantes
	// -----------------------------------------------------------------
	/**
	 * Serial por defecto
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Comando para buscar calular todo lo necesario.
	 */
	public final static String CALCULAR = "Calcular";

	// -----------------------------------------------------------------
	// Elementos de la interfaz
	// -----------------------------------------------------------------

	/**
	 * Campo de texto para titulo del periodo
	 */
	private JTextField txtTituloPeriodo;
	
	/**
	 * Campo de texto para entrar el periodo.
	 */
	private JTextField txtPeriodo;
	
	/**
	 * Campo de texto para titulo del intereses
	 */
	private JTextField txtTituloIntereses;
	

	/**
	 * Campo de texto para entrar los intereses.
	 */
	private JTextField txtIntereses;
	
	/**
	 * Campo de texto para titulo del inversion
	 */
	private JTextField txtTituloInversion;
	

	/**
	 * Campo de texto para entrar la inversion.
	 */
	private JTextField txtInversion;

	/**
	 * Campo de texto vacío
	 */
	private JTextField txtVacio;
	
	/**
	 * Botón para realizar calculos.
	 */
	private JButton btnCalcular;
	/**
	 * Campo de texto para titulo de la tasa efectiva
	 */
	private JTextField txtTituloTasaEfec;
	/**
	 * Campo de texto para la tasa efectiva
	 */
	private JTextField txtTasaEfec;
	/**
	 * Campo de texto para titulo de valor anualidad
	 */
	private JTextField txtTituloValorAnualidad;
	/**
	 * Campo de texto para valor anualidad
	 */
	private JTextField txtValorAnualidad;
	/**
	 * Campo de texto para titulo valor cuota
	 */
	private JTextField txtTituloValorCuota;
	/**
	 * Campo de texto para valor cuota.
	 */
	private JTextField txtValorCuota;
	
	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	
	/**
	 * Construye el panel con los botones y campos de texto. 
	 */
	public PanelDatos( )
	{
		setLayout( new GridLayout( 7, 2 ) );
		setPreferredSize( new Dimension( 0, 100) );
		TitledBorder border = new TitledBorder( "Datos" );
		border.setTitleColor( Color.RED );
		setBorder(  border);
		
		txtTituloPeriodo = new JTextField( );
		txtTituloPeriodo.setEditable(false);
		txtTituloPeriodo.setText("Periodo (n)");
		add( txtTituloPeriodo);
		
		txtPeriodo = new JTextField( );
		add( txtPeriodo );
		
		txtTituloIntereses = new JTextField( );
		txtTituloIntereses.setEditable(false);
		txtTituloIntereses.setText("Intereses  %");
		add( txtTituloIntereses);
		
		txtIntereses = new JTextField( );
		add( txtIntereses );
		
		txtTituloInversion = new JTextField( );
		txtTituloInversion.setEditable(false);
		txtTituloInversion.setText("Inversión $");
		add( txtTituloInversion );
		
		txtInversion = new JTextField( );
		add(txtInversion);
		
		txtVacio = new JTextField( );
		txtVacio.setEditable(false);
		add(txtVacio);

		btnCalcular = new JButton( CALCULAR );
		btnCalcular.setActionCommand( CALCULAR );
		add( btnCalcular );
		
		txtTituloTasaEfec = new JTextField();
		txtTituloTasaEfec.setEditable(false);
		txtTituloTasaEfec.setText("Tasa efectiva %");
		add(txtTituloTasaEfec);
		
		txtTasaEfec = new JTextField();
		txtTasaEfec.setEditable(false);
		add(txtTasaEfec);
		
		txtTituloValorAnualidad = new JTextField();
		txtTituloValorAnualidad.setEditable(false);
		txtTituloValorAnualidad.setText("Valor anualidad");
		add(txtTituloValorAnualidad);
		
		txtValorAnualidad = new JTextField();
		txtValorAnualidad.setEditable(false);
		add(txtValorAnualidad);
		
		txtTituloValorCuota = new JTextField();
		txtTituloValorCuota.setEditable(false);
		txtTituloValorCuota.setText("Valor cuota $");
		add(txtTituloValorCuota);
		
		txtValorCuota = new JTextField();
		txtValorCuota.setEditable(false);
		add(txtValorCuota);
		
	}
	
	//----------------------------------------------------------------------------------------------------------------------
	// Métodos
	//----------------------------------------------------------------------------------------------------------------------
	
	/**
	 * Método que retorna la casilla de intereses
	 * @return txtIntereses
	 */
	public JTextField darTxtIntereses() {
		return txtIntereses;
	}
	/**
	 * Método que retorna la casilla de Periodo
	 * @return txtPeriodo
	 */
	public JTextField darTxtPeriodo() {
		return txtPeriodo;
	}
	/**
	 * Método que retona la casilla de inversión
	 * @return txtInversion
	 */
	public JTextField darTxtInversion() {
		return txtInversion;
	}
	/**
	 * Método que retorna el botón calcular
	 * @return btnCalcular
	 */
	public JButton darBtnCalcular() {
		return btnCalcular;
	}
	/**
	 * Método que retorna el campo de texto de tasa efectiva
	 * @return txtTasaEfec
	 */
	public JTextField darTxtTasaEfec() {
		return txtTasaEfec;
	}
	/**
	 * Método que retorna el campo de texto de valor anualidad
	 * @return txtValorAnualidad
	 */
	public JTextField darTxtValorAnualidad() {
		return txtValorAnualidad;
	}
	/**
	 * Método que retorna la casilla de valor cuota
	 * @return txyValorCuota
	 */
	public JTextField darTxtValorCuota() {
		return txtValorCuota;
	}
	


}
