package trabajo.builder;

public class CredencialBuilder implements  Credenciales{
// ------------------------------------------
// Clase que implementa interfaz Credencial
// ------------------------------------------

    // atributos de la clase
    private TipoCredencial tipo;
    private String nombre;
    private String foto;
    private String numeroCuenta;
    private String numeroTrabajador;
    private String fechaExpiración;
    private String firma;
    private String carrera;


    // método concreto para asignar el tipo de credencial
    @Override
    public void setTipoCredencial(TipoCredencial tipo) {
        this.tipo = tipo;
    }
    // método concreto para asignar el nombre
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // método concreto para asignar la foto
    @Override
    public void setFoto(String foto) {
        this.foto = foto;
    }
    // método concreto para asignar el número de cuenta
    @Override
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    // método concreto para asignar el número de trabajador
    @Override
    public void setNumeroTrabajador(String numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }
    // método concreto para asignar la fecha de expiración
    @Override
    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiración = fechaExpiracion;
    }
    // método concreto para asignar la firma
    @Override
    public void setFirma(String firma) {
        this.firma = firma;
    }
    // método concreto para asignar la carrera
    @Override
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    // método para obtener el objeto Credencial creado 
    public Credencial getResultado(){
        return new Credencial(tipo,nombre,foto,numeroCuenta,numeroTrabajador,fechaExpiración,firma,carrera);
    }
}
