package trabajo.builder;

public class main {
    public static void main(String[] args) {
        Director director = new Director();

        CredencialBuilder builder = new CredencialBuilder();
        director.construirCredencialAlumno(builder);

        Credencial credencial = builder.getResultado();

        CredencialBuilder builderMaestro = new CredencialBuilder();
        director.construirCredencialDocente(builderMaestro);

        Credencial credencialMaestro = builderMaestro.getResultado();

        System.out.println(credencial.getNumeroTrabajador());
        System.out.println(credencial.getCarrera());

        System.out.println(credencialMaestro.getNumeroTrabajador());
        System.out.println(credencialMaestro.getCarrera());
    }
}
