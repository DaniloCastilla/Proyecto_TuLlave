package controlador;

import modelo.TuLlave;
import vista.PanelBalance;

public class Controlador {

	private TuLlave Ykey;
	private PanelBalance pnlPBalance;
	
	public Controlador() {
		this.Ykey = new TuLlave();
	}
	
	public void conectar(PanelBalance pnlPBalance) {
		this.pnlPBalance = pnlPBalance;
	}
	
}
