package todopc;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import todopc.equipos.Desktop;
import todopc.equipos.Laptop;
import todopc.equipos.Tablet;

public class AddListEquipo {

	// Arreglo para almacenar objetos
	ArrayList<Desktop> listDesktop = new ArrayList<Desktop>();
	ArrayList<Laptop> listLaptop = new ArrayList<Laptop>();
	ArrayList<Tablet> listTablet = new ArrayList<Tablet>();

	// Desktop
	// Método para guardar objeto
	public void addDesktop() {
		// Instancia a la clase Desktop
		Desktop desktop = new Desktop();
		// instancia a la clase JFrame
		JFrame frame = new JFrame();
		//
		JTextField fabricante = new JTextField(10);
		JTextField modelo = new JTextField(10);
		JTextField microProce = new JTextField(10);
		JTextField capacDiskDuro = new JTextField(10);
		JTextField memoria = new JTextField(10);
		JTextField tarjGrafica = new JTextField(10);
		JTextField tamanioTorre = new JTextField(10);

		// labels del formulario
		Object[] msg = { "Frabricante:", fabricante, "Modelo:", modelo, "Microprocesador:", microProce, "Memoria:",
				memoria, "Tarjeta gráfica:", tarjGrafica, "Tamaño de torre:", tamanioTorre, "Capacidad de disco duro:",
				capacDiskDuro };

		JOptionPane.showConfirmDialog(frame, msg, "Registrar Desktop",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		// Se insertan los datos en el objeto desktop
		desktop.setFabricante(fabricante.getText());
		desktop.setModelo(modelo.getText());
		desktop.setMicroProce(microProce.getText());
		desktop.setCapacDiskDuro(capacDiskDuro.getText());
		desktop.setTatjGrafica(tarjGrafica.getText());
		desktop.setMemoria(memoria.getText());
		desktop.setTamanioTorre(tamanioTorre.getText());
		listDesktop.add(desktop);
	}

	// Método para mostrar
	public String getDesktopInfo() {
		String mensaje = "";

		for (int i = 0; i < listDesktop.size(); i++) {
			Desktop info = listDesktop.get(i);
			mensaje += "DESKTOP \n Fabricante: " + info.getFabricante() + "\n Modelo: " + info.getModelo()
					+ "\n Microprocesador: " + info.getMicroProce() + "\n Memoria: " + info.getMemoria()
					+ "\n Tarjeta gráfica: " + info.getTarjGrafica() + "\n Tamaño de torre: " + info.getTamanioTorre()
					+ "\n Capacidad de disco duro: " + info.getCapacDiskDuro() + "\n \n";
		}
		return mensaje;
	}

	// Laptop
	// Método para guardar objeto
	public void addLaptop() {
		Laptop laptop = new Laptop();

		JFrame frame = new JFrame("Registrar Laptop");

		JTextField fabricante = new JTextField(10);
		JTextField modelo = new JTextField(10);
		JTextField microProce = new JTextField(10);
		JTextField memoria = new JTextField(10);
		JTextField tamanioPantalla = new JTextField(10);
		JTextField capacDiskDuro = new JTextField(10);

		Object[] msg = { "Fabricante:", fabricante, "Modelo:", modelo, "Microprocesador:", microProce, "Memoria:",
				memoria, "Tamaño pantalla:", tamanioPantalla, "Capacidad de disco duro:", capacDiskDuro, };

		JOptionPane.showConfirmDialog(frame, msg, "Registrar Laptop", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

		// se insertan los datos en el objeto laptop
        laptop.setFabricante(fabricante.getText());
		laptop.setModelo(modelo.getText());
		laptop.setMicroProce(microProce.getText());
		laptop.setCapacDiskDuro(capacDiskDuro.getText());
		laptop.setTamanioPantall(tamanioPantalla.getText());
		laptop.setMemoria(memoria.getText());
		listLaptop.add(laptop);
	}

	// Método para mostrar
	public String getLaptopInfo() {
		String mensaje = "";

		for (int i = 0; i < listLaptop.size(); i++) {
			Laptop info = listLaptop.get(i);
			mensaje += "LAPTOP\n Fabricante: " + info.getFabricante() + "\n Modelo: " + info.getModelo()
					+ "\n Microprocesador: " + info.getMicroProce() + "\n Memoria: " + info.getMemoria()
					+ "\n Tamaño pantalla: " + info.getTamanioPantalla() + "\n Capacidad de disco duro: "
					+ info.getCapacDiskDuro() + "\n \n";
		}
		return mensaje;
	}

	// Tablet
	// Método para guardar objeto
	public void addTablet() {
		Tablet tablet = new Tablet();

		JFrame frame = new JFrame("Registrar Tablet");

		JTextField fabricante = new JTextField(10);
		JTextField modelo = new JTextField(10);
		JTextField microProce = new JTextField(10);
		JTextField longDiagPantalla = new JTextField(10);
		JTextField tipoPantalla = new JTextField(10);
		JTextField memoriaNand = new JTextField(10);
		JTextField tipoSO = new JTextField(10);

		Object[] msg = { "Fabricante:", fabricante, "Modelo:", modelo, "Microprocesador:", microProce,
				"Tamaño diagonal de pantalla:", longDiagPantalla, "¿Capacitiva/Resistiva?", tipoPantalla,
				"Tamaño memoria NAND:", memoriaNand, "Sistema Operativo:", tipoSO };

		JOptionPane.showConfirmDialog(frame, msg, "Registrar Tablet", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

		// Se insertan los datos en el objeto tablet
		tablet.setFabricante(fabricante.getText());
		tablet.setModelo(modelo.getText());
		tablet.setMicroProce(microProce.getText());
		tablet.setLongDiagPantalla(longDiagPantalla.getText());
		tablet.setTipoPantalla(tipoPantalla.getText());
		tablet.setMemoriaNand(memoriaNand.getText());
		tablet.setTipoSo(tipoSO.getText());
		listTablet.add(tablet);
	}

	// Método para mostrar
	public String getTabletInfo() {
		String mensaje = "";

		for (int i = 0; i < listTablet.size(); i++) {
			Tablet info = listTablet.get(i);
			mensaje += "TABLETS \n Fabricante: " + info.getFabricante() + "\n Modelo: " + info.getModelo()
					+ "\n Microprocesador: " + info.getMicroProce() + "\n Tamaño diagonal de pantalla: "
					+ info.getLongDiagPantalla() + "\n ¿Capacitiva/Resistiva?: " + info.getTipoPantalla()
					+ "\n Tamaño memoria NAND: " + info.getMemoriaNand() + "\n Sistema Operativo: " + info.getTipoSo()
					+ " \n \n";
		}
		return mensaje;
	}
}
