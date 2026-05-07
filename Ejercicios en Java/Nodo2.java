import java.util.LinkedList; // Libreria para implementar colas
import java.util.Queue; // Estructura tipo cola

// Clase que representa cada nodo del arbol binario
class Nodo2 {
    int dato; // Valor almacenado en el nodo
    Nodo2 izquierda; // Referencia al hijo izquierdo
    Nodo2 derecha; // Referencia al hijo derecho

    // Constructor que inicializa el nodo con un valor
    public Nodo2(int dato) {
        this.dato = dato; // Asigna el valor recibido
        this.izquierda = null; // Inicialmente no tiene hijo izquierdo
        this.derecha = null; // Inicialmente no tiene hijo derecho
    }
}

// Clase principal donde se ejecuta el programa
class Main2 {

    // Recorrido preorden: primero raiz, luego izquierda, luego derecha
    public static void preorden(Nodo2 raiz) {
        if (raiz == null) return; // Caso base
        System.out.print(raiz.dato + " "); // Muestra el valor del nodo actual
        preorden(raiz.izquierda); // Se llama recursivamente al subarbol izquierdo
        preorden(raiz.derecha);  // Se llama recursivamente al subarbol derecho
    }
    
    // Recorrido inorden: izquierda, raiz, derecha
    public static void inorden(Nodo2 raiz) {
        if (raiz == null) return; // Caso base
        inorden(raiz.izquierda); // Recorrer el subarbol izquierdo
        System.out.print(raiz.dato + " "); // Mostrar el valor del nodo
        inorden(raiz.derecha); // Recorrer el subarbol derecho
    }
    
    // Recorrido postorden: izquierda, derecha, raiz
    public static void postorden(Nodo2 raiz) {
        if (raiz == null) return; // Caso base
        postorden(raiz.izquierda); // Recorrer subarbol izquierdo
        postorden(raiz.derecha); // Recorrer subarbol derecho
        System.out.print(raiz.dato + " "); // Mostrar el valor del nodo
    }
    
    // Recorrido BFS o por niveles
    public static void bfs(Nodo2 raiz) {
        if (raiz == null) return; // Caso base

        Queue<Nodo2> cola = new LinkedList<>(); // Se crea una cola para recorrer nivel por nivel
        cola.add(raiz); // Se inserta la raiz en la cola

        // Mientras la cola no este vacia
        while (!cola.isEmpty()) {
            Nodo2 actual = cola.poll(); // Se obtiene y elimina el nodo del frente de la cola
            System.out.print(actual.dato + " "); // Se muestra el valor del nodo actual

            if (actual.izquierda != null) cola.add(actual.izquierda); // Si el nodo tiene hijo izquierdo se agrega a la cola
            if (actual.derecha != null) cola.add(actual.derecha); // Si el nodo tiene hijo derecho se agrega a la cola
        }
    }
    
    // Creacion del arbol binario
    public static void main(String[] args) {

        // Arbol base
        Nodo2 raiz = new Nodo2(10);
        raiz.izquierda = new Nodo2(5);
        raiz.derecha = new Nodo2(15);
        raiz.izquierda.izquierda = new Nodo2(2);
        raiz.izquierda.derecha = new Nodo2(7);
        raiz.derecha.izquierda = new Nodo2(12);
        raiz.derecha.derecha = new Nodo2(20);

        // Agregar nodos
        raiz.izquierda.izquierda.izquierda = new Nodo2(1);
        raiz.izquierda.izquierda.derecha = new Nodo2(3);
        raiz.derecha.derecha.izquierda = new Nodo2(18);
        raiz.derecha.derecha.derecha = new Nodo2(25);
        
        // Ejecucion de recorridos
        System.out.println("RECORRIDOS DE ARBOLES BINARIOS - UTA");

        System.out.print("Preorden: ");
        preorden(raiz); // Llama al metodo preorden

        System.out.print("\nInorden: ");
        inorden(raiz); // Llama al metodo inorden

        System.out.print("\nPostorden: ");
        postorden(raiz); // Llama al metodo postorden

        System.out.print("\nBFS: ");
        bfs(raiz); // Llama al metodo BFS

        // Salto de linea al final
        System.out.println();
    }
}