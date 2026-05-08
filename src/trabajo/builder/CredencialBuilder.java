package trabajo.builder;

public class CredencialBuilder implements  Credenciales{

    private TipoCredencial tipo;
    private String nombre;
    private String foto;
    private String numeroCuenta;
    private String numeroTrabajador;
    private String fechaExpiración;
    private String firma;
    private String carrera;

    @Override
    public void setTipoCredencial(TipoCredencial tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public void setNumeroTrabajador(String numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    @Override
    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiración = fechaExpiracion;
    }

    @Override
    public void setFirma(String firma) {
        this.firma = firma;
    }

    @Override
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Credencial getResultado(){
        return new Credencial(tipo,nombre,foto,numeroCuenta,numeroTrabajador,fechaExpiración,firma,carrera);
    }
}
