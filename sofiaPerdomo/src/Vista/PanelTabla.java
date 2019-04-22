package Vista;
import javax.swing.BorderFactory;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
public class PanelTabla extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable txtMonto;
	private DefaultTableModel modelo ;
	private String[] tituloColumnas;
	public PanelTabla() {
		
			setLayout(new BorderLayout());
			TitledBorder border = BorderFactory.createTitledBorder("Resultados");
			border.setTitleColor(Color.BLACK);
			setBorder(border);
			tituloColumnas = new String[]{
					"Cuota","Saldo pesos","Cuota pesos","Intereses","Amortizacion"
			};
			modelo = new DefaultTableModel();
			modelo.setColumnIdentifiers(tituloColumnas);
			txtMonto = new JTable(modelo);
			JScrollPane panel = new JScrollPane(txtMonto);
			 panel.setVerticalScrollBarPolicy(
			            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			txtMonto.setForeground(Color.black);
			txtMonto.setBackground(Color.WHITE);
			
			add(panel);
		}


		public JTable getTxtMonto() {
			return txtMonto;
		}

		public void setTxtMonto(JTable txtMonto) {
			this.txtMonto = txtMonto;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}


		public DefaultTableModel getModelo() {
			return modelo;
		}


		public void setModelo(DefaultTableModel modelo) {
			this.modelo = modelo;
		}
}
