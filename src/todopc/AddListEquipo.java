package todopc;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import todopc.equipos.Desktop;
import todopc.equipos.Laptop;
import todopc.equipos.Tablet;

public class AddListEquipo {
	//instancia de clase Equipo
	Desktop desktop = new Desktop();
        Laptop laptop = new Laptop();
        Tablet tablet = new Tablet();
        
	//Arreglo para equipos 
	ArrayList<Desktop> listequipo = new ArrayList();
        ArrayList<Laptop> listequipo1 = new ArrayList();
        ArrayList<Tablet> listequipo2 = new ArrayList();
        
	
	//Metodo para el option Pane
	public String Input(String text) {
		return JOptionPane.showInputDialog(text);
	}
	
        //Desktop
	//Método para guardar objeto
	public void addDesktop() {
                String fabricante = Input("Ingrese el fabricante del equipo Desktop");
                String modelo = Input("Ingrese el modelo del equipo Desktop");
                String microProce = Input("Ingrese el microproceador del equipo Desktop");
                String capacDiskDuro = Input("Ingrese la capacidad de disco duro del equipo Desktop");
                String memoria = Input("Ingrese la memoria RAM del equipo Desktop:");
		String tarjGrafica = Input("Ingrese la tarjeta gráfica de la Desktop:");
		String tamanioTorre = Input("Ingrese el tamaño de la Torre del equipo Desktop");
		
		//Se insertan los datos en el objeto desktop
                desktop.setFabricante(fabricante);
                desktop.setModelo(modelo);
                desktop.setMicroProce(microProce);
                desktop.setCapacDiskDuro(capacDiskDuro);
		desktop.setTatjGrafica(tarjGrafica);
		desktop.setMemoria(memoria);
                desktop.setTamanioTorre(tamanioTorre);
		listequipo.add(desktop);
	}
	//Método para mostrar
	public void getDesktop() {
		for(int i=0; i<listequipo.size(); i++) {
			desktop.VerMensaje();
		}
        }
               
	//Laptop
	//Método para guardar objeto
	public void addLaptop() {
                String fabricante = Input("Ingrese el fabricante de la Laptop");
                String modelo = Input("Ingrese el modelo de la Laptop");
                String microProce = Input("Ingrese el microproceador de la Laptop");
                String capacDiskDuro = Input("Ingrese la capacidad de disco duro de la Laptop");
		String tamanioPantalla = Input("Ingrese el tamaño de la pantalla de la laptop:");
		String memoria = Input("Ingrese la memoria RAM de la Laptop:");
		
		//se insertan los datos en el objeto laptop
                laptop.setFabricante(fabricante);
                laptop.setModelo(modelo);
                laptop.setMicroProce(microProce);
                laptop.setCapacDiskDuro(capacDiskDuro);
		laptop.setTamanioPantall(tamanioPantalla);
		laptop.setMemoria(memoria);
		listequipo1.add(laptop);
	}
	//Método para mostrar
	public void getLaptop() {
		for(int i=0; i<listequipo1.size(); i++) {
			laptop.VerMensaje();
		}
	}
        
        //Tablet
        //Método para guardar objeto
        public void addTablet(){
                String fabricante = Input("Ingrese el fabricante de la Tablet");
                String modelo = Input("Ingrese el modelo de la Laptop");
                String microProce = Input("Ingrese el microproceador de la Tablet");
                String longDiagPantalla = Input("Inrgese el tamaño de la pantalla de la Tablet");
                String memoriaNand = Input("Ingrese la memoria NAND de la Tablet");
                String tipoPantalla = Input ("Ingrese el tamaño diagonal de la pantalla de la Tablet");
                String tipoSO = Input ("Ingrese el Sistema Operativo de la Tablet");
                
                //Se insertan los datos en el objeto tablet
                tablet.setFabricante(fabricante);
                tablet.setModelo(modelo);
                tablet.setMicroProce(microProce);
                tablet.setLongDiagPantalla(longDiagPantalla);
                tablet.setTipoPantalla(tipoPantalla);
                tablet.setMemoriaNand(memoriaNand);
                tablet.setTipoSo(tipoSO);
                listequipo2.add(tablet);
            
        }
        //Método para mostrar
        public void getTablet(){
                for(int i=0; i<listequipo2.size(); i++) {
                        tablet.VerMensaje();
                }
        }
        
        
        
        
}
