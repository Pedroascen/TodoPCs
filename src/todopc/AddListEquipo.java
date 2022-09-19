package todopc;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import todopc.equipos.Desktop;
import todopc.equipos.Laptop;
import todopc.equipos.Tablet;

public class AddListEquipo {
	// Instancia de objetos tipo Equipo
	Desktop desktop = new Desktop();
	Laptop laptop = new Laptop();
	Tablet tablet = new Tablet();

	// Arreglo para almacenar objetos
	ArrayList<Desktop> listDesktop = new ArrayList<Desktop>();
	ArrayList<Laptop> listLaptop = new ArrayList<Laptop>();
	ArrayList<Tablet> listTablet = new ArrayList<Tablet>();

	// Desktop
	// Método para guardar objeto
	public void addDesktop() {
		// Instancia a la clase Desktop
		Desktop desktop = new Desktop();
		// Instancia a la clase JFrame
		JFrame frame = new JFrame("Registrar Desktop");
		//
		JTextField fabricante = new JTextField(10);
		JTextField modelo = new JTextField(10);
		JTextField microProce = new JTextField(10);
		JTextField capacDiskDuro = new JTextField(10);
		JTextField memoria = new JTextField(10);
		JTextField tarjGrafica = new JTextField(10);
		JTextField tamanioTorre = new JTextField(11);

		// Labels del formulario
		Object[] msg = { "Fabricante:", fabricante, "Modelo:", modelo, "Microprocesador:", microProce, "Memoria:",
				memoria, "Tarjeta gráfica:", tarjGrafica, "Tamaño de torre:", tamanioTorre, "Capacidad de disco duro:",
				capacDiskDuro };

		// Validación para que ningún campo vaya vacío
		Object[] options = { "OK" };
		int selectedOption = JOptionPane.showOptionDialog(frame, msg, "Registrar Desktop", JOptionPane.NO_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		int isValid = 0;

		if (selectedOption == 0) {
			do {
				if (fabricante.getText().length() == 0 || modelo.getText().length() == 0
						|| microProce.getText().length() == 0 || capacDiskDuro.getText().length() == 0
						|| tarjGrafica.getText().length() == 0 || memoria.getText().length() == 0
						|| tamanioTorre.getText().length() == 0) {
					isValid = 1;
					JOptionPane.showMessageDialog(null, "Por favor ingrese un valor para todos campos.");
					JOptionPane.showConfirmDialog(frame, msg, "Registrar Desktop", JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.PLAIN_MESSAGE);

				} else {
					isValid = 0;
				}
			} while (isValid != 0);
		}

		// Se insertan los datos en el objeto desktop
		desktop.setFabricante(fabricante.getText());
		desktop.setModelo(modelo.getText());
		desktop.setMicroProce(microProce.getText());
		desktop.setCapacDiskDuro(capacDiskDuro.getText());
		desktop.setTatjGrafica(tarjGrafica.getText());
		desktop.setMemoria(memoria.getText());
		desktop.setTamanioTorre(tamanioTorre.getText());
		listDesktop.add(desktop);
		JOptionPane.showMessageDialog(null, "Desktop registrada exitosamente.");
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

		// Validación para que ningún campo vaya vacío
		Object[] options = { "OK" };
		int selectedOption = JOptionPane.showOptionDialog(frame, msg, "Registrar Laptop", JOptionPane.NO_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		int isValid = 0;
		if (selectedOption == 0) {
			do {
				if (fabricante.getText().length() == 0 || modelo.getText().length() == 0
						|| microProce.getText().length() == 0 || capacDiskDuro.getText().length() == 0
						|| tamanioPantalla.getText().length() == 0 || memoria.getText().length() == 0) {
					isValid = 1;
					JOptionPane.showMessageDialog(null, "Por favor ingrese un valor para todos campos.");
					JOptionPane.showConfirmDialog(frame, msg, "Registrar Laptop", JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.PLAIN_MESSAGE);

				} else {
					isValid = 0;
				}
			} while (isValid != 0);
		}

		// Se insertan los datos en el objeto laptop
		laptop.setFabricante(fabricante.getText());
		laptop.setModelo(modelo.getText());
		laptop.setMicroProce(microProce.getText());
		laptop.setCapacDiskDuro(capacDiskDuro.getText());
		laptop.setTamanioPantall(tamanioPantalla.getText());
		laptop.setMemoria(memoria.getText());
		listLaptop.add(laptop);
		JOptionPane.showMessageDialog(null, "Laptop registrada exitosamente.");
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

		// Validación para que ningún campo vaya vacío
		Object[] options = { "OK" };
		int selectedOption = JOptionPane.showOptionDialog(frame, msg, "Registrar Tablet", JOptionPane.NO_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		int isValid = 0;
		if (selectedOption == 0) {
			do {
				if (fabricante.getText().length() == 0 || modelo.getText().length() == 0
						|| microProce.getText().length() == 0 || longDiagPantalla.getText().length() == 0
						|| tipoPantalla.getText().length() == 0 || memoriaNand.getText().length() == 0
						|| tipoSO.getText().length() == 0) {
					isValid = 1;
					JOptionPane.showMessageDialog(null, "Por favor ingrese un valor para todos campos.");
					JOptionPane.showConfirmDialog(frame, msg, "Registrar Tablet", JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.PLAIN_MESSAGE);

				} else {
					isValid = 0;
				}
			} while (isValid != 0);
		}

		// Se insertan los datos en el objeto tablet
		tablet.setFabricante(fabricante.getText());
		tablet.setModelo(modelo.getText());
		tablet.setMicroProce(microProce.getText());
		tablet.setLongDiagPantalla(longDiagPantalla.getText());
		tablet.setTipoPantalla(tipoPantalla.getText());
		tablet.setMemoriaNand(memoriaNand.getText());
		tablet.setTipoSo(tipoSO.getText());
		listTablet.add(tablet);
		JOptionPane.showMessageDialog(null, "Tablet registrada exitosamente.");
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
