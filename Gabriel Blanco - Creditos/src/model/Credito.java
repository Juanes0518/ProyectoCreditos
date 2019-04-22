package model;

public class Credito implements Cliente, Prestamo
{
	/*
	 * Se establecen los atributos del crédito donde incluyen Cliente y Prestamo
	 */
	private double monto, interes, tasaEfectiva, valorAnual, valorCuota, ingresos, dcScore;
	private String nombre, direccion, profesion, documento;
	private char tipoDocumento, tipoEmpleo;
	private int plazo;

	@Override
	public double monto() 
	{
		// TODO Apéndice de método generado automáticamente
		return monto;
	}

	@Override
	public double interes() 
	{
		// TODO Apéndice de método generado automáticamente
		return interes;
	}

	@Override
	public int plazo() 
	{
		// TODO Apéndice de método generado automáticamente
		return plazo;
	}

	@Override
	public double tasaEfectiva() 
	{
		// TODO Apéndice de método generado automáticamente
		tasaEfectiva=(Math.pow((1+interes), 1.00000/12.00000)-1);
		return tasaEfectiva;
	}

	@Override
	public double valorAnual() 
	{
		// TODO Apéndice de método generado automáticamente
		valorAnual = ((1-Math.pow(1+tasaEfectiva, -plazo))/tasaEfectiva);
		return valorAnual;
	}

	@Override
	public double valorCuota() 
	{
		// TODO Apéndice de método generado automáticamente
		valorCuota=monto/valorAnual;
		return valorCuota;
	}

	@Override
	public String nombre() 
	{
		// TODO Apéndice de método generado automáticamente
		return nombre;
	}

	@Override
	public String direccion() 
	{
		// TODO Apéndice de método generado automáticamente
		return direccion;
	}

	@Override
	public char tipoDocumento() 
	{
		// TODO Apéndice de método generado automáticamente
		return tipoDocumento;
	}

	@Override
	public String documento() 
	{
		// TODO Apéndice de método generado automáticamente
		return documento;
	}

	@Override
	public char tipoEmpleo() 
	{
		// TODO Apéndice de método generado automáticamente
		return tipoEmpleo;
	}

	@Override
	public String profesion() 
	{
		// TODO Apéndice de método generado automáticamente
		return profesion;
	}

	@Override
	public double ingresos() 
	{
		// TODO Apéndice de método generado automáticamente
		return ingresos;
	}

	@Override
	public double dcScore() 
	{
		// TODO Apéndice de método generado automáticamente
		return dcScore;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getTasaEfectiva() {
		return tasaEfectiva;
	}

	public void setTasaEfectiva(double tasaEfectiva) {
		this.tasaEfectiva = tasaEfectiva;
	}

	public double getValorAnual() {
		return valorAnual;
	}

	public void setValorAnual(double valorAnual) {
		this.valorAnual = valorAnual;
	}

	public double getValorCuota() {
		return valorCuota;
	}

	public void setValorCuota(double valorCuota) {
		this.valorCuota = valorCuota;
	}

	public double getIngresos() {
		return ingresos;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
}
