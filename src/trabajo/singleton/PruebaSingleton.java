package trabajo.singleton;

public class PruebaSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("localhost", null);
        Singleton singleton2 = Singleton.getInstance("miaXD","basedatos");
        Singleton singleton3 = Singleton.getInstance("TuyaXD", "basedato4");
        System.out.println(singleton1.getUrl());
        System.out.println(singleton2.getUrl());
        System.out.println(singleton3.getUrl());
        System.out.println(singleton1.getBaseDatos());
        System.out.println(singleton2.getBaseDatos());
        System.out.println(singleton3.getBaseDatos());
        System.out.println(singleton1 == singleton2);
    }
}
