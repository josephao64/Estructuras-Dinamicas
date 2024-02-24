class Nodo {
    int dato;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}

class ListaDobleEnlazada {
    Nodo inicio;
    Nodo fin;
    int tamaño;

    public ListaDobleEnlazada() {
        this.inicio = null;
        this.fin = null;
        this.tamaño = 0;
    }

    public void insertarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.siguiente = inicio;
            inicio.anterior = nuevoNodo;
            inicio = nuevoNodo;
        }
        tamaño++;
    }

    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.anterior = fin;
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
        tamaño++;
    }

    public void recorrerAdelante() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public void recorrerAtras() {
        Nodo actual = fin;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.anterior;
        }
        System.out.println();
    }

    public void mostrarTamaño() {
        System.out.println("Tamaño de la lista: " + tamaño);
    }

    public boolean listaVacia() {
        return tamaño == 0;
    }

    public void buscarPorValor(int valor) {
        Nodo actual = inicio;
        int indice = 0;
        while (actual != null) {
            if (actual.dato == valor) {
                System.out.println("El valor " + valor + " se encuentra en el índice " + indice);
                return;
            }
            actual = actual.siguiente;
            indice++;
        }
        System.out.println("El valor " + valor + " no se encuentra en la lista");
    }

    public void buscarPorIndice(int indice) {
        if (indice < 0 || indice >= tamaño) {
            System.out.println("Índice fuera de rango");
            return;
        }

        Nodo actual = inicio;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }

        System.out.println("El valor en el índice " + indice + " es: " + actual.dato);
    }

    public void borrarElemento(int valor) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.dato == valor) {
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    inicio = actual.siguiente;
                }

                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    fin = actual.anterior;
                }

                tamaño--;
                System.out.println("Elemento " + valor + " eliminado de la lista");
                return;
            }
            actual = actual.siguiente;
        }

        System.out.println("El elemento " + valor + " no se encuentra en la lista");
    }
}

public class Main {
    public static void main(String[] args) {
        ListaDobleEnlazada lista = new ListaDobleEnlazada();

        // Menú
        while (true) {
            System.out.println("\nLista Doblemente Enlazada");
            System.out.println("1. Insertar al Inicio");
            System.out.println("2. Insertar al Final");
            System.out.println("3. Recorrer hacia Adelante");
            System.out.println("4. Recorrer hacia Atras");
            System.out.println("5. Mostrar Tamaño de la Lista");
            System.out.println("6. Mostrar si la Lista está Vacía");
            System.out.println("7. Buscar Elemento por Valor");
            System.out.println("8. Buscar Elemento por Índice");
            System.out.println("9. Borrar un Elemento");
            System.out.println("0. Salir");

            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Ingrese la opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a insertar al inicio: ");
                    int valorInicio = scanner.nextInt();
                    lista.insertarAlInicio(valorInicio);
                    break;
                case 2:
                    System.out.print("Ingrese el valor a insertar al final: ");
                    int valorFinal = scanner.nextInt();
                    lista.insertarAlFinal(valorFinal);
                    break;
                case 3:
                    System.out.print("Recorrido hacia adelante: ");
                    lista.recorrerAdelante();
                    break;
                case 4:
                    System.out.print("Recorrido hacia atras: ");
                    lista.recorrerAtras();
                    break;
                case 5:
                    lista.mostrarTamaño();
                    break;
                case 6:
                    if (lista.listaVacia()) {
                        System.out.println("La lista está vacía");
                    } else {
                        System.out.println("La lista no está vacía");
                    }
                    break;
                case 7:
                    System.out.print("Ingrese el valor a buscar: ");
                    int valorBuscar = scanner.nextInt();
                    lista.buscarPorValor(valorBuscar);
                    break;
                case 8:
                    System.out.print("Ingrese el índice a buscar: ");
                    int indiceBuscar = scanner.nextInt();
                    lista.buscarPorIndice(indiceBuscar);
                    break;
                case 9:
                    System.out.print("Ingrese el valor a borrar: ");
                    int valorBorrar = scanner.nextInt();
                    lista.borrarElemento(valorBorrar);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        }
    }
}
