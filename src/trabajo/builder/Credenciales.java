package trabajo.builder;

public interface Credenciales {
    void setTipoCredencial(TipoCredencial tipo);
    void setNombre(String nombre);
    void setFoto(String foto);
    void setNumeroCuenta(String numeroCuenta);
    void setNumeroTrabajador(String numeroTrabajador);
    void setFechaExpiracion(String fechaExpiracion);
    void setFirma(String firma);
    void setCarrera(String carrera);
}
