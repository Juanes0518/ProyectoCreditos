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
		try {
		if(evento.getActionCommand().equals(gui.getPanelEntrada().CALCULAR)) {
			gui.getPanelResultados().getTasaEfectiva().setText(String.valueOf(bd.getCredito().tasaEfectiva(Double.parseDouble(gui.getPanelEntrada()
					.getInteres().getText()))) + "%");
			
			gui.getPanelResultados().getValorAnualidad().setText(String.valueOf(bd.getCredito().calcularAnualidad(
					bd.getCredito().getTasaEfectiva(), Integer.parseInt(gui.getPanelEntrada().getPeriodo().getText()))));
			
			gui.getPanelResultados().getValorCuota().setText(String.valueOf(bd.getCredito().valorCuota(
					Double.parseDouble(gui.getPanelEntrada().getInversion().getText()), bd.getCredito().getValorAnualidad())));
		

			
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().CALCULAR)) {
			
			gui.getPanelTabla().getModelo().addRow(new Object[] {
					"0",bd.getCredito().calcularSaldoResta()
			});
			
			for (int i = 1; i < Integer.parseInt(gui.getPanelEntrada().getPeriodo().getText()) ; i++) {
				bd.getCredito().calcularAmortizacion();
				gui.getPanelTabla().getModelo().addRow(new Object[] {
						String.valueOf(i),bd.getCredito().calcularSaldoResta(),bd.getCredito().getCuota(),
						bd.getCredito().calcularValorInteres(), bd.getCredito().calcularAmortizacion()
				});
			
				
			}
			gui.getPanelTabla().getModelo().addRow(new Object[] {
					bd.getCredito().getPeriodo(),"0",bd.getCredito().getCuota(),
					bd.getCredito().calcularValorInteres(), bd.getCredito().calcularAmortizacion()
			});
			gui.getPanelEntrada().getbCalcular().setEnabled(false);
			
		}
		

	}}
