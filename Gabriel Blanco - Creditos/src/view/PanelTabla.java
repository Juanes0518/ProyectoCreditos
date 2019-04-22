package view;

import java.util.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PanelTabla extends JPanel
{
	/*
	 * Se declaran los atributos de PanelTabla
	 */
	private static final long serialVersionUID = 1L; //El serial predeterminado que ayuda a funcionar el programa
	private String[] nombreColumnas;
	private int filas;
	private int columnas;
	private JTable table;
	private Object[][] data;
	private DefaultTableModel model;
	private Vector<Object> row;
	private JScrollPane scroll;
	
	/*
	 * Se declara el constructor de PanelTabla
	 */
	public PanelTabla()
	{
		nombreColumnas = new String[] {"# Cuota", "Saldo Pesos", "Cuota Pesos", "Interes", "Amortizacion"};
		data = new Object[][] {{"0", "0", "0", "0", "0"}};
		table = new JTable(data, nombreColumnas);
		model = new DefaultTableModel();
		row = new Vector<Object>();
		table.setFillsViewportHeight(true);
		table.setVisible(true);
		scroll = new JScrollPane(table);
		model.setColumnCount(columnas);
		model.setRowCount(filas);
		model.addRow(row);
		add(scroll);
	}
	/*
	 * Método para actualizar la tabla.
	 */
	public void updateTabla()
	{
		model.fireTableDataChanged(); 
	}
	/*
	 * Getters & Setters generados automáticamente por usuario con Eclipse IDE
	 */
	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

	public Object[][] getData() {
		return data;
	}

	public void setData(Object[][] data) {
		this.data = data;
	}

	public Vector<Object> getRow() {
		return row;
	}

	public void setRow(Vector<Object> row) {
		this.row = row;
	}
	
}
