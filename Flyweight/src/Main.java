import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      FabricaArboles fabricaArboles = new FabricaArboles();

      Arbol ARBOL1 = fabricaArboles.obtenerArbol("verde");


      Arbol ARBOL2 = fabricaArboles.obtenerArbol("cafe");


      Arbol ARBOL3 = fabricaArboles.obtenerArbol("verde");
      ARBOL3.dibujar(10, 34 );
      List<Arbol> listaArboles = new ArrayList<>();

        for (int i = 0; i < 10000000 ; i++) {
            listaArboles.add(fabricaArboles.obtenerArbol("verde"));

        }
        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println("el total de memory  ocupada es " + memory);


        // 253767856
    }
}
