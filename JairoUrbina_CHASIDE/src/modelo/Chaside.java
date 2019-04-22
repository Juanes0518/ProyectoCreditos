package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import modelo.Pregunta.Letra;
import modelo.Pregunta.Tipo;
/**
 * Clase principal del mundo, representa el test chaside
 * @author Jairo Urbina
 */
public class Chaside {
	
	//-----------------------------------------------------------------------------------------------------------------------
	// Atributos
	//-----------------------------------------------------------------------------------------------------------------------
	
	
	private Pregunta[] preguntas;
	
	//-----------------------------------------------------------------------------------------------------------------------
	// Constructor
	//-----------------------------------------------------------------------------------------------------------------------

	public Chaside(File pArchivo ) throws Exception
    {
        Properties datos = cargarInfoTest( pArchivo );
        inicializarPreguntas( datos );
	}
	
	//-----------------------------------------------------------------------------------------------------------------------
	// Métodos
	//-----------------------------------------------------------------------------------------------------------------------

	private Properties cargarInfoTest(File pArchivo) throws Exception {
		Properties datos = new Properties( );
        FileInputStream in = new FileInputStream( pArchivo );
        
        datos.load( in );
        in.close( );
       
        return datos;
	}

	private void inicializarPreguntas(Properties pDatos) {
		String strNumeroPreguntas = pDatos.getProperty( "numPreguntas" );
        int numPreguntas = Integer.parseInt( strNumeroPreguntas );
        // Crea el arreglo de preguntas, reservando el espacio definido en la propiedad "numPreguntas"
        preguntas = new Pregunta[numPreguntas];
        // Lee el enunciado, el tipo y la letra de cada pregunta y crea el objeto que lo representa.
        for( int i = 0; i < numPreguntas; i++ )
        {
            String enunciado= pDatos.getProperty("pregunta.enunciado" +i );
 
            String tipo = pDatos.getProperty("pregunta.tipo" +i);
            Tipo tipoEnum = Tipo.valueOf(tipo);
            
            String letra = pDatos.getProperty("pregunta.letra" +i);
            Letra letraEnum = Letra.valueOf(letra);

            preguntas[ i ] = new Pregunta(enunciado, tipoEnum, letraEnum);
        }
		
	}
	
	public int darSumatoriaDePuntosPorLetraYTipo(Tipo pTipo, Letra pLetra) {
		int c=0;
		for(int i=0; i<preguntas.length ; i++) {
			if(preguntas[i].darTipoPregunta() == pTipo && preguntas[i].darRespuesta() == true) {
				if(preguntas[i].darLetraDePregunta() == pLetra &&  preguntas[i].darRespuesta() == true) {
					c++;
				}
			}
		}
		return c;
	}
	
	public Letra darLetraConMasPuntosSegunTipo(Tipo pTipo) {
		int[] arreglo = new int[7];
		int mayor = 0;
		int indice=0;
		arreglo[0]=darSumatoriaDePuntosPorLetraYTipo(pTipo, Letra.C);
		arreglo[1]=darSumatoriaDePuntosPorLetraYTipo(pTipo, Letra.H);
		arreglo[2]=darSumatoriaDePuntosPorLetraYTipo(pTipo, Letra.A);
		arreglo[3]=darSumatoriaDePuntosPorLetraYTipo(pTipo, Letra.S);
		arreglo[4]=darSumatoriaDePuntosPorLetraYTipo(pTipo, Letra.I);
		arreglo[5]=darSumatoriaDePuntosPorLetraYTipo(pTipo, Letra.D);
		arreglo[6]=darSumatoriaDePuntosPorLetraYTipo(pTipo, Letra.E);
		
		for(int i=0; i<7; i++)
		{
			if(arreglo[i]>mayor) 
			{
				mayor = arreglo[i];
				indice = i;
			}
		}
		if(indice==0) {
			return Letra.C;
		}
		if(indice==1) {
			return Letra.H;
		}
		if(indice==2) {
			return Letra.A;
		}
		if(indice==3) {
			return Letra.S;
		}
		if(indice==4) {
			return Letra.I;
		}
		if(indice==5) {
			return Letra.D;
		}
		else  {
			return Letra.E;
		}
	}
	
	public Pregunta[] darPreguntas() {
		return preguntas;
	}

}
