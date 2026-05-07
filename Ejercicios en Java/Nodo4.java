import java.util.LinkedList;
import java.util.Queue;

class Nodo4 {
    int dato;
    Nodo izquierda;
    Nodo derecha;

    public Nodo4(int dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }
}

class Main4 {

    public static void preorden(Nodo raiz) {
        if (raiz == null) return;
        System.out.print(raiz.dato + " ");
        preorden(raiz.izquierda);
        preorden(raiz.derecha);
    }

    public static void inorden(Nodo raiz) {
        if (raiz == null) return;
        inorden(raiz.izquierda);
        System.out.print(raiz.dato + " ");
        inorden(raiz.derecha);
    }

    public static void postorden(Nodo raiz) {
        if (raiz == null) return;
        postorden(raiz.izquierda);
        postorden(raiz.derecha);
        System.out.print(raiz.dato + " ");
    }

    public static void bfs(Nodo raiz) {
        if (raiz == null) return;

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            System.out.print(actual.dato + " ");

            if (actual.izquierda != null) cola.add(actual.izquierda);
            if (actual.derecha != null) cola.add(actual.derecha);
        }
    }

    // 🌳 EJERCICIO 4: CONTAR HOJAS
    public static int contarHojas(Nodo raiz) {
        if (raiz == null) return 0;

        if (raiz.izquierda == null && raiz.derecha == null)
            return 1;

        return contarHojas(raiz.izquierda) + contarHojas(raiz.derecha);
    }

    public static void main(String[] args) {

        // ÁRBOL BASE + MODIFICADO
        Nodo raiz = new Nodo(10);
        raiz.izquierda = new Nodo(5);
        raiz.derecha = new Nodo(15);
        raiz.izquierda.izquierda = new Nodo(2);
        raiz.izquierda.derecha = new Nodo(7);
        raiz.derecha.izquierda = new Nodo(12);
        raiz.derecha.derecha = new Nodo(20);

        raiz.izquierda.izquierda.izquierda = new Nodo(1);
        raiz.izquierda.izquierda.derecha = new Nodo(3);
        raiz.derecha.derecha.izquierda = new Nodo(18);
        raiz.derecha.derecha.derecha = new Nodo(25);

        System.out.println("RECORRIDOS DE ARBOLES BINARIOS - UTA");

        System.out.print("Preorden: ");
        preorden(raiz);

        System.out.print("\nInorden: ");
        inorden(raiz);

        System.out.print("\nPostorden: ");
        postorden(raiz);

        System.out.print("\nBFS: ");
        bfs(raiz);

        System.out.println("\nTotal de hojas: " + contarHojas(raiz));
    }
}