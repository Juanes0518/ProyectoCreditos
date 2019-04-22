package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Mundo;
import Vista.InterfazGUI;
public class Controlador implements ActionListener {
	private Mundo bd;
	private InterfazGUI gui;
	public Controlador() {
		bd = new Mundo();
		gui = new InterfazGUI(this);
		gui.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getActionCommand().equals(gui.getPanelentrada().CALCULAR)) {
			gui.getPanelresultados().getTasaEfectiva().setText(String.valueOf(bd.getCredito().tasaEfectiva(Double.parseDouble(gui.getPanelentrada()
					.getInteres().getText()))) + "%");
			
			gui.getPanelresultados().getValorAnualidad().setText(String.valueOf(bd.getCredito().calcularAnualidad(
					bd.getCredito().getTasaEfectiva(), Integer.parseInt(gui.getPanelentrada().getPeriodo().getText()))));
			
			gui.getPanelresultados().getValorCuota().setText(String.valueOf(bd.getCredito().valorCuota(
					Double.parseDouble(gui.getPanelentrada().getInversion().getText()), bd.getCredito().getValorAnualidad())));
		
	}

	}}
