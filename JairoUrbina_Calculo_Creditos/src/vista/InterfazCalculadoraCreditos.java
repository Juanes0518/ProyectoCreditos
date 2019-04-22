/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad El Bosque (Bogot� - Colombia)
 * Facultad de ingenier�a
 *
 * Proyecto: JU_Calculo_Creditos
 * Autor: Jairo Urbina
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */

package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import controlador.Controlador;
/**
 * Clase principal de la interfaz
 * @author Jairo Urbina
 *
 */
public class InterfazCalculadoraCreditos extends JFrame{

	// ------------------------------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------------------------------
	
	private static final long serialVersionUID = 1L;

	// ------------------------------------------------------------------------------------------
	// Atributos de la interfaz
	// ------------------------------------------------------------------------------------------
	/**
	 * Panel de entradas de la aplicaci�n.
	 */
	private PanelDatos panelEntradas;
	
	@SuppressWarnings("unused")
	/**
	 * Ventana emergente de la tabla resultado
	 */
	private Tabla tabla;

	
	// -------------------------------------------------------------------------------------------
	// Constructor
	// -------------------------------------------------------------------------------------------

	/**
	 * M�todo que inicializa la interfaz y los paneles
	 * @param control controlador de la aplicaci�n
	 */
	public InterfazCalculadoraCreditos(Controlador control)  {
			
		setTitle( "C�lculo de cr�ditos de cuota fija" );
		setSize( 600, 220);
		setLocationRelativeTo( null );
		setResizable( false );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLayout( new BorderLayout( ) );

		//Panel Entradas
		panelEntradas = new PanelDatos();
		panelEntradas.darBtnCalcular().addActionListener(control);
		add(panelEntradas, BorderLayout.CENTER);
	}
	
	//----------------------------------------------------------------------------------------------------------
	// M�todos
	//----------------------------------------------------------------------------------------------------------
	
	/**
	 * M�todo que retorna el panel de entradas
	 * @return panelEntradas
	 */
	public PanelDatos darPanelDatos() {
		return panelEntradas;
	}
	
	
	/**
	 * M�todo que retorna los intereses entrados por el usuario.
	 * @return el contenido de la casilla de texto de intereses
	 * @throws Exception Si; 
	 * 1.el valor ingresado es igual o menor a 0
	 * 2.el valor ingresado no es un numero.
	 */
	public double darIntereses() throws Exception{
		
		boolean esDouble;
        try {
            Double.parseDouble(darPanelDatos().darTxtIntereses().getText());
            esDouble = true;
        } catch (NumberFormatException excepcion) {
            esDouble = false;
        }
		if(esDouble==false) {
			throw new Exception("No hay ning�n valor v�lido en la casilla de intereses");
		}
		if(Double.parseDouble(darPanelDatos().darTxtIntereses().getText())<=0) {
			throw new Exception("El valor ingresado en la casilla intereses no puede ser cero o negativo");
		}
		else
		return (Double.parseDouble(darPanelDatos().darTxtIntereses().getText())/100);
	}
	
	
	/**
	 * M�todo que retorna la inversi�n ingresada por el usuario.
	 * @return el contenido de la casilla de inversi�n.
	 * @throws Exception si;
	 * 1.el valor ingresado es igual o menor a 0
	 * 2.el valor ingresado no es un numero.
	 */
	public double darInversion() throws Exception {
		boolean esDouble;
        try {
            Double.parseDouble(darPanelDatos().darTxtInversion().getText());
            esDouble = true;
        } catch (NumberFormatException excepcion) {
            esDouble = false;
        }
		if(esDouble==false) {
			throw new Exception("No hay ning�n valor v�lido en la casilla de inversi�n");
		}
		if(Double.parseDouble(darPanelDatos().darTxtInversion().getText())<=0) {
			throw new Exception("El valor ingresado en la casilla inversion no puede ser cero o negativo");
		}
		else
		return Double.parseDouble(darPanelDatos().darTxtInversion().getText());
	}
	
	
	/**
	 * M�todo que retorna el periodo ingresado por el usuario.
	 * @return el contenido de la casilla de periodo.
	 * @throws Exception si;
	 * 1.el valor ingresado es igual o menor a 0
	 * 2.el valor ingresado no es un numero.
	 */
	public int darPeriodo() throws Exception{
		 boolean esEntero;
	        try {
	            Integer.parseInt(darPanelDatos().darTxtPeriodo().getText());
	            esEntero = true;
	        } catch (NumberFormatException excepcion) {
	            esEntero = false;
	        }
		if(esEntero==false) {
			throw new Exception("No hay ning�n valor v�lido en la casilla de periodo");
		}
		if(Integer.parseInt(darPanelDatos().darTxtPeriodo().getText())<=0) {
			throw new Exception("El valor ingresado no puede ser cero o negativo");
		}
		else
		return Integer.parseInt(darPanelDatos().darTxtPeriodo().getText());
	}
	/**
	 * M�todo que inicializa la tabla de cr�ditos e inhabilita el bot�n calcular
	 * @param pTabla la tabla generada en el mundo con los valores
	 * @param pPeriodo el periodo ingresado por el usuario
	 * @param pInversion la inversi�n ingresada por el usuario.
	 */
	public void apretarBotonCalcular(String[][] pTabla, int pPeriodo, double pInversion, double pTasaEfec, double pValorAnualidad, double pValorCuota) {
		tabla = new Tabla(pTabla, pPeriodo, pInversion);
		darPanelDatos().darBtnCalcular().setEnabled(false);
		darPanelDatos().darTxtTasaEfec().setText(""+(pTasaEfec*100));
		darPanelDatos().darTxtValorAnualidad().setText(""+pValorAnualidad);
		darPanelDatos().darTxtValorCuota().setText(""+pValorCuota);
		
	}

}