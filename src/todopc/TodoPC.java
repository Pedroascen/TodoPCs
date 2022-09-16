package todopc;

public class TodoPC {

    public static void main(String[] args) {
          
        //Instancia de Objetos y guardar en ArrayList
        
    	AddListEquipo objDesktop = new AddListEquipo();
        AddListEquipo objLaptop = new AddListEquipo();
        AddListEquipo objTablet = new AddListEquipo();
        
    	//Implementacion de métodos
        
        //Desktop
        objDesktop.addDesktop();
        objDesktop.getDesktop();
        //Laptop
        objLaptop.addLaptop();
        objLaptop.getLaptop();
        //Tablet
        objTablet.addTablet();
        objTablet.getTablet();
    	
        
        //Agregar Menu de Opciones y unir la parte logica
        
        
        //Validar Datos no permitir nulos
        
        
        
    }
}
