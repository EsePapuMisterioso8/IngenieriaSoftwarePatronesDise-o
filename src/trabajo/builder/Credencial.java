package trabajo.builder;

public class Credencial {

    // Variables de la clase y se declaran final para que no sean
    // modificados despues
    private final TipoCredencial tipo;
    private final String nombre;
    private final String foto;
    private final String numeroCuenta;
    private final String numeroTrabajador;
    private final String fechaExpiración;
    private final String firma;
    private final String carrera;

    // constructor con parametros y recibe todos los parametros
    public Credencial(TipoCredencial tipo, String nombre, String foto, String numeroCuenta, String numeroTrabajador,
                      String fechaExpiración, String firma, String carrera){
        this.tipo = tipo;
        this.nombre = nombre;
        this.foto = foto;
        this.numeroCuenta = numeroCuenta;
        this.numeroTrabajador = numeroTrabajador;
        this.fechaExpiración = fechaExpiración;
        this.firma = firma;
        this.carrera = carrera;
    }

    // método para obtener el tipo de credencial desde una instancia
    public TipoCredencial getTipo() {
        return tipo;
    }
    // método para obtener el nombre desde una instancia
    public String getNombre() {
        return nombre;
    }
    // método para obtener la foto desde una instancia
    public String getFoto() {
        return foto;
    }
    // método para obtener el núm de cuenta desde una instancia
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    // método para obtener el núm de trabajador desde una instancia
    public String getNumeroTrabajador() {return numeroTrabajador;}
    // método para obtener la fecha de expiración desde una instancia
    public String getFechaExpiración() {
        return fechaExpiración;
    }
    // método para obtener la firma desde una instancia
    public String getFirma() {
        return firma;
    }
    // método para obtener la carrera desde una instancia
    public String getCarrera() {
        return carrera;
    }

}
