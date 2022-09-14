package todopc.equipos;

public class Desktop extends Equipo{
    //atributos
    protected String tarjGrafica;
    protected String tamanioTorre;
    
    //Constructores
    public Desktop(){
    }
    
    public Desktop(String fabricante, String modelo,String microProce,String memoria,String tarjGrafica,String tamanioTorre,String capacDiskDuro){
        super(fabricante,modelo,microProce,memoria,capacDiskDuro);
        this.tarjGrafica = tarjGrafica;
        this.tamanioTorre = tamanioTorre;
    }
    //metodo de prueba
    public void VerMensaje(){
        super.VerMensaje();
        System.out.println("La targeta grafica es: "+tarjGrafica +" y tengo "+memoria+" de RAM");
    }
    
    //getters y setters
    public String getTarjGrafica(){
        return tarjGrafica;
    }
    
    public void setTatjGrafica(String tarjGrafica){
        this.tarjGrafica = tarjGrafica;
    }
    public String getTamanioTorre(){
        return tamanioTorre;
    }
    
    public void setTamanioTorre(String tamanioTorre){
        this.tamanioTorre = tamanioTorre;
    }
}
