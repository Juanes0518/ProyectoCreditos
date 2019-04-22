package Vista;
import java.awt.Color;





import java.awt.GridLayout;

import javax.swing.BorderFactory;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
public class PanelTabla extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JScrollPane scroll;
	private JTable tabla;

	public PanelTabla() {
		String[] columnas = new String[] {
	            "Cuota", "Saldo Pesos", "CuotaPesos", "Intereses","Armotización"
	        };
	         
	        //actual data for the table in a 2d array
	        Object[][] data = new Object[][] {
	            {0, " $28.070.000", "", "","" },
	            {1, " $27.693.972", "872.775.88","496.748.20","376.027.69" },
	            {2, " $27.693.972", "872.775.88","496.748.20","376.027.69" },
	            {3, " $27.693.972", "872.775.88","496.748.20","376.027.69" },
	            {4, " $27.693.972", "872.775.88","496.748.20","376.027.69" },
	            {5, " $27.693.972", "872.775.88","496.748.20","376.027.69" },
	            {6, " $27.693.972", "872.775.88","496.748.20","376.027.69" },
	            {7, " $27.693.972", "872.775.88","496.748.20","376.027.69" },
	            {8, " $27.693.972", "872.775.88","496.748.20","376.027.69" },
	            {9, " $27.693.972", "872.775.88","496.748.20","376.027.69" },
	            {10, " $27.693.972", "872.775.88","496.748.20","376.027.69"},
	            {11, " $27.693.972", "872.775.88","496.748.20","376.027.69"},
	            {12, " $27.693.972", "872.775.88","496.748.20","376.027.69"},
	            {13, " $27.693.972", "872.775.88","496.748.20","376.027.69"},
	            {14, " $27.693.972", "872.775.88","496.748.20","376.027.69"},
	            {15, " $27.693.972", "872.775.88","496.748.20","376.027.69"},
	            {16, " $27.693.972", "872.775.88","496.748.20","376.027.69"},
	            {17, " $27.693.972", "872.775.88","496.748.20","376.027.69"},
	            {18, " $27.693.972", "872.775.88","496.748.20","376.027.69"},
	            {19, " $27.693.972", "872.775.88","496.748.20","376.027.69"},
	            {20, " $27.693.972", "872.775.88","496.748.20","376.027.69"},
	            
	        };
	        
	        setLayout(new GridLayout(1,1));
		TitledBorder border = BorderFactory.createTitledBorder("Tabla ");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
       tabla = new JTable(data, columnas);
        this.setPreferredSize(new Dimension(400,16*(tabla.getRowCount()+2)));
        scroll = new JScrollPane(tabla);
        add(scroll);
	}
}
