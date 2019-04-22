package model;

public class Mundo 
{
	/*
	 * Se establecen los atributos de Persistencia y Credito para crear el cliente, préstamo y guardar datos en Persisntencia.
	 */
	private Persistencia bd; // Donde se guardan ciertos datos para ponerlos despues en un archivo .cred y guardar ciertos valores en .properties
	private Credito credit; // Donde se crea el crédito
	private Archivo a; // Donde se guarda el archivo
	private Propiedades p; // Donde se guardan las propiedades
	/*
	 * Se establece el método constructor para la instancia de las clases Credito y Persistencia.
	 */
	public Mundo()
	{
		bd = new Persistencia(); // Instancia de Persistencia
		credit = new Credito(); // Instancia de Credito
		a = new Archivo();
		p = new Propiedades();
	}
	/*
	 * Son los Getters & Setters generados por el usuario usando las funciones de Eclipse IDE.
	 */
	public Persistencia getBd() 
	{
		return bd;
	}

	public void setBd(Persistencia bd) 
	{
		this.bd = bd;
	}

	public Credito getCredit() 
	{
		return credit;
	}

	public void setCredit(Credito credit) 
	{
		this.credit = credit;
	}
	public Archivo getA() 
	{
		return a;
	}
	public void setA(Archivo a) 
	{
		this.a = a;
	}
	public Propiedades getP() 
	{
		return p;
	}
	public void setP(Propiedades p) 
	{
		this.p = p;
	}
}
