package Modelo;

public class Mundo {
 private Credito credito;
 
 public Mundo(){
	 credito = new Credito();
	 
 }

public Credito getCredito() {
	return credito;
}

public void setCredito(Credito credito) {
	this.credito = credito;
}
 
}
