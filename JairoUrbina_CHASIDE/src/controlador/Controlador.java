package controlador;


import java.io.File;
import javax.swing.JOptionPane;
import modelo.Chaside;
import modelo.Pregunta.Letra;
import modelo.Pregunta.Tipo;
import vista.InterfazChaside;

public class Controlador {
	
	
	private Chaside mundo;
	
	private InterfazChaside vista;
	
	
	public Controlador() {
		File archivo = new File("data/preguntas.properties");	
		
		try {
			mundo = new Chaside(archivo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		vista = new InterfazChaside();	

		for(int i=0; i<mundo.darPreguntas().length; i++) {
			String preguntaActual = mundo.darPreguntas()[i].darEnunciado();
			if(vista.responderPregunta(preguntaActual)==true) {
				mundo.darPreguntas()[i].modificarRespuesta(true);
			}
		}
		
		if(mundo.darLetraConMasPuntosSegunTipo(Tipo.APTITUDES)==Letra.C)
		{
			JOptionPane.showMessageDialog(null, "Su carrera ideal según sus aptitudes pertenece a Administrativas y contables", "Resultado aptitudes", JOptionPane.DEFAULT_OPTION);
		}
		if(mundo.darLetraConMasPuntosSegunTipo(Tipo.APTITUDES)==Letra.H)
		{
			JOptionPane.showMessageDialog(null, "Su carrera ideal según sus aptitudes pertenece a Humanísticas y sociales", "Resultado aptitudes", JOptionPane.DEFAULT_OPTION);
			
		}
		if(mundo.darLetraConMasPuntosSegunTipo(Tipo.APTITUDES)==Letra.A)
		{
			JOptionPane.showMessageDialog(null, "Su carrera ideal según sus aptitudes pertenece a Artísticas", "Resultado aptitudes", JOptionPane.DEFAULT_OPTION);
			
		}
		if(mundo.darLetraConMasPuntosSegunTipo(Tipo.APTITUDES)==Letra.S)
		{
			JOptionPane.showMessageDialog(null, "Su carrera ideal según sus aptitudes pertenece a Medicina y ciencias de la salud", "Resultado aptitudes", JOptionPane.DEFAULT_OPTION);
			
		}
		if(mundo.darLetraConMasPuntosSegunTipo(Tipo.APTITUDES)==Letra.I)
		{
			JOptionPane.showMessageDialog(null, "Su carrera ideal según sus aptitudes pertenece a Ingeniería y computación", "Resultado aptitudes", JOptionPane.DEFAULT_OPTION);
			
		}
		if(mundo.darLetraConMasPuntosSegunTipo(Tipo.APTITUDES)==Letra.D)
		{
			JOptionPane.showMessageDialog(null, "Su carrera ideal según sus aptitudes pertenece a Defensa y seguridad", "Resultado aptitudes", JOptionPane.DEFAULT_OPTION);
			
		}
		if(mundo.darLetraConMasPuntosSegunTipo(Tipo.APTITUDES)==Letra.E)
		{
			JOptionPane.showMessageDialog(null, "Su carrera ideal según sus aptitudes pertenece a Ciencias exactas y agrarias", "Resultado aptitudes", JOptionPane.DEFAULT_OPTION);
			
		}
		
		
	
		
		if(mundo.darLetraConMasPuntosSegunTipo(Tipo.INTERESES)==Letra.C) {
			JOptionPane.showMessageDialog(null, "Su carrera ideal según sus intereses pertenece a Administrativas y contables", "Resultado intereses", JOptionPane.DEFAULT_OPTION);
			
		}
		if(mundo.darLetraConMasPuntosSegunTipo(Tipo.INTERESES)==Letra.H) {
			JOptionPane.showMessageDialog(null, "Su carrera ideal según sus intereses pertenece a Humanísticas y sociales", "Resultado intereses", JOptionPane.DEFAULT_OPTION);

		}
		if(mundo.darLetraConMasPuntosSegunTipo(Tipo.INTERESES)==Letra.A) {
			JOptionPane.showMessageDialog(null, "Su carrera ideal según sus intereses pertenece a Artísticas", "Resultado intereses", JOptionPane.DEFAULT_OPTION);

		}
		if(mundo.darLetraConMasPuntosSegunTipo(Tipo.INTERESES)==Letra.S) {
			JOptionPane.showMessageDialog(null, "Su carrera ideal según sus intereses pertenece a Medicina y ciencias de la salud", "Resultado intereses", JOptionPane.DEFAULT_OPTION);

		}
		if(mundo.darLetraConMasPuntosSegunTipo(Tipo.INTERESES)==Letra.I) {
			JOptionPane.showMessageDialog(null, "Su carrera ideal según sus intereses pertenece a Ingeniería y computación", "Resultado intereses", JOptionPane.DEFAULT_OPTION);

		}
		if(mundo.darLetraConMasPuntosSegunTipo(Tipo.INTERESES)==Letra.D) {
			JOptionPane.showMessageDialog(null, "Su carrera ideal según sus intereses pertenece a Defensa y seguridad", "Resultado intereses", JOptionPane.DEFAULT_OPTION);

		}
		if(mundo.darLetraConMasPuntosSegunTipo(Tipo.INTERESES)==Letra.E) {
			JOptionPane.showMessageDialog(null, "Su carrera ideal según sus intereses pertenece a Ciencias exactas y agrarias", "Resultado intereses", JOptionPane.DEFAULT_OPTION);

		}
		
		
		
	}
	
}
