package vista;

import controlador.Controlador;

public class InterfazApp {

	private PanelSet pnlPSet;
	private PanelPay pnlPPay;
	private PanelBalance pnlPBalance;
	private Controlador ctrl;
	
	public InterfazApp(Controlador ctrl) {
		
		pnlPSet = new PanelSet(ctrl);
		pnlPPay = new PanelPay(ctrl);
		pnlPBalance = new PanelBalance();
		this.ctrl = ctrl;
		
	}
	
}
