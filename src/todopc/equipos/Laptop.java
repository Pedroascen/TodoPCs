/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todopc.equipos;

public class Laptop extends Equipo{
    //atributos
    private String tamanioPantalla;
    
    //Constructores
    public Laptop(){
    }
    public Laptop(String fabricante, String modelo, String microProce, String memoria, String tamanioPantalla, String capacDiskDuro){
        super(fabricante,modelo,microProce,memoria,capacDiskDuro);
        this.tamanioPantalla = tamanioPantalla;   
    }
    //Metodo de prueba
     public void VerMensaje(){
        super.VerMensaje();
        System.out.println("El tamanio de pantalla es: "+tamanioPantalla+" y tengo "+memoria+" de RAM");
    }
    //getters y setters
    public String getTamanioPantalla(){
        return tamanioPantalla;
    }
    
    public void setTamanioPantall(String tamanioPantalla){
        this.tamanioPantalla = tamanioPantalla;
    }
}
