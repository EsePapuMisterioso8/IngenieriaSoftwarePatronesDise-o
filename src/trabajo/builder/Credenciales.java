package trabajo.builder;

public interface Credenciales {

    //-----------------------------------------
    // Clase intefaz para crear credenciales
    //-----------------------------------------

    // método para asignar el tipo de credencial que se va a hacer
    void setTipoCredencial(TipoCredencial tipo);
    // método para asignar el nombre a la credencial
    void setNombre(String nombre);
    // método para asignar la foto a la credencial
    void setFoto(String foto);
    // método para asignar el numero de cuenta a la credencial
    void setNumeroCuenta(String numeroCuenta);
    // método para asignar el número de cuenta a la credencial de Trabajador
    void setNumeroTrabajador(String numeroTrabajador);
    // metodo para asignar la fecha de expuración a la credencial
    void setFechaExpiracion(String fechaExpiracion);
    // método para asignar la firma a la credencial
    void setFirma(String firma);
    // método para asignar la carrera a la credencial
    void setCarrera(String carrera);
}
