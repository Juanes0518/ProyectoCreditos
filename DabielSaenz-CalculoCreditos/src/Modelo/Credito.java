package Modelo;

import java.text.NumberFormat;

import java.util.Locale;

public class Credito {

	private NumberFormat formato;
	private int periodo;
	private double interes;
	private double valorAnualidad;
	private double inversion;
	private double cuota;
	private double UX;
	private double tasaEfectiva;
	private String x;
	public Credito() {
		formato = NumberFormat.getCurrencyInstance(Locale.US);
		periodo = 0;
		interes = 0;
		valorAnualidad = 0;
		inversion = 0;
		cuota = 0;
		UX = 0.083333333;
		tasaEfectiva = 0;
		x = null;
	}
	
	public double tasaEfectiva(double interes) {
		interes = interes/100;
		tasaEfectiva = (Math.pow((1+interes), (UX)))-1;
		double resultado = tasaEfectiva * 100;
		resultado = Math.round(resultado * 100d)/100d;
		return resultado ;
	}
	
	public double calcularAnualidad(double tasaEfectiva, int periodo) {
		valorAnualidad = (1-(Math.pow(1+(tasaEfectiva), -1*periodo)));
		valorAnualidad = valorAnualidad/tasaEfectiva;
		
		return valorAnualidad;
	}
	public String valorCuota(double inversion,double valorAnualidad) {
		cuota = inversion/valorAnualidad;
		x = formato.format(cuota);
		return x;
	}

	
	
	public NumberFormat getFormato() {
		return formato;
	}

	public void setFormato(NumberFormat formato) {
		this.formato = formato;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getValorAnualidad() {
		return valorAnualidad;
	}

	public void setValorAnualidad(double valorAnualidad) {
		this.valorAnualidad = valorAnualidad;
	}

	public double getInversion() {
		return inversion;
	}

	public void setInversion(double inversion) {
		this.inversion = inversion;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public double getUnDoceavo() {
		return UX;
	}

	public void setUnDoceavo(double unDoceavo) {
		this.UX = unDoceavo;
	}

	public double getTasaEfectiva() {
		return tasaEfectiva;
	}

	public void setTasaEfectiva(double tasaEfectiva) {
		this.tasaEfectiva = tasaEfectiva;
	}

	public String getMoneda() {
		return x;
	}

	public void setMoneda(String moneda) {
		this.x = moneda;
	}
	
	
}
