package vista;

import javax.swing.JOptionPane;

public class InterfazChaside {
	
	
	public boolean responderPregunta(String pEnunciado) {
		boolean respuesta = false;
		int reply = JOptionPane.showConfirmDialog(null, pEnunciado, "Pregunta", JOptionPane.YES_NO_OPTION);
		if(reply == JOptionPane.YES_NO_OPTION) {
			respuesta = true;
		}
		return respuesta;
	}
	
	public void mostrarPuntos(String pPuntos) {
		JOptionPane.showMessageDialog(null, pPuntos, "Su puntaje es", JOptionPane.DEFAULT_OPTION);
	}
    
	
	

}