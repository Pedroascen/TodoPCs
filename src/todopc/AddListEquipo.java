package todopc;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import todopc.equipos.Desktop;

public class AddListEquipo {
	//instancia de clase Equipo
	Desktop desktop = new Desktop();
	//Arreglo para equipos 
	ArrayList<Desktop> listequipo = new ArrayList<Desktop>();
	
	//Metodo para el option Pane
	public String Input(String text) {
		return JOptionPane.showInputDialog(text);
	}
	
	//Metodo para guardar objeto
	public void addDesktop() {
		String tarjGrafica = Input("Ingrese la targeta grafica de la Desktop:");
		String memoria = Input("Ingrese la memoria Ram:");
		
		//se insertan los datos en el objeto desktop
		desktop.setTatjGrafica(tarjGrafica);
		desktop.setMemoria(memoria);
		listequipo.add(desktop);
	}
	//metodo para mostrar
	public void getDesktop() {
		for(int i=0; i<listequipo.size(); i++) {
			desktop.VerMensaje();
		}
	}
}
