package view;

import java.awt.*;

import javax.swing.*;

public class PanelGrande extends JPanel
{
	private static final long serialVersionUID = 1L;//El serial por defecto de la clase
	private PanelClientes pclientes;
	private PanelTabla ptabla;
	
	public PanelGrande()
	{
		setLayout(new GridLayout(1, 2));
		pclientes = new PanelClientes();
		ptabla = new PanelTabla();
		//add(ptabla);
		add(pclientes);
	}

	public PanelClientes getPclientes() {
		return pclientes;
	}

	public void setPclientes(PanelClientes pclientes) {
		this.pclientes = pclientes;
	}

	public PanelTabla getPtabla() {
		return ptabla;
	}

	public void setPtabla(PanelTabla ptabla) {
		this.ptabla = ptabla;
	}
	

}
