package modelo;

public class Mundo {
 
	Creditos c;
	
	public Mundo(double Inters , int periodo , int ValorCuota) {
		c = new Creditos(Inters, periodo,ValorCuota);
	}

	public Creditos getC() {
		return c;
	}

	public void setC(Creditos c) {
		this.c = c;
	}
}
