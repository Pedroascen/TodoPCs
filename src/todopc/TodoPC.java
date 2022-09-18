package todopc;

import javax.swing.JOptionPane;

public class TodoPC {

    public static void main(String[] args) {
          
        byte opcion=0;
        
        //Instancia de Objetos y guardar en ArrayList        
    	AddListEquipo objDesktop = new AddListEquipo();
        AddListEquipo objLaptop = new AddListEquipo();
        AddListEquipo objTablet = new AddListEquipo();
        
        //Menú principal 
        do{
            opcion=Byte.parseByte(JOptionPane.showInputDialog(
            "TODOPC: MENU PRINCIPAL\n \n"          
          + "1. Registrar equipo\n"
          + "2. Ver equipos\n"
          + "3. Salir\n \n"                    
          + "Por favor, seleccione una opción."));
            
            switch(opcion) {
                case 1:
                    //Menú Registrar equipo
                    byte opcion1 = Byte.parseByte(JOptionPane.showInputDialog(
                        "TODOPC: Registrar equipo\n \n"          
                      + "1. Desktops\n"
                      + "2. Laptops\n"
                      + "3. Tablets\n \n"                    
                      + "Por favor, seleccione una opción."));
                        switch(opcion1) {
                            case 1:
                                objDesktop.addDesktop();
                                break;
                            case 2: 
                                objLaptop.addLaptop();
                                break;
                            case 3: 
                                objTablet.addTablet();
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción inválida.");
                                break;
                    }
                                        
                        break;                     
                    
                case 2:
                    //Menú Ver equipos
                    byte opcion2 = Byte.parseByte(JOptionPane.showInputDialog(
                        "TODOPC: Ver equipos\n \n"          
                      + "1. Desktops\n"
                      + "2. Laptops\n"
                      + "3. Tablets\n \n"                    
                      + "Por favor, seleccione una opción."));
                        switch(opcion2) {
                            case 1:
                                String desktopresult = objDesktop.getDesktopInfo();
                                JOptionPane.showMessageDialog(null, desktopresult);
                                break;
                            case 2: 
                                String laptopresult = objLaptop.getLaptopInfo();
                                JOptionPane.showMessageDialog(null, laptopresult);
                                break;
                            case 3: 
                                String tabletresult = objTablet.getTabletInfo();
                                JOptionPane.showMessageDialog(null, tabletresult);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción inválida.");
                                break;
                    }
                    
                        break;
                        
                case 3:
                    opcion=3;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida.");
                        break;
            }
        
        }while(opcion!=3);
        System.exit(0);
        
        //Validar Datos no permitir nulos
            	
        
    }
}
