#include <iostream>
#include <queue> // Libreria para usar colas

using namespace std;

// Estructura del nodo del arbol
struct Nodo {
    int dato; // Valor del nodo
    Nodo* izquierda; // Puntero al hijo izquierdo
    Nodo* derecha; // puntero al hijo derecho
    
    // Constructor del nodo
    Nodo(int valor) {
        dato = valor;
        izquierda = nullptr;
        derecha = nullptr;
    }
};

// RECORRIDOS

// Preorden: raiz, izquierda, derecha
void preorden(Nodo* raiz) {
    if (raiz == nullptr) return; // Caso base
    cout << raiz->dato << " "; // Visitar nodo
    preorden(raiz->izquierda); // Recorrer izquierda
    preorden(raiz->derecha); // Recorrer derecha
}

// Inorden: izquierda, raiz, derecha
void inorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    inorden(raiz->izquierda); // Recorrer izquierda
    cout << raiz->dato << " "; // Visitar nodo
    inorden(raiz->derecha); // Recorrer derecha
}

// Postorden: izquierda, derecha, raiz
void postorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    postorden(raiz->izquierda); // Recorrer izquierda
    postorden(raiz->derecha); // Recorrer derecha
    cout << raiz->dato << " "; // Visitar nodo
}

// Recorrido por niveles (BFS)
void bfs(Nodo* raiz) {
    if (raiz == nullptr) return;

    queue<Nodo*> cola; // Crear cola
    cola.push(raiz); // Insertar raiz

    while (!cola.empty()) {
        Nodo* actual = cola.front(); // Obtener frente
        cola.pop(); // Eliminar frente

        cout << actual->dato << " "; // Mostrar dato
        
        // Insertar hijos (si existen)
        if (actual->izquierda) cola.push(actual->izquierda);
        if (actual->derecha) cola.push(actual->derecha);
    }
}

// Contar nodos
int contarNodos(Nodo* raiz) {
    if (raiz == nullptr) return 0; // Caso base
    return 1 + contarNodos(raiz->izquierda) + contarNodos(raiz->derecha); // Contar nodo actual, mas nodos de subarboles
}

int main() {

    // Arbol base
    Nodo* raiz = new Nodo(10);
    raiz->izquierda = new Nodo(5);
    raiz->derecha = new Nodo(15);
    raiz->izquierda->izquierda = new Nodo(2);
    raiz->izquierda->derecha = new Nodo(7);
    raiz->derecha->izquierda = new Nodo(12);
    raiz->derecha->derecha = new Nodo(20);
    
    // Nodos adicionales
    raiz->izquierda->izquierda->izquierda = new Nodo(1);
    raiz->izquierda->izquierda->derecha = new Nodo(3);
    raiz->derecha->derecha->izquierda = new Nodo(18);
    raiz->derecha->derecha->derecha = new Nodo(25);
    
    // RECORRIDOS
    cout << "RECORRIDOS DE ARBOLES BINARIOS - UTA\n";
    
    // Mostrar recorrido preorden
    cout << "Preorden: ";
    preorden(raiz);
    
    // Mostrar recorrido inorden
    cout << "\nInorden: ";
    inorden(raiz);
    
    // Mostrar recorrido postorden
    cout << "\nPostorden: ";
    postorden(raiz);
    
    // Mostrar recorrido BFS
    cout << "\nBFS: ";
    bfs(raiz);
    
    // Mostrar el total de nodos
    cout << "\nTotal de nodos: " << contarNodos(raiz);

    cout << endl;
    return 0;
}
