package model;

public interface Prestamo 
{
	public double monto(); // Este es el valor de la inversion del cliente
	public double interes(); // La tasa de interes del monto a prestar
	public int plazo(); // Los meses en que se va a pagar el monto
	public double tasaEfectiva(); // La tasa efectiva calculada con (1+interes()^(1/12))-1
	public double valorAnual(); // El valor anual calculado con (1-(1+tasaEfectiva()^(-plazo())))/tasaEfectiva()
	public double valorCuota(); // El valor de la cuota calculado con monto()/valorAnual()
	
}
