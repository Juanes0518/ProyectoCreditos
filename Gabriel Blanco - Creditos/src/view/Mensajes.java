package view;

import javax.swing.*;

public class Mensajes extends JPanel 
{
	private static final long serialVersionUID = 1L; //El serial por defecto de la clase
	
	public void AboutUs()
	{
		JOptionPane.showMessageDialog(null, "CreditoFacil\nV1.0\nAUTOR: Gabriel Ernesto Blanco La Rotta\nCORREO: gblancol@unbosque.edu.co", "Acerca De", JOptionPane.INFORMATION_MESSAGE);
	}
	public void MissingCannotCreate(String val1, String val2, String val3, String eventArgs)
	{
		if(val1 == null && val2 == null && val3 == null)
		{
			JOptionPane.showMessageDialog(null, "Faltan todos los campos.\nPor favor, verifique e intente nuevamente.\nDetalles Técnicos: "+eventArgs, "Error", JOptionPane.ERROR_MESSAGE);
		}
		else if(val1 != null && val2 == null && val3 != null)
		{
			JOptionPane.showMessageDialog(null, "Falta el campo "+val2+".\nPor favor, verifique e intente nuevamente.\nDetalles Técnicos: "+eventArgs, "Error", JOptionPane.ERROR_MESSAGE);
		}
		else if(val1 != null && val2 != null && val3 == null)
		{
			JOptionPane.showMessageDialog(null, "Falta el campo "+val3+".\nPor favor, verifique e intente nuevamente.\nDetalles Técnicos: "+eventArgs, "Error", JOptionPane.ERROR_MESSAGE);
		}
		else if(val1 == null && val2 != null && val3 != null)
		{
			JOptionPane.showMessageDialog(null, "Falta el campo "+val1+".\nPor favor, verifique e intente nuevamente.\nDetalles Técnicos: "+eventArgs, "Error", JOptionPane.ERROR_MESSAGE);
		}
		else if(val1 == null && val2 == null && val3 != null)
		{
			JOptionPane.showMessageDialog(null, "Faltan los campos "+val1+", "+val2+".\nPor favor, verifique e intente nuevamente.\nDetalles Técnicos: "+eventArgs, "Error", JOptionPane.ERROR_MESSAGE);
		}
		else if(val1 != null && val2 == null && val3 == null)
		{
			JOptionPane.showMessageDialog(null, "Faltan los campos "+val2+", "+val3+".\nPor favor, verifique e intente nuevamente.\nDetalles Técnicos: "+eventArgs, "Error", JOptionPane.ERROR_MESSAGE);
		}
		else if(val1 == null && val2 != null && val3 == null)
		{
			JOptionPane.showMessageDialog(null, "Faltan los campos "+val1+", "+val3+".\nPor favor, verifique e intente nuevamente.\nDetalles Técnicos: "+eventArgs, "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	public void Error(String events)
	{
		JOptionPane.showMessageDialog(null, events, "ERROR FATAL", JOptionPane.ERROR_MESSAGE);
	}
	public void Help()
	{
		JOptionPane.showMessageDialog(null, "Por mala administracion del tiempo, no pudimos meterle mas funciones al programa. \n"
				+ "Me hubiera encantado poder jugar un poco mas con Javax.Swing y Java.awt. Estoy seguro de que con este trabajo pude aprender bastande de como funciona\n"
				+ "Y sus debidas aplicaciones en el (que no son pocas). Me encantó este trabajo.", "Estimado Ingeniero", JOptionPane.INFORMATION_MESSAGE);
	}
}
