package trabajo.singleton;

public class PruebaSingleton {
    public static void main(String[] args) {
        // Ejemplos de la ejecución para Singleton

        // -----------------------------------------------------------
        // Se crean 3 instancias Singleton con diferentes parametros
        // -----------------------------------------------------------
        Singleton singleton1 = Singleton.getInstance("localhost", null);
        Singleton singleton2 = Singleton.getInstance("miaXD","basedatos");
        Singleton singleton3 = Singleton.getInstance("TuyaXD", "basedato4");

        //-------------------------------------------------------------
        // Salidas del programa
        // Nota: se debe de considerar que al ser el mismo objeto
        // global, los valores de las 3 instancias deben de ser el mismo
        // para todos y en la comparación debe de ser verdadera porque
        // es el mismo objeto
        //------------------------------------------------------------
        System.out.println(singleton1.getUrl());
        System.out.println(singleton2.getUrl());
        System.out.println(singleton3.getUrl());
        System.out.println(singleton1.getBaseDatos());
        System.out.println(singleton2.getBaseDatos());
        System.out.println(singleton3.getBaseDatos());
        System.out.println(singleton1 == singleton2);
    }
}
