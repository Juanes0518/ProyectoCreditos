/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad El Bosque (Bogotá - Colombia)
 * Facultad de ingeniería
 *
 * Proyecto: JU_Calculo_Creditos
 * Autor: Jairo Urbina
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.CalculadoraCreditos;
import vista.InterfazCalculadoraCreditos;
import vista.PanelDatos;

public class Controlador implements ActionListener{
	
	private CalculadoraCreditos calculadora;
	
	private InterfazCalculadoraCreditos interfaz;
	
	public Controlador() {
		
		calculadora = new CalculadoraCreditos();
		interfaz = new InterfazCalculadoraCreditos(this);
		interfaz.setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent pEvento){
		
		if(pEvento.getActionCommand().equals(PanelDatos.CALCULAR)) {
		
		try {
			int pPeriodo = interfaz.darPeriodo();
			double pInteres = interfaz.darIntereses();
			double pInversion = interfaz.darInversion();
			String[][] pTabla= calculadora.generarTabla(pPeriodo, pInversion, pInteres);
			double pTasaEfec = calculadora.darTasa(pInteres);
			double pValorAnualidad = calculadora.darValorAnualidad(pInteres, pPeriodo);
			double pValorCuota = calculadora.darValorCuota(pInversion, pInteres, pPeriodo);
			interfaz.apretarBotonCalcular(pTabla, pPeriodo, pInversion, pTasaEfec, pValorAnualidad, pValorCuota);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
		}

	}		
			
	}
}
