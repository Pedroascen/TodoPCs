package todopc.equipos;

public class Tablet extends Equipo{
    //atributos
    //longitud diagonal de pantalla
    protected String longDiagPantalla;
    //Capacitiva/Resistiva
    protected String tipoPantalla;
    protected String memoriaNand;
    protected String tipoSO;
    
    //constructores
    public Tablet(){
    }
    
    public Tablet(String fabricante, String modelo,String microProce, String longDiagPantalla, String tipoPantalla,String memoriaNand, String tipoSO){
        super(fabricante,modelo,microProce);
        this.longDiagPantalla = longDiagPantalla;
        this.tipoPantalla = tipoPantalla;
        this.memoriaNand = memoriaNand;
        this.tipoSO = tipoSO;
    }
    //Metodo de prueba
    public void VerMensaje(){
        super.VerMensaje();
        System.out.println("El tamanio diagonal de pantalla es: "+longDiagPantalla+" y tengo "+memoriaNand+" de memoria NAND");
    }
    //getters y setters
    public String getLongDiagPantalla(){
        return longDiagPantalla;
    }
    
    public void setLongDiagPantalla(String longDiagPantalla){
        this.longDiagPantalla = longDiagPantalla;
    }
    
    public String getTipoPantalla(){
        return tipoPantalla;
    }
    
    public void setTipoPantalla(String tipoPantalla){
        this.tipoPantalla = tipoPantalla;
    }
    
    public String getMemoriaNand(){
        return memoriaNand;
    }
    
    public void setMemoriaNand(String memoriaNand){
        this.memoriaNand =  memoriaNand;
    }
    
    public String getTipoSo(){
        return tipoSO;
    }
    
    public void setTipoSo(String tipoSO){
        this.tipoSO = tipoSO;
    }
}
