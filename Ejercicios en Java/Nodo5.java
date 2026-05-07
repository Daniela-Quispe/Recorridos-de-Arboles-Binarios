import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Nodo5 {
    String dato;
    Nodo5 izq;
    Nodo5 der;

    Nodo5(String v) {
        dato = v;
        izq = null;
        der = null;
    }
}

class Main5 {

    // 🔵 PREORDEN
    static void preorden(Nodo5 r, Wrapper w) {
        if (r == null) return;

        if (!w.primero) System.out.print(" -> ");
        System.out.print(r.dato);
        w.primero = false;

        preorden(r.izq, w);
        preorden(r.der, w);
    }

    // 🟡 INORDEN
    static void inorden(Nodo5 r, Wrapper w) {
        if (r == null) return;

        inorden(r.izq, w);

        if (!w.primero) System.out.print(" -> ");
        System.out.print(r.dato);
        w.primero = false;

        inorden(r.der, w);
    }

    // 🔴 POSTORDEN
    static void postorden(Nodo5 r, Wrapper w) {
        if (r == null) return;

        postorden(r.izq, w);
        postorden(r.der, w);

        if (!w.primero) System.out.print(" -> ");
        System.out.print(r.dato);
        w.primero = false;
    }

    // 🟣 BFS
    static void bfs(Nodo5 r) {
        if (r == null) return;

        Queue<Nodo5> q = new LinkedList<>();
        q.add(r);

        boolean primero = true;

        while (!q.isEmpty()) {
            Nodo5 actual = q.poll();

            if (!primero) System.out.print(" -> ");
            System.out.print(actual.dato);
            primero = false;

            if (actual.izq != null) q.add(actual.izq);
            if (actual.der != null) q.add(actual.der);
        }
    }

    // 🔧 clase auxiliar para controlar impresión
    static class Wrapper {
        boolean primero = true;
    }

    public static void main(String[] args) {

        Nodo5 raiz = new Nodo5("Sistema Web");

        raiz.izq = new Nodo5("Usuarios");
        raiz.der = new Nodo5("Inventario");

        raiz.izq.izq = new Nodo5("Registrar");
        raiz.izq.der = new Nodo5("Buscar");

        raiz.der.izq = new Nodo5("Productos");
        raiz.der.der = new Nodo5("Reportes");

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENU PRINCIPAL DE UN ARBOL BINARIO =====");
            System.out.println("1. Preorden (Mostrar estructura del sistema)");
            System.out.println("2. Inorden (Recorrido ordenado)");
            System.out.println("3. Postorden (Ejecutar modulos internos primero)");
            System.out.println("4. BFS (Recorrido jerarquico por niveles)");
            System.out.println("5. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();

            System.out.println();

            switch (opcion) {

                case 1:
                    System.out.print("PREORDEN: ");
                    Wrapper w1 = new Wrapper();
                    preorden(raiz, w1);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("INORDEN: ");
                    Wrapper w2 = new Wrapper();
                    inorden(raiz, w2);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("POSTORDEN: ");
                    Wrapper w3 = new Wrapper();
                    postorden(raiz, w3);
                    System.out.println();
                    break;

                case 4:
                    System.out.print("BFS: ");
                    bfs(raiz);
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Cerrando sistema de arboles binarios...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 5);
    }
}