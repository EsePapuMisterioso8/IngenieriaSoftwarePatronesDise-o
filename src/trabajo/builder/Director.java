package trabajo.builder;

public class Director {

    public void construirCredencialAlumno(Credenciales credenciales){
        credenciales.setTipoCredencial(TipoCredencial.CREDENCIAL_ALUMNO);
        credenciales.setNombre("Martin");
        credenciales.setFoto("foto");
        credenciales.setNumeroCuenta("123456789");
        credenciales.setFechaExpiracion("12/12/2022");
        credenciales.setFirma("firma mia XD");
        credenciales.setCarrera("Ingenieria en Computación");
    }

    public void construirCredencialDocente(Credenciales credenciales){
        credenciales.setTipoCredencial(TipoCredencial.CREDENCIAL_DOCENTE);
        credenciales.setNombre("Juan");
        credenciales.setFoto("foto");
        credenciales.setNumeroTrabajador("123423762");
        credenciales.setFechaExpiracion("12/12/2024");
        credenciales.setFirma("firma tuya XD");
    }


}
