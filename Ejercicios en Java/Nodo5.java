import java.util.LinkedList; // Libreria para implementar colas
import java.util.Queue; // Estructura tipo cola
import java.util.Scanner; // Importa Scanner para leer datos

// Clase que representa cada nodo del arbol binario
class Nodo5 {
    String dato; // Guarda el dato del nodo
    Nodo5 izq; // Apunta al hijo izquierdo
    Nodo5 der; // Apunta al hijo derecho

    // Constructor del nodo
    Nodo5(String v) {
        dato = v; // Asigna el valor recibido
        izq = null; // Inicializa hijo izquierdo vacio
        der = null; // Inicializa hijo derecho vacio
    }
}

// Clase principal donde se ejecuta el programa
class Main5 {

    // Recorrido preorden: primero raiz, luego izquierda, luego derecha
    static void preorden(Nodo5 r, Wrapper w) {
        if (r == null) return; // Si el nodo es null termina

        if (!w.primero) System.out.print(" -> "); // Imprime separador
        System.out.print(r.dato); // Imprime el dato actual
        w.primero = false; // Marca que ya se imprimio el primero

        preorden(r.izq, w); // Recorre izquierda
        preorden(r.der, w); // Recorre derecha
    }

    // Recorrido inorden: izquierda, raiz, derecha
    static void inorden(Nodo5 r, Wrapper w) {
        if (r == null) return; // Caso base

        inorden(r.izq, w); // Recorre izquierda

        if (!w.primero) System.out.print(" -> "); // Imprime separador
        System.out.print(r.dato); // Imprime nodo actual
        w.primero = false; // Marca que ya se imprimio el primero

        inorden(r.der, w); // Recorre derecha
    }

    // Recorrido postorden: izquierda, derecha, raiz
    static void postorden(Nodo5 r, Wrapper w) {
        if (r == null) return; // Caso base

        postorden(r.izq, w); // Recorre izquierda
        postorden(r.der, w); // Recorre derecha

        if (!w.primero) System.out.print(" -> "); // Imprime separador
        System.out.print(r.dato); // Imprime nodo actual
        w.primero = false; // Marca que ya se imprimio el primero
    }

    // Recorrido BFS o por niveles
    static void bfs(Nodo5 r) {
        if (r == null) return; // Caso base

        Queue<Nodo5> q = new LinkedList<>(); // Se crea una cola para recorrer nivel por nivel
        q.add(r); // Se inserta la raiz en la cola

        boolean primero = true; // Controla impresion

        // Mientras la cola no este vacia
        while (!q.isEmpty()) {
            Nodo5 actual = q.poll(); // Se obtiene y elimina el nodo del frente de la cola

            if (!primero) System.out.print(" -> "); // Imprime separador
            System.out.print(actual.dato); // Imprime dato actual
            primero = false; // Cambia bandera

            if (actual.izq != null) q.add(actual.izq); // Inserta hijo izquierdo
            if (actual.der != null) q.add(actual.der); // Inserta hijo derecho
        }
    }

    // Clase auxiliar para controlar impresión
    static class Wrapper {
        boolean primero = true; // Bandera para controlar flechas
    }

    // Creacion del arbol binario
    public static void main(String[] args) {

        // Arbol base
        Nodo5 raiz = new Nodo5("Sistema Web"); // Crea raiz

        raiz.izq = new Nodo5("Usuarios"); // Hijo izquierdo
        raiz.der = new Nodo5("Inventario"); // Hijo derecho

        raiz.izq.izq = new Nodo5("Registrar"); // Nieto izquierdo
        raiz.izq.der = new Nodo5("Buscar"); // Nieto derecho

        raiz.der.izq = new Nodo5("Productos"); // Nieto izquierdo
        raiz.der.der = new Nodo5("Reportes"); // Nieto derecho

        Scanner sc = new Scanner(System.in); // Crea Scanner
        int opcion; // Variable para guardar opcion

        // Inicio del menu repetitivo
        do {
            System.out.println("\n===== MENU PRINCIPAL DE UN ARBOL BINARIO =====");
            System.out.println("1. Preorden (Mostrar estructura del sistema)");
            System.out.println("2. Inorden (Recorrido ordenado)");
            System.out.println("3. Postorden (Ejecutar modulos internos primero)");
            System.out.println("4. BFS (Recorrido jerarquico por niveles)");
            System.out.println("5. Salir");
            System.out.print("Seleccione: "); // Solicita opción
            opcion = sc.nextInt(); // Lee opcion

            System.out.println(); // Salto de linea

            switch (opcion) { // Evalua opcion elegida

                case 1: // Caso Preorden
                    System.out.print("PREORDEN: ");
                    Wrapper w1 = new Wrapper(); // Crea wrapper
                    preorden(raiz, w1); // Llama al metodo
                    System.out.println(); // Salto de linea
                    break;

                case 2: // Caso Inorden
                    System.out.print("INORDEN: ");
                    Wrapper w2 = new Wrapper(); // Crea wrapper
                    inorden(raiz, w2); // Llama al metodo
                    System.out.println(); // Salto de linea
                    break;

                case 3: // Caso Postorden
                    System.out.print("POSTORDEN: ");
                    Wrapper w3 = new Wrapper(); // Crea wrapper
                    postorden(raiz, w3); // Llama al metodo
                    System.out.println(); // Salto de linea
                    break;

                case 4: // Caso BFS
                    System.out.print("BFS: ");
                    bfs(raiz); // Llama al metodo
                    System.out.println(); // Salto de linea
                    break;

                case 5: // Caso salir
                    System.out.println("Cerrando sistema de arboles binarios...");
                    break;

                default: // Caso inválido
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 5); // Repite hasta elegir salir
    }
}
