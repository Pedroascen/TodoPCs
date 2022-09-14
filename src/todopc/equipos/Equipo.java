package todopc.equipos;

public class Equipo {
    //atributos 
    protected String fabricante;
    protected String modelo;
    protected String microProce;
    protected String memoria;
    protected String capacDiskDuro;
    
    //constructor vacio
    public Equipo(){
    }
    //constructor con parametros
    public Equipo(String fabricante, String modelo,String microProce,String memoria,String capacDiskDuro){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microProce = microProce;
        this.memoria = memoria;
    }
    
    public Equipo(String fabricante, String modelo,String microProce){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microProce = microProce;
    }
    //mensaje de prueba
    public void VerMensaje(){
        System.out.print("Soy un equipo: ");
    }
    
    //getters y setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getMicroProce() {
        return microProce;
    }

    public void setMicroProce(String microProce) {
        this.microProce = microProce;
    }
    
    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
    
    public String getCapacDiskDuro(){
        return capacDiskDuro;
    }
    
    public void setCapacDiskDuro(String capacDiskDuro){
        this.capacDiskDuro = capacDiskDuro;
    }
}
