public class persona {
    //atributos
    String nombre ;
    int edad ;

    //metodo constructor
    public persona(String nombre , int edad ){  //parametros
        this.nombre = nombre;   //inicialisamos parametros
        this.edad =edad;



    }
    public void mostrarDatos (){

        System.out.println(edad);
        System.out.println(nombre);
        System.out.println("______________");


    }




}
