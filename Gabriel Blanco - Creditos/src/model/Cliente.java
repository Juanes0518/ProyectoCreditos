package model;

public interface Cliente 
{
	public String nombre(); // Puede ir el nombre completo del cliente.
	public String direccion(); // Aqui va el domicilio de residencia del cliente. Ojalá pudiera ir en este formato: Dirección, Interior(si aplica), Ciudad, Departamento, CP, Pais
	public char tipoDocumento(); // r = Cedula de Ciudadanía; n = NUIP; e = Cédula de Extranjería; p = Pasaporte; O = otros...
	public String documento(); // Aqui va el documento. Como p puede ser en alfanumérico, ej. PE102523. Se establece como String.
	public char tipoEmpleo(); // i = Independiente; e = Estudiante; a = Asalariado; p = Pensionado; d = Desempleado..
	public String profesion(); // Aqui puede ir desde vendedor de empanadas, hasta humilde congresista.
	public double ingresos(); // Aqui van los ingresos.
	public double dcScore(); //dcScore = Puntaje de DataCrédito.
}
