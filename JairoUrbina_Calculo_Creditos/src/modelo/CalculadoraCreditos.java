/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad El Bosque (Bogotá - Colombia)
 * Facultad de ingeniería
 *
 * Proyecto: JU_Calculo_Creditos
 * Autor: Jairo Urbina
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package modelo;
/**
 * Clase principal del Mundo, representa la calculadora de créditos
 * @author Jairo Urbina
 *
 */
public class CalculadoraCreditos {
	/**
	 * Método que retorna la tasa efectiva
	 * @param pInteres el interes ingresado por el usuario
	 * @return la tasa efectiva
	 */
	public  double darTasa(double pInteres) {
		double respuesta = 0;
		double numero1, numero2, numero3 =0;
		
		numero1=+(1+pInteres);
		double ras=(double)1/(double)12;
		numero2=Math.pow(numero1, ras);
		numero3= (numero2-1);

		respuesta = numero3;
		
		return respuesta;
	}
	/**
	 * Método que retorna el valor de anualidad
	 * @param pInteres el interes ingresado por el usuario
	 * @param pPeriodo el periodo ingresado por el usuario
	 * @return el valor de anualidad
	 */
	public  double darValorAnualidad (double pInteres, int pPeriodo) {
		double respuesta=0;

		respuesta = ((1-(Math.pow(1+darTasa(pInteres),-(double)pPeriodo)))/darTasa(pInteres));
		String.format("%.2f", respuesta);
		return respuesta;
	}



	/**
	 * Método que retorna el valor de cuota
	 * @param pinversion la inversión ingresada por el usuario
	 * @param pInteres el interes ingresado por el usuario
	 * @param pPeriodo el periodo ingresado porel usuario.
	 * @return valor de cuota
	 */
	public  double darValorCuota(double pInversion, double pInteres, int pPeriodo){
		double valorCuota=0;
		valorCuota = pInversion / darValorAnualidad(pInteres, pPeriodo);
		return valorCuota;
	}
	/**
	 * Método que genera la tabla de créditos
	 * @param pPeriodo el periodo ingresado porel usuario.
	 * @param pInversion la inversión ingresada por el usuario
	 * @param pInteres el interes ingresado por el usuario
	 * @return una matriz que representa la tabla
	 */
	public  String [][]generarTabla (int pPeriodo, double pInversion, double pInteres){
		String[][] tablaCreditos= new String[pPeriodo+1][5];
		
		double total=pInversion;
		double cuotap= darValorCuota(pInversion, pInteres,  pPeriodo);
		double intereses=0;
		double amortizacion= 0; 
		for (int i = 0; i < pPeriodo+1; i++) {
			if(i==0)
			{
				tablaCreditos[i][0]=i+"";
				tablaCreditos[i][1]=total+"";
				tablaCreditos[i][2]="";
				tablaCreditos[i][3]="";
				tablaCreditos[i][4]="";
			}
			else{ 
				intereses=(total*darTasa(pInteres));
				amortizacion=cuotap-intereses;
				total=total-amortizacion;
				tablaCreditos[i][0]=i+"";
				tablaCreditos[i][1]=total+"";
				tablaCreditos[i][2]=cuotap+"";
				tablaCreditos[i][3]=intereses+"";
				tablaCreditos[i][4]=amortizacion+"";
			}
		}
			return tablaCreditos;
	}

}
