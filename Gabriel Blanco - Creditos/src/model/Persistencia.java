package model;

public class Persistencia 
{
	private String nombre, id, tipodoc, monto, interes, plazo, tefectiva, vanual, vcuota, ingresos, dcScore, direccion, profesion, templeo;
	public Persistencia()
	{
		nombre = new String("Nombre = ");
		id = new String("Número Identificación = ");
		tipodoc = new String("Tipo de Documento = ");
		monto = new String("Monto = ");
		interes = new String("Interes = ");
		plazo = new String("Número de Cuotas = ");
		tefectiva = new String("Tasa Efectiva = ");
		vanual = new String("Valor Anual = ");
		vcuota = new String("Valor Cuota = ");
		ingresos = new String("Valor Ingresos = ");
		dcScore = new String("Puntaje en DataCrédito = ");
		direccion = new String("Dirección = ");
		profesion = new String("Empleo = ");
		templeo = new String("Tipo de Empleo = ");
	}
	public String getNombre() {
		return nombre;
	}
	public String getId() {
		return id;
	}
	public String getTipodoc() {
		return tipodoc;
	}
	public String getMonto() {
		return monto;
	}
	public String getInteres() {
		return interes;
	}
	public String getPlazo() {
		return plazo;
	}
	public String getTefectiva() {
		return tefectiva;
	}
	public String getVanual() {
		return vanual;
	}
	public String getVcuota() {
		return vcuota;
	}
	public String getIngresos() {
		return ingresos;
	}
	public String getDcScore() {
		return dcScore;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getProfesion() {
		return profesion;
	}
	public String getTempleo() {
		return templeo;
	}
}
