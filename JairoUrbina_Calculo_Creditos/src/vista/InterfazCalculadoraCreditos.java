/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad El Bosque (Bogotá - Colombia)
 * Facultad de ingeniería
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
	 * Panel de entradas de la aplicación.
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
	 * Método que inicializa la interfaz y los paneles
	 * @param control controlador de la aplicación
	 */
	public InterfazCalculadoraCreditos(Controlador control)  {
			
		setTitle( "Cálculo de créditos de cuota fija" );
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
	// Métodos
	//----------------------------------------------------------------------------------------------------------
	
	/**
	 * Método que retorna el panel de entradas
	 * @return panelEntradas
	 */
	public PanelDatos darPanelDatos() {
		return panelEntradas;
	}
	
	
	/**
	 * Método que retorna los intereses entrados por el usuario.
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
			throw new Exception("No hay ningún valor válido en la casilla de intereses");
		}
		if(Double.parseDouble(darPanelDatos().darTxtIntereses().getText())<=0) {
			throw new Exception("El valor ingresado en la casilla intereses no puede ser cero o negativo");
		}
		else
		return (Double.parseDouble(darPanelDatos().darTxtIntereses().getText())/100);
	}
	
	
	/**
	 * Método que retorna la inversión ingresada por el usuario.
	 * @return el contenido de la casilla de inversión.
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
			throw new Exception("No hay ningún valor válido en la casilla de inversión");
		}
		if(Double.parseDouble(darPanelDatos().darTxtInversion().getText())<=0) {
			throw new Exception("El valor ingresado en la casilla inversion no puede ser cero o negativo");
		}
		else
		return Double.parseDouble(darPanelDatos().darTxtInversion().getText());
	}
	
	
	/**
	 * Método que retorna el periodo ingresado por el usuario.
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
			throw new Exception("No hay ningún valor válido en la casilla de periodo");
		}
		if(Integer.parseInt(darPanelDatos().darTxtPeriodo().getText())<=0) {
			throw new Exception("El valor ingresado no puede ser cero o negativo");
		}
		else
		return Integer.parseInt(darPanelDatos().darTxtPeriodo().getText());
	}
	/**
	 * Método que inicializa la tabla de créditos e inhabilita el botón calcular
	 * @param pTabla la tabla generada en el mundo con los valores
	 * @param pPeriodo el periodo ingresado por el usuario
	 * @param pInversion la inversión ingresada por el usuario.
	 */
	public void apretarBotonCalcular(String[][] pTabla, int pPeriodo, double pInversion, double pTasaEfec, double pValorAnualidad, double pValorCuota) {
		tabla = new Tabla(pTabla, pPeriodo, pInversion);
		darPanelDatos().darBtnCalcular().setEnabled(false);
		darPanelDatos().darTxtTasaEfec().setText(""+(pTasaEfec*100));
		darPanelDatos().darTxtValorAnualidad().setText(""+pValorAnualidad);
		darPanelDatos().darTxtValorCuota().setText(""+pValorCuota);
		
	}

}