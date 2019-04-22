package modelo;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Creditos {
 int periodo;
 double interes;        
 double valorCuota=0;
 double tasaEfectiva=0;
 double valorAnulidad=0;
 int inversion=0;     
 double interesPesos=0;
 double Amortizacion =0;
 double SaldoPesos = 0;
 DecimalFormat df = new  DecimalFormat("#.00");
	public Creditos(double pInteres, int pPeriodo,int pInvercion) {
		interes = pInteres/100;
		periodo = pPeriodo;
		inversion = pInvercion;
		
	}
	
	
	public double calcularTasaEfectiva() {
		
	
		try {
			 if (interes>=1) {
			     JOptionPane.showMessageDialog(null, "Ingreso un porcentaje demasiado alto vuelva a realizar los datos con un menor porcentaje de 100" ,null, JOptionPane.ERROR_MESSAGE);
				}
			
		} catch (Exception e) {
			// TODO: handle exception
          
             
		}
	
		tasaEfectiva=Math.pow(1+interes, (1/12.0));
		tasaEfectiva-=1;
		
		tasaEfectiva*=100;
		
  
	
		
	
		return tasaEfectiva;
	}
	
	public double calcularValorAnualidad() {
		
		 
			// =(1-(1+D8)^-D5)/D8;
		   double x = (1.0+tasaEfectiva/100);
			valorAnulidad = Math.pow(x, -periodo);
			valorAnulidad -=1;
			
		
			valorAnulidad /=-tasaEfectiva/100;
		
			
		
		return valorAnulidad;
	}
	
	public double calcularValorCuota() {
	
		valorCuota =  inversion/valorAnulidad;
		return valorCuota;
		
	}
	public String calcularTablaDeValores () {
		String z ="";
	
		SaldoPesos=inversion;
		
	
		
		while (0<SaldoPesos) {
			
			
			
			interesPesos = SaldoPesos*tasaEfectiva/100;
			
			Amortizacion = valorCuota-interesPesos;
			SaldoPesos -=Amortizacion;
			if (SaldoPesos<0) {
				SaldoPesos = 0;
			}
			
			
				z+="\n"+"Saldo Pesos"+df.format(SaldoPesos)+"                     " + "Intereses en Pesos  "+df.format(interesPesos) +"			        " +"Amortizacion   "+df.format(Amortizacion) ;
				
			
			
		
		}
		
		
		
		
		
		
		return z;
	}
	
	
	
}


