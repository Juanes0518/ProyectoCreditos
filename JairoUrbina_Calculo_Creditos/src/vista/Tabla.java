/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad El Bosque (Bogotá - Colombia)
 * Facultad de ingeniería
 *
 * Proyecto: JU_Calculo_Creditos
 * Autor: Jairo Urbina
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package vista;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 * Clase que representa la tabla de créditos
 * @author Jairo Urbina
 *
 */
public class Tabla extends JFrame {
	
	//-----------------------------------------------------------------------------------------------------------
	// Atributos
	//-----------------------------------------------------------------------------------------------------------

	/**
	 * Atributo que representa el serial por defecto
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributo que representa la ventana emergente con la tabla
	 */
	private JFrame ventana;
	/**
	 * Atributo que representa la tabla 
	 */
	private JTable tabla;
	/**
	 * Contenedora con la primera fila de la tabla
	 */
	private String [] primeraFila = { "Cuota ", "Saldo pesos ", "Cuota pesos ", "Interes ", "Amortizacion "};
	
	//-----------------------------------------------------------------------------------------------------------
	// Constructor
	//-----------------------------------------------------------------------------------------------------------
	
	/**
	 * Inicializa la ventana emergente con la tabla
	 * @param pTabla la tabla generada en el mundo
	 * @param pPeriodo el periodo ingresado por el usuario
	 * @param pInversion la inversión ingresada por el usuario.
	 */
	public Tabla (String[][] pTabla, int pPeriodo, double pInversion){
		ventana = new JFrame ("Tabla");
		ventana.setLayout(new FlowLayout());
		ventana.setResizable(false);
		ventana.setSize(500,590);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.setLocation(200,200);
		tabla = new JTable(pTabla,getPrimeraFila());
		JScrollPane js = new JScrollPane(tabla);
		js.setPreferredSize(new Dimension(400, 550));
		ventana.add(js);
		tabla.setEnabled(false);
	}
	
	//-----------------------------------------------------------------------------------------------------------
	// Métodos
	//-----------------------------------------------------------------------------------------------------------
	
	/**
	 * Métod que retorna el arreglo con la primera fila de la tabla
	 * @return primeraFila
	 */
	public String[] getPrimeraFila() {
		return primeraFila;
	}
}