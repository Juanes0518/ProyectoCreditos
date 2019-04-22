package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class PanelMenuBar extends JPanel
{
	/*
	 * Se declaran los atributos de la barra
	 */
	private static final long serialVersionUID = 1L;//El serial por defecto de la clase
	private JMenuBar barraMenu;
	private JMenu mArchivo, mAyuda;
	private JMenuItem marCerrar, mayAcerca, marGuardar, marGuardarComo, marExportar, mayObtener;
	public static final String CERRAR = "Cerrar";
	public static final String ACERCADE = "AcercaDe";
	public static final String GUARDARCOMO = "GuardarComo";
	public static final String GUARDAR = "Guardar";
	public static final String OBTENERAYUDA = "ObtenerAyuda";
	
	/*
	 * Se declara el método constructor de la barra
	 */
	public PanelMenuBar()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		barraMenu = new JMenuBar();
		barraMenu.setSize(getPreferredSize());
		add(barraMenu);
		mArchivo = new JMenu("Archivo");
		mArchivo.setMnemonic(KeyEvent.VK_A);
		barraMenu.add(mArchivo);
		marGuardar = new JMenuItem("Guardar");
		marGuardar.setActionCommand(GUARDAR);
		marGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		mArchivo.add(marGuardar);
		marGuardarComo = new JMenuItem("Guardar Como...");
		marGuardarComo.setActionCommand(GUARDARCOMO);
		mArchivo.add(marGuardarComo);	
		marExportar = new JMenu("Exportar a");
		mArchivo.add(marExportar);	
		marCerrar = new JMenuItem("Cerrar");
		marCerrar.setActionCommand(CERRAR);
		marCerrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
		mArchivo.add(marCerrar);
		mAyuda = new JMenu("Ayuda");
		mAyuda.setMnemonic(KeyEvent.VK_Y);
		barraMenu.add(mAyuda);
		mayObtener = new JMenuItem("Obtener Ayuda");
		mayObtener.setActionCommand(OBTENERAYUDA);
		mayObtener.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, ActionEvent.ALT_MASK));
		mAyuda.add(mayObtener);
		mayAcerca = new JMenuItem("Acerca de...");
		mayAcerca.setActionCommand(ACERCADE);
		mAyuda.add(mayAcerca);
	}

	/*
	 * Getters & Setters generados por usuario automáticamente con Eclipse IDE
	 */
	public JMenuItem getMarCerrar() {
		return marCerrar;
	}

	public void setMarCerrar(JMenuItem marCerrar) {
		this.marCerrar = marCerrar;
	}

	public JMenuItem getMayAcerca() {
		return mayAcerca;
	}

	public void setMayAcerca(JMenuItem mayAcerca) {
		this.mayAcerca = mayAcerca;
	}

	public JMenuItem getMarGuardar() {
		return marGuardar;
	}

	public void setMarGuardar(JMenuItem marGuardar) {
		this.marGuardar = marGuardar;
	}

	public JMenuItem getMarGuardarComo() {
		return marGuardarComo;
	}

	public void setMarGuardarComo(JMenuItem marGuardarComo) {
		this.marGuardarComo = marGuardarComo;
	}

	public JMenuItem getMarExportar() {
		return marExportar;
	}

	public void setMarExportar(JMenuItem marExportar) {
		this.marExportar = marExportar;
	}

	public JMenuItem getMayObtener() {
		return mayObtener;
	}

	public void setMayObtener(JMenuItem mayObtener) {
		this.mayObtener = mayObtener;
	}
	
}
