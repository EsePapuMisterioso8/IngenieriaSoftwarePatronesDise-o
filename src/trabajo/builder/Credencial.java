package trabajo.builder;

public class Credencial {
    private final TipoCredencial tipo;
    private final String nombre;
    private final String foto;
    private final String numeroCuenta;
    private final String numeroTrabajador;
    private final String fechaExpiración;
    private final String firma;
    private final String carrera;

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

    public TipoCredencial getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFoto() {
        return foto;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public String getFechaExpiración() {
        return fechaExpiración;
    }

    public String getFirma() {
        return firma;
    }

    public String getCarrera() {
        return carrera;
    }

}
