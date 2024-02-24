public class MiClase {

    private static MiClase instance=null;
    static {
        instance= new MiClase();

    }
    String campo1 = "valor1";
    String campo2 = "valor2";

    // el objetico de el constructoe privado con el objetico de que no se permita su instansiamento directo
    private MiClase(){

    }
// metodo que debuelbe la instancia de la clase
    public static MiClase getInstance(){
        return instance;
    }

}
