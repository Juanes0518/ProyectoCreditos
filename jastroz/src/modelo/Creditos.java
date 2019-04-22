package modelo;


public class Creditos {
	
public Creditos () {
	
}

public double Sobrecarga(double pInteres , boolean TasaEfectiva) {
      double RTA = 0.0;
      RTA = 1+pInteres;
      RTA = Math.pow(RTA,0.0833333333333)-1;
      return RTA;
}

public double Sobrecarga(double pInteres,int pCuotas, boolean ValorAnualidad ) {
	double RTA = 0.0;
	RTA = (1- Math.pow(1+Sobrecarga(pInteres,true),-pCuotas))/Sobrecarga(pInteres,true);
	return RTA;
}

public double Sobrecarga(double pInteres,int pCuotas , double pInversion , boolean Cuota ) {
	String camb = "";
	double RTA = 0;
	RTA = pInversion / Sobrecarga(pInteres,pCuotas, true);
	camb = String.format("%.2f", RTA);
	camb = camb.replace(",", ".");
	RTA = Double.parseDouble(camb);
	return RTA;
}



}
 