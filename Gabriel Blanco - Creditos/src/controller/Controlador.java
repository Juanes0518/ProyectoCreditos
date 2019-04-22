package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Mundo;
import view.InterfazGUI;

public class Controlador implements ActionListener
{
	/*
	 * Se asignan los atributos Mundo e InterfazGUI como bd y gui respectivamente.
	 */
	private Mundo bd; // Este es el modelo
	private InterfazGUI gui; // Esta es la vista
	private DateFormat df; // Formato de fecha
	private Date date; // fecha y hora
	/*
	 * Este es el método constructor del controlador donde se hacen las funciones que tienen que hacer :v.
	 */
	public Controlador()
	{
		bd = new Mundo(); // Instancia de model.Mundo
		gui = new InterfazGUI(this); // Instancia de view.InterfazGUI
		df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss"); // Instancia de formato de fecha
		date = new Date(); // Instancia de Fecha
	}
	/*
	 * El actionPerformed es donde se escuchan los botones desde la interfaz para hacer el resto de funciones que tienen que hacer.
	 */
	@SuppressWarnings("static-access")
	public void actionPerformed(ActionEvent evento) 
	{
		try 
		{
			/*
			 * Barra del menú en caso de obtener ayuda
			 */
			if(evento.getActionCommand() == gui.getPbarra().OBTENERAYUDA)
			{
				bd.getA().saveLog(bd.getA().readLog()+"\n----------------------User clicked on 'Obtener Ayuda' on "+df.format(date)+"----------------------");
				gui.openHelp();
			}
			if(evento.getActionCommand() == gui.getPbarra().CERRAR)
			{
				bd.getA().saveLog(bd.getA().readLog()+"\n----------------------User clicked on 'Cerrar' on "+df.format(date)+"----------------------");
				System.exit(0);
			}
			if(evento.getActionCommand() == gui.getPbarra().ACERCADE)
			{
				bd.getA().saveLog(bd.getA().readLog()+"\n----------------------User clicked on 'Acerca De...' on "+df.format(date)+"----------------------");
				gui.getAlerta().AboutUs();
			}
			if(evento.getActionCommand() == gui.getPbarra().GUARDAR)
			{
				bd.getA().saveLog(bd.getA().readLog()+"\n----------------------User clicked on 'Guardar' on "+df.format(date)+"----------------------");
				if(bd.getA().getCred() == null)
				{
					/*
					 * Si no existe un archivo .cred con la cotización existente, se abre el diálogo de guardar como.
					 */
					bd.getA().saveCredAs("Hola "+gui.getPGrande().getPclientes().getTxCliente().getText().toUpperCase()+" Esta es tu cotización, verifica que los datos sean correctos.\n\n"
							+ bd.getBd().getNombre() + gui.getPGrande().getPclientes().getTxCliente().getText() +"\n"
							+ bd.getBd().getTipodoc() + gui.getPGrande().getPclientes().getlTipoDocumento2().getSelectedItem().toString() +"\n"
							+ bd.getBd().getId() + gui.getPGrande().getPclientes().getTxDocumento().getText()+"\n"
							+ bd.getBd().getMonto() + gui.getPGrande().getPclientes().getTxMonto().getText()+"\n"
							+ bd.getBd().getPlazo() + gui.getPGrande().getPclientes().getTxPlazo().getText()+"\n"
							+ bd.getBd().getInteres() + gui.getPGrande().getPclientes().getTxInteres().getText()+"\n"
							+ bd.getBd().getTefectiva() + gui.getPGrande().getPclientes().getTxTasaEfectiva().getText()+"\n"
							+ bd.getBd().getVanual() + gui.getPGrande().getPclientes().getTxValorAnual().getText()+"\n"
							+ bd.getBd().getVcuota() + gui.getPGrande().getPclientes().getTxCuota().getText()+"\n");
					gui.setTitle("CreditoFacil - "+bd.getA().getCred());
				}
				else
				{
					/*
					 * Si el archivo está abierto y solamente se está editando, solo se guarda.
					 */
					bd.getA().saveCred("Hello \n"
							+ bd.getBd().getNombre() + gui.getPGrande().getPclientes().getTxCliente().getText() +"\n"
							+ bd.getBd().getTipodoc() + gui.getPGrande().getPclientes().getlTipoDocumento2().getSelectedItem().toString() +"\n"
							+ bd.getBd().getId() + gui.getPGrande().getPclientes().getTxDocumento().getText()+"\n"
							+ bd.getBd().getMonto() + gui.getPGrande().getPclientes().getTxMonto().getText()+"\n"
							+ bd.getBd().getPlazo() + gui.getPGrande().getPclientes().getTxPlazo().getText()+"\n"
							+ bd.getBd().getInteres() + gui.getPGrande().getPclientes().getTxInteres().getText()+"\n"
							+ bd.getBd().getTefectiva() + gui.getPGrande().getPclientes().getTxTasaEfectiva().getText()+"\n"
							+ bd.getBd().getVanual() + gui.getPGrande().getPclientes().getTxValorAnual().getText()+"\n"
							+ bd.getBd().getVcuota() + gui.getPGrande().getPclientes().getTxCuota().getText()+"\n");
				}
				bd.getA().saveLog(bd.getA().readLog()+"\nFile successfully saved in "+bd.getA().getCred()+" on: "+df.format(date));
			}
			if(evento.getActionCommand() == gui.getPbarra().GUARDARCOMO)
			{
				/*
				 * Diálogo de guardar como
				 */
				bd.getA().saveLog(bd.getA().readLog()+"\n----------------------User clicked on 'Guardar Como' on "+df.format(date)+"----------------------");
				bd.getA().saveCredAs("Hello \n"
						+ bd.getBd().getNombre() + gui.getPGrande().getPclientes().getTxCliente().getText() +"\n"
						+ bd.getBd().getTipodoc() + gui.getPGrande().getPclientes().getlTipoDocumento2().getSelectedItem().toString() +"\n"
						+ bd.getBd().getId() + gui.getPGrande().getPclientes().getTxDocumento().getText()+"\n"
						+ bd.getBd().getMonto() + gui.getPGrande().getPclientes().getTxMonto().getText()+"\n"
						+ bd.getBd().getPlazo() + gui.getPGrande().getPclientes().getTxPlazo().getText()+"\n"
						+ bd.getBd().getInteres() + gui.getPGrande().getPclientes().getTxInteres().getText()+"\n"
						+ bd.getBd().getTefectiva() + gui.getPGrande().getPclientes().getTxTasaEfectiva().getText()+"\n"
						+ bd.getBd().getVanual() + gui.getPGrande().getPclientes().getTxValorAnual().getText()+"\n"
						+ bd.getBd().getVcuota() + gui.getPGrande().getPclientes().getTxCuota().getText()+"\n");
				gui.setTitle("CreditoFacil - "+bd.getA().getCred());
				bd.getA().saveLog(bd.getA().readLog()+"\nFile successfully saved in "+bd.getA().getCred()+" on: "+df.format(date));
			}
			if(evento.getActionCommand().equals(gui.getPGrande().getPclientes().COTIZAR))
			{
				/*
				 * Botón de cotizar hace correr y renderizar la tabla
				 */
				bd.getA().saveLog(bd.getA().readLog()+"\n----------------------User clicked on 'Cotizar' on "+df.format(date)+"----------------------"
						+ "\nUII BEGINS"
						+ "\nUII:InterfazGUI.PanelGrande.PanelClientes.txCliente = '"+gui.getPGrande().getPclientes().getTxCliente().getText()+"'"
						+ "\nUII:InterfazGUI.PanelGrande.PanelClientes.lTipoDocumento2 = '"+gui.getPGrande().getPclientes().getlTipoDocumento2().getSelectedItem().toString()+"'"
						+ "\nUII:InterfazGUI.PanelGrande.PanelClientes.txDocumento = '"+gui.getPGrande().getPclientes().getTxDocumento().getText()+"'"
						+ "\nUII:InterfazGUI.PanelGrande.PanelClientes.txMonto = '"+gui.getPGrande().getPclientes().getTxMonto().getText()+"'"
						+ "\nUII:InterfazGUI.PanelGrande.PanelClientes.txPlazo = '"+gui.getPGrande().getPclientes().getTxPlazo().getText()+"'"
						+ "\nUII:InterfazGUI.PanelGrande.PanelClientes.txInteres = '"+gui.getPGrande().getPclientes().getTxInteres().getText()+"'"
						+ "\nEND UII");
				try 
				{
					bd.getCredit().setMonto(Double.parseDouble(gui.getPGrande().getPclientes().getTxMonto().getText()));
					bd.getCredit().setInteres(Double.parseDouble(gui.getPGrande().getPclientes().getTxInteres().getText()));
					bd.getCredit().setPlazo(Integer.parseInt(gui.getPGrande().getPclientes().getTxPlazo().getText()));
					gui.getPGrande().getPclientes().getTxTasaEfectiva().setText(String.valueOf(bd.getCredit().tasaEfectiva()));
					gui.getPGrande().getPclientes().getTxValorAnual().setText(String.valueOf(bd.getCredit().valorAnual()));
					gui.getPGrande().getPclientes().getTxCuota().setText(String.valueOf(bd.getCredit().valorCuota()));
					bd.getA().saveLog(bd.getA().readLog()+"\nBEGIN SWD"
							+ "\nSWD:InterfazGUI.PanelGrande.PanelClientes.txTasaEfectiva = '"+gui.getPGrande().getPclientes().getTxTasaEfectiva().getText()+"'"
							+ "\nSWD:InterfazGUI.PanelGrande.PanelClientes.txValorAnual = '"+gui.getPGrande().getPclientes().getTxValorAnual().getText()+"'"
							+ "\nSWD:InterfazGUI.PanelGrande.PanelClientes.txValorCuota = '"+gui.getPGrande().getPclientes().getTxCuota().getText()+"'"
							+ "\nEND SWD");

				} 
				catch (Exception e) 
				{
					String monto = gui.getPGrande().getPclientes().getTxMonto().getText();
					String interes = gui.getPGrande().getPclientes().getTxInteres().getText();
					String plazo = gui.getPGrande().getPclientes().getTxPlazo().getText();
					String error = e.toString();
					gui.getAlerta().MissingCannotCreate(monto, interes, plazo, error);
					bd.getA().saveLog(bd.getA().readLog()+"\nAN ERROR HAPPENED ON "+df.format(date)+": "+e);
				}
				gui.getPGrande().getPtabla().getModel().addRow(new Object[] {"You", "are", "so", "fucking", "awesome"});
				gui.getPGrande().getPtabla().updateTabla();
				
			}
			if(evento.getActionCommand() == gui.getPGrande().getPclientes().BORRAR)
			{
				/*
				 * El botón borrar.
				 */
				bd.getA().saveLog(bd.getA().readLog()+"\n----------------------User clicked on 'Borrar' on "+df.format(date)+"----------------------");
				gui.getPGrande().getPclientes().getTxCliente().setText("");
				gui.getPGrande().getPclientes().getlTipoDocumento2().setSelectedItem(null);
				gui.getPGrande().getPclientes().getTxDocumento().setText("");
				gui.getPGrande().getPclientes().getTxMonto().setText("");
				gui.getPGrande().getPclientes().getTxPlazo().setText("");
				gui.getPGrande().getPclientes().getTxInteres().setText("");
				gui.getPGrande().getPclientes().getTxTasaEfectiva().setText("");
				gui.getPGrande().getPclientes().getTxValorAnual().setText("");
				gui.getPGrande().getPclientes().getTxCuota().setText("");
			}
		} 
		catch (Exception e) 
		{
			/*
			 * Caso de error, guarda en el log y avisa al usuario.
			 */
			bd.getA().saveLog(bd.getA().readLog()+"\nAN ERROR HAPPENED ON "+df.format(date)+": "+e+": "+e.getMessage()+", "+e.getLocalizedMessage());
			gui.getAlerta().Error(e.toString());
		}
	}
}
