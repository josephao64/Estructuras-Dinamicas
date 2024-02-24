import lombok.*;

@AllArgsConstructor
public class  pokeman extends Pokemon  {

    int edad;
    String nombre;

public void mostrarData(){
    if(edad >= 18){
        System.out.println("el pokemon es mayor");
    }else{


        System.out.println("el pokemon  es menor");


    }
}


    @Override
    protected void atacarPlacaje() {

    }

    @Override
    protected void atacarAranazo() {

    }

    @Override
    protected void atacarMordida() {

    }
}
