package vista;

import javax.swing.JOptionPane;

public class InterfaceGui {

	
	public InterfaceGui() {
		
	}
	
	public double ingreseEldato(String mensaje) {
		double z;
		z = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return z;
	}
	
	public int ingreseEldatoE(String mesaje) {
		int z;
		z = Integer.parseInt(JOptionPane.showInputDialog(mesaje));
		return z;
		
	}
	
	public void darmensaje(String f) {
		JOptionPane.showMessageDialog(null, f);
	}
}
