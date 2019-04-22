package modelo;
/**
 * Clase que representa una pregunta del test chaside
 * @author Jairo Urbina
 *
 */
public class Pregunta {
	
	//------------------------------------------------------------------------------------------------------------------------
	// Enumeraciones
	//------------------------------------------------------------------------------------------------------------------------
	
	
	public enum Tipo{
		INTERESES,
		APTITUDES
	}
	public enum Letra{
		C, 
		H,
		A,
		S,
		I,
		D,
		E	
	}
	
	//------------------------------------------------------------------------------------------------------------------------
	// Atributos
	//------------------------------------------------------------------------------------------------------------------------
	
	private String enunciado;
	
	private boolean respuesta;
	
	private Tipo tipoPregunta;
	
	private Letra letraDePregunta;
	
	//------------------------------------------------------------------------------------------------------------------------
	// Constructor
	//------------------------------------------------------------------------------------------------------------------------
	
	public Pregunta(String pEnunciado, Tipo pTipoPregunta, Letra pLetraDePregunta) {
		
		enunciado = pEnunciado;
		tipoPregunta = pTipoPregunta;
		letraDePregunta = pLetraDePregunta;
		respuesta = false;
		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------
	// Métodos
	//-----------------------------------------------------------------------------------------------------------------------
	
	public String darEnunciado() {
		return enunciado;
	}
	
	public Tipo darTipoPregunta() {
		return tipoPregunta;
	}

	public Letra darLetraDePregunta() {
		return letraDePregunta;
	}

	public boolean darRespuesta() {
		return respuesta;
	}
	
	public void modificarRespuesta(boolean pRespuesta) {
		respuesta = pRespuesta;
	}
	
	
}
