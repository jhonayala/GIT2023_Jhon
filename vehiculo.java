
public class vehiculo {
    private String marca;
    private String modelo;
    private String matricula;

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMatricula() {
        return matricula;
    }
    
    public vehiculo (String marca, String modelo, String matricula) {
        this.marca=marca;
        this.modelo=modelo;
        this.matricula=matricula;
        
    }

    @Override
    public String toString() {
        
        return "["+marca+", "+modelo+", "+matricula+"]";
    }
    
public void Marca () {
    System.out.println("Marca : "+marca);
}

    
}
