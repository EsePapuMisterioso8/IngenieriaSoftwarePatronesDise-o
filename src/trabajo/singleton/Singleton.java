package trabajo.singleton;

public class Singleton {

    private static Singleton configurador;
    private String url;
    private String baseDatos;

    // Constructor de la clase
    private Singleton(String url, String baseDatos){
        this.url = url;
        this.baseDatos = baseDatos;
    }

    // Este metodo ayuda a crear las intancias gracias a nuestro constructor
    public static Singleton getInstance(String url , String baseDatos){
        if(configurador == null){

            if(url == null){
                url = "localhost";
            }if(baseDatos == null){
                baseDatos = "basedatos";
            }
            configurador = new Singleton(url, baseDatos);
        }
        return  configurador;
    }

    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl(){
        return  this.url;
    }
    public void setBaseDatos(String baseDatos){
        this.baseDatos = baseDatos;
    }
    public String getBaseDatos(){
        return  this.baseDatos;
    }
}
