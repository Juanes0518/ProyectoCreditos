package controlador;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import modelo.Creditos;
import modelo.Mundo;
import vista.InterfaceGui;

public class Controlador {
     InterfaceGui g;
     double calculo;
     int inversion;
     int p;
    
     Mundo m;
     DecimalFormat df = new  DecimalFormat("#.00");
	public Controlador() {
	
	   
		metodo();
	}
	
	public void metodo() {
		 g = new InterfaceGui();	
	     calculo=g.ingreseEldato("ingrese el porcentaje");
		 p=g.ingreseEldatoE("ingrese el periodo");
		 inversion =g.ingreseEldatoE("ingrse la invercion");
		 m  = new Mundo(calculo, p,inversion);
		g.darmensaje("Tasa Efectiva   "+df.format(m.getC().calcularTasaEfectiva())+"%");
		g.darmensaje("Valor Anualidad   "+ df.format(m.getC().calcularValorAnualidad()));
		g.darmensaje("Valor Cuota    "+df.format(m.getC().calcularValorCuota()));
		g.darmensaje(m.getC().calcularTablaDeValores());
		
	
	}
	
	
	
}
