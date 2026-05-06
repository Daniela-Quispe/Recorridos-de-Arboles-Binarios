#include <iostream>
#include <queue> // Libreria para usar colas

using namespace std;

// Estructura del nodo del arbol
struct Nodo {
    int dato; // Valor del nodo
    Nodo* izquierda; // Puntero al hijo izquierdo
    Nodo* derecha; // Puntero al hijo derecho

// Constructor al nodo
    Nodo(int valor) {
        dato = valor;
        izquierda = nullptr;
        derecha = nullptr; 
    }
};

// Recorrido en preorden: raiz, izquierda, derecha
void preorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    cout << raiz->dato << " "; //Se visita el nodo
    preorden(raiz->izquierda); // Recorrer izquierda
    preorden(raiz->derecha); // Recorrer derecha
}

// Recorrido en inorden: izquierda, raiz, derecha
void inorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    inorden(raiz->izquierda);
    cout << raiz->dato << " ";
    inorden(raiz->derecha);
}

// Recorrido en postorden: izquierda, derecha, raiz
void postorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    postorden(raiz->izquierda);
    postorden(raiz->derecha);
    cout << raiz->dato << " ";
}

// Recorrido por niveles usando cola (BFS)
void bfs(Nodo* raiz) {
    if (raiz == nullptr) return;

    queue<Nodo*> cola; // Se crea una cola
    cola.push(raiz); // Insertar raiz

    while (!cola.empty()) {
        Nodo* actual = cola.front(); // Obtener frente
        cola.pop(); // Eliminar frente

        cout << actual->dato << " "; // Mostrar datos
        
        // Insertar hijos (si es que existen)
        if (actual->izquierda != nullptr) cola.push(actual->izquierda);
        if (actual->derecha != nullptr) cola.push(actual->derecha);
    }
}

int main() {
	
	// Crear arbol
    Nodo* raiz = new Nodo(10);
    raiz->izquierda = new Nodo(5);
    raiz->derecha = new Nodo(15);
    raiz->izquierda->izquierda = new Nodo(2);
    raiz->izquierda->derecha = new Nodo(7);
    raiz->derecha->izquierda = new Nodo(12);
    raiz->derecha->derecha = new Nodo(20);
    
    // Ejecutar recorridos
    cout << "RECORRIDOS DE ARBOLES BINARIOS - UTA" << endl;

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

    cout << endl;
    return 0;
}
