package modelo;

public class TablaC {
		private double cuotaPesos;
		private double SaldoPesos;
        private double Intereses;
        private double Amortizacion;
		
	public TablaC() {

	}
	

	public void hacerTabla(double pInversion,double pValorCuota,double pTasaEfec) {
		cuotaPesos = pValorCuota;
		Intereses = pInversion*pTasaEfec;
		Amortizacion = cuotaPesos-Intereses;
		SaldoPesos =pInversion-Amortizacion;
	}


	public double getCuotaPesos() {
		return cuotaPesos;
	}

	public void setSaldoPesos(double saldoPesos) {
		SaldoPesos = saldoPesos;
	}
	
	public double getAmortizacion() {
		return Amortizacion;
	}


	public void setAmortizacion(double amortizacion) {
		Amortizacion = amortizacion;
	}

	public double getIntereses() {
		return Intereses;
	}


	public void setIntereses(double intereses) {
		Intereses = intereses;
	}
	public void setCuotaPesos(double cuotaPesos) {
		this.cuotaPesos = cuotaPesos;
	}


	public double getSaldoPesos() {
		return SaldoPesos;
	}
	}
	


