package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Creditos;
import modelo.TablaC;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener {
  private Creditos cre;
  private VentanaPrincipal inter;
  private TablaC tab;
  public Controlador() {
	  tab = new TablaC();
	  cre = new Creditos();
	  inter = new VentanaPrincipal(this);
	  inter.setVisible(true);
  }
@Override
public void actionPerformed(ActionEvent e) {
	String comando = e.getActionCommand();
	
	if(comando.equals(inter.TOTALIZAR_CUENTA)){
		
		int Cuotas = Integer.parseInt(inter.getPanelEntrada().gettxtPeriodo().getText()); 
		double Interes = Double.parseDouble(inter.getPanelEntrada().gettxtInteres().getText());
		double Inversion =Double.parseDouble(inter.getPanelEntrada().gettxtInversion().getText());
		double TasaEfectiva = cre.Sobrecarga(Interes, true);
		double TasaAnualidad = cre.Sobrecarga(Interes, Cuotas, true);
		double ValorCuota = cre.Sobrecarga(Interes, Cuotas, Inversion, true);
		inter.getPanelEntrada().gettxtTasaEfectiva().setText(Double.toString(TasaEfectiva));
		inter.getPanelEntrada().gettxtValorAnualidad().setText(Double.toString(TasaAnualidad));
		inter.getPanelEntrada().gettxtValorCuota().setText(Double.toString(ValorCuota));
		
	}
	
	if(comando.equals(inter.ACTUALIZAR_TABLA)){
		int i = 0;
		int  Cuotas = Integer.parseInt(inter.getPanelEntrada().gettxtPeriodo().getText());
		double Inversion = Double.parseDouble(inter.getPanelEntrada().gettxtInversion().getText());
		double TasaEfectiva = Double.parseDouble(inter.getPanelEntrada().gettxtTasaEfectiva().getText());
		double ValorCuota = Double.parseDouble(inter.getPanelEntrada().gettxtValorCuota().getText());
		
		if (Cuotas == 0){
			 String [] lista = {"0",Double.toString(Inversion),"",""};
    		 inter.getPanelTabla().getModel().addRow(lista);
		}
		
		if(Cuotas != 0){
		
	    while (i != Cuotas+1){
	    	if (i == 0){
	    		 String [] lista = {"0",Double.toString(Inversion),"",""};
	    		 inter.getPanelTabla().getModel().addRow(lista);
	    	  }
	    	else if (i == 1){
	    		tab.hacerTabla(Inversion, ValorCuota, TasaEfectiva);
	    		String []lista = {Integer.toString(i),Double.toString(tab.getSaldoPesos()),Double.toString(tab.getCuotaPesos()),Double.toString(tab.getIntereses()),Double.toString(tab.getAmortizacion())};
	    		inter.getPanelTabla().getModel().addRow(lista);
	          }
	    	else if(i > 1){
	    	
	    	tab.hacerTabla(tab.getSaldoPesos(), ValorCuota, TasaEfectiva);
	    	String []lista = {Integer.toString(i),Double.toString(tab.getSaldoPesos()),Double.toString(tab.getCuotaPesos()),Double.toString(tab.getIntereses()),Double.toString(tab.getAmortizacion())};
	    	inter.getPanelTabla().getModel().addRow(lista);
	    	
	    	 }
	    	
	    	i++;
	     }
	   }
	}
 }
}