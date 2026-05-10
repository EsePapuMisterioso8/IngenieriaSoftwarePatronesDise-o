package trabajo.singleton;

public class Singleton {
    // Variables de la clase que contienen la instancia unica del programa y los atributos
    private static Singleton configurador;
    private String url;
    private String baseDatos;

    // Constructor de la clase, recibe dos parametros
    private Singleton(String url, String baseDatos){
        this.url = url;
        this.baseDatos = baseDatos;
    }

    // Este metodo crea la intancia de tipo Singleton , primero verifica que el objeto exista
    // si no existe crea el objeto con los valores dados y si existe solo retorna lo que ya teniamos
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

    // métodos setter's y getter's para la clase
    // sirven para asignar y obtener los valores de los atributos
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
