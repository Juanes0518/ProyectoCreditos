package view;

import java.awt.*;
import javax.swing.*;

public class PanelClientes extends JPanel
{
	/*
	 * Se declaran los atributos para el panel
	 */
	private static final long serialVersionUID = 1L; //El serial por defecto de la clase.
	private JLabel etiqMonto, etiqPlazo, etiqInteres, etiqTasaEfectiva, etiqValorAnual, etiqValorCuota, etiqCliente, etiqTipoDocumento, etiqDocumento; //El texto que va antes del texto.
	private JTextField txMonto, txPlazo, txInteres, txTasaEfectiva, txValorAnual, txCuota, txCliente, txDocumento; //Los campos de texto.
	private String[] ListaDocs = {"Cédula de Ciudadanía", "NUIP / Tarjeta de Identidad", "Cédula de Extranjería", "Pasaporte", "Otro tipo de Documento"}; //String para el tipo de documento.
	private JComboBox<String> lTipoDocumento2; //Lista para el tipo de documento.
	private JButton cotizar, borrar;
	public static final String COTIZAR = "Cotizar";
	public static final String BORRAR = "Borrar";
	/*
	 * Método constructor para el Panel Clientes
	 */
	public PanelClientes()
	{
		/*
		 * Parámetros del panel
		 */
		setLayout(new GridLayout(10, 2));
		
		/*
		 * Campo cliente
		 */
		etiqCliente = new JLabel("Cliente");
		txCliente = new JTextField();
		txCliente.setForeground(Color.BLACK);
		txCliente.setBackground(Color.WHITE);
		add(etiqCliente);
		add(txCliente);
		
		/*
		 * Campo tipo de documento
		 */
		etiqTipoDocumento = new JLabel("Tipo Documento");
		lTipoDocumento2 = new JComboBox<>(ListaDocs);
		lTipoDocumento2.setForeground(Color.BLACK);
		lTipoDocumento2.setBackground(Color.WHITE);
		add(etiqTipoDocumento);
		add(lTipoDocumento2);
		
		/*
		 * Campo ID
		 */
		etiqDocumento = new JLabel("ID Documento");
		txDocumento = new JTextField();
		txDocumento.setForeground(Color.BLACK);
		txDocumento.setBackground(Color.WHITE);
		add(etiqDocumento);
		add(txDocumento);
		
		/*
		 * Campo monto a prestar
		 */
		etiqMonto = new JLabel("Monto");
		txMonto = new JTextField();
		txMonto.setForeground(Color.BLACK);
		txMonto.setBackground(Color.WHITE);
		add(etiqMonto);
		add(txMonto);
		
		/*
		 * Campo plazo (número de meses a pagar)
		 */
		etiqPlazo = new JLabel("Plazo");
		txPlazo = new JTextField();
		txPlazo.setForeground(Color.BLACK);
		txPlazo.setBackground(Color.WHITE);
		add(etiqPlazo);
		add(txPlazo);
		
		/*
		 * Campo tasa de interés
		 */
		etiqInteres = new JLabel("Interés");
		txInteres = new JTextField();
		txInteres.setForeground(Color.BLACK);
		txInteres.setBackground(Color.WHITE);
		add(etiqInteres);
		add(txInteres);
		
		/*
		 * Campo tasa Efectiva
		 */
		etiqTasaEfectiva = new JLabel("Tasa Efectiva");
		txTasaEfectiva = new JTextField();
		txTasaEfectiva.setForeground(Color.BLACK);
		txTasaEfectiva.setBackground(Color.LIGHT_GRAY);
		add(etiqTasaEfectiva);
		add(txTasaEfectiva);
		
		/*
		 * Campo valor anual
		 */
		etiqValorAnual = new JLabel("Valor Anual");
		txValorAnual = new JTextField();
		txValorAnual.setForeground(Color.BLACK);
		txValorAnual.setBackground(Color.LIGHT_GRAY);
		add(etiqValorAnual);
		add(txValorAnual);
		
		/*
		 * Campo valor cuota
		 */
		etiqValorCuota = new JLabel("Valor Cuota");
		txCuota = new JTextField();
		txCuota.setForeground(Color.BLACK);
		txCuota.setBackground(Color.LIGHT_GRAY);
		add(etiqValorCuota);
		add(txCuota);
		
		/*
		 * Boton Cotizar
		 */
		cotizar = new JButton("Cotizar");
		cotizar.setActionCommand(COTIZAR);
		add(cotizar);
		
		/*
		 * Boton Borrar
		 */
		borrar = new JButton("Borrar");
		borrar.setActionCommand(BORRAR);
		add(borrar);
	}
	public JLabel getEtiqMonto() {
		return etiqMonto;
	}
	public void setEtiqMonto(JLabel etiqMonto) {
		this.etiqMonto = etiqMonto;
	}
	public JLabel getEtiqPlazo() {
		return etiqPlazo;
	}
	public void setEtiqPlazo(JLabel etiqPlazo) {
		this.etiqPlazo = etiqPlazo;
	}
	public JLabel getEtiqInteres() {
		return etiqInteres;
	}
	public void setEtiqInteres(JLabel etiqInteres) {
		this.etiqInteres = etiqInteres;
	}
	public JLabel getEtiqTasaEfectiva() {
		return etiqTasaEfectiva;
	}
	public void setEtiqTasaEfectiva(JLabel etiqTasaEfectiva) {
		this.etiqTasaEfectiva = etiqTasaEfectiva;
	}
	public JLabel getEtiqValorAnual() {
		return etiqValorAnual;
	}
	public void setEtiqValorAnual(JLabel etiqValorAnual) {
		this.etiqValorAnual = etiqValorAnual;
	}
	public JLabel getEtiqValorCuota() {
		return etiqValorCuota;
	}
	public void setEtiqValorCuota(JLabel etiqValorCuota) {
		this.etiqValorCuota = etiqValorCuota;
	}
	public JLabel getEtiqCliente() {
		return etiqCliente;
	}
	public void setEtiqCliente(JLabel etiqCliente) {
		this.etiqCliente = etiqCliente;
	}
	public JLabel getEtiqTipoDocumento() {
		return etiqTipoDocumento;
	}
	public void setEtiqTipoDocumento(JLabel etiqTipoDocumento) {
		this.etiqTipoDocumento = etiqTipoDocumento;
	}
	public JLabel getEtiqDocumento() {
		return etiqDocumento;
	}
	public void setEtiqDocumento(JLabel etiqDocumento) {
		this.etiqDocumento = etiqDocumento;
	}
	public JTextField getTxMonto() {
		return txMonto;
	}
	public void setTxMonto(JTextField txMonto) {
		this.txMonto = txMonto;
	}
	public JTextField getTxPlazo() {
		return txPlazo;
	}
	public void setTxPlazo(JTextField txPlazo) {
		this.txPlazo = txPlazo;
	}
	public JTextField getTxInteres() {
		return txInteres;
	}
	public void setTxInteres(JTextField txInteres) {
		this.txInteres = txInteres;
	}
	public JTextField getTxTasaEfectiva() {
		return txTasaEfectiva;
	}
	public void setTxTasaEfectiva(JTextField txTasaEfectiva) {
		this.txTasaEfectiva = txTasaEfectiva;
	}
	public JTextField getTxValorAnual() {
		return txValorAnual;
	}
	public void setTxValorAnual(JTextField txValorAnual) {
		this.txValorAnual = txValorAnual;
	}
	public JTextField getTxCuota() {
		return txCuota;
	}
	public void setTxCuota(JTextField txCuota) {
		this.txCuota = txCuota;
	}
	public JTextField getTxCliente() {
		return txCliente;
	}
	public void setTxCliente(JTextField txCliente) {
		this.txCliente = txCliente;
	}
	public JTextField getTxDocumento() {
		return txDocumento;
	}
	public void setTxDocumento(JTextField txDocumento) {
		this.txDocumento = txDocumento;
	}
	public JComboBox<String> getlTipoDocumento2() {
		return lTipoDocumento2;
	}
	public void setlTipoDocumento2(JComboBox<String> lTipoDocumento2) {
		this.lTipoDocumento2 = lTipoDocumento2;
	}
	public JButton getCotizar() {
		return cotizar;
	}
	public void setCotizar(JButton cotizar) {
		this.cotizar = cotizar;
	}
	public JButton getBorrar() {
		return borrar;
	}
	public void setBorrar(JButton borrar) {
		this.borrar = borrar;
	}
}
