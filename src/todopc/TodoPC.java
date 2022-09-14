package todopc;

import todopc.equipos.Equipo;
import todopc.equipos.Desktop;
import todopc.equipos.Laptop;
import todopc.equipos.Tablet;

public class TodoPC {

    public static void main(String[] args) {
        
        //Instancia de Objetos y guardar en ArrayList
        
        //Agregar Menu de Opciones y unir la parte logica
        
        
        //Validar Datos no permitir nulos
        
        
        
        //Codigo de ejemplo
        Equipo Dell,HP,Samsumg = new Equipo();
        //Creacion de objetos
        Dell =  new Desktop("", "", "", "12 GB", "GTForce", "","0");
        HP = new Laptop("", "", "", "6 GB", "1280x1300", "0");
        Samsumg = new Tablet("", "", "", "127 cm", "", "100 GB","");
        
        //impresion de mensajes
        Dell.VerMensaje();
        HP.VerMensaje();
        Samsumg.VerMensaje();
    }
}
