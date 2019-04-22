package vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class PanelTabla extends JPanel{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTable tabla;
	private DefaultTableModel model = new DefaultTableModel();
	private VentanaPrincipal Vista;
	private JButton btnTotal;
	Font fuente = new Font("Rockwell",Font.BOLD,12);
	public PanelTabla (VentanaPrincipal pVista){
		

		setLayout(null);
		setBorder(new TitledBorder("Tabla"));
		
		
		
		Vista = pVista;
	
	
	btnTotal= new JButton("Actualizar");
	btnTotal.setActionCommand(Vista.ACTUALIZAR_TABLA);
	btnTotal.setBounds(100, 235, 157, 30);	
	btnTotal.setFont(fuente);
	add(btnTotal);
	
	
	Vista = pVista;
		
    tabla = new JTable(model);
    model.addColumn("Cuota");
    model.addColumn("Saldo pesos");
    model.addColumn("Cuota pesos");
    model.addColumn("Intereses");
    model.addColumn("Amortizacion");
    JScrollPane tab = new JScrollPane(tabla);
    tab.setBounds(40,20,500,150);
    add(tab);
	}

	public JTable getTabla() {
		return tabla;
	}

	public void setTabla(JTable tabla) {
		this.tabla = tabla;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

	public VentanaPrincipal getVista() {
		return Vista;
	}

	public void setVista(VentanaPrincipal vista) {
		Vista = vista;
	}

	public JButton getBtnTotal() {
		return btnTotal;
	}

	public void setBtnTotalizar(JButton btnTotal) {
		this.btnTotal = btnTotal;
	}
	
	
	
	
}
