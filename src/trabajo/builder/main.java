package trabajo.builder;

public class main {
    public static void main(String[] args) {

        // ---------------------------------
        // Clase principal para probar
        // ---------------------------------

        // se crea la instancia de director
        Director director = new Director();

        // creamos una instancia de builder
        CredencialBuilder builder = new CredencialBuilder();
        // director decide que credencial se construye
        director.construirCredencialAlumno(builder);
        // tomamos la credencial desde el objeto builder anterior
        Credencial credencial = builder.getResultado();

        // creamos otro objeto builder para crdencial de maestro
        CredencialBuilder builderMaestro = new CredencialBuilder();
        // el director decide que construir
        director.construirCredencialDocente(builderMaestro);
        // obtenemos el resultado desde el objeto builder
        Credencial credencialMaestro = builderMaestro.getResultado();
        // imprimimos los valores de los objetos creados 
        System.out.println(credencial.getNumeroTrabajador());
        System.out.println(credencial.getCarrera());

        System.out.println(credencialMaestro.getNumeroTrabajador());
        System.out.println(credencialMaestro.getCarrera());
    }
}
