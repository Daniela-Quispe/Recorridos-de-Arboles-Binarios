#include <iostream>
#include <queue> // Libreria para usar colas

using namespace std;

// Estructura del nodo del arbol binario
struct Nodo {
    int dato; // Valor almacenado en el nodo
    Nodo* izquierda; // Puntero al hijo izquierdo
    Nodo* derecha; // Puntero al hijo derecho

    // Constructor del nodo
    Nodo(int valor) {
        dato = valor;
        izquierda = nullptr;
        derecha = nullptr;
    }
};

// RECORRIDOS

// Recorrido en preorden: raiz, izquierda, derecha
void preorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    cout << raiz->dato << " "; //Se visita el nodo
    preorden(raiz->izquierda); // Recorre el subarbol izquierdo
    preorden(raiz->derecha); // Recorre el subarbol derecho
}

// Recorrido en inorden: izquierda, raiz, derecha
void inorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    inorden(raiz->izquierda); // Recorrer izquierda
    cout << raiz->dato << " "; // Se visita el nodo
    inorden(raiz->derecha); // Recorrer derecha
}

// Recorrido en postorden: izquierda, derecha, raiz
void postorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    postorden(raiz->izquierda); // Recorrer izquierda
    postorden(raiz->derecha); // Recorrer derecha
    cout << raiz->dato << " "; // Se visita el nodo
}

// Recorrido por niveles usando cola (BFS)
void bfs(Nodo* raiz) {
    if (raiz == nullptr) return;

    queue<Nodo*> cola; //Crear cola
    cola.push(raiz); // Insertar raiz

    while (!cola.empty()) {
        Nodo* actual = cola.front(); // Obtener nodo del frente
        cola.pop(); // Eliminar de la cola

        cout << actual->dato << " "; // Mostrar dato
        
        // Insertar hijos (si existen)
        if (actual->izquierda != nullptr) cola.push(actual->izquierda);
        if (actual->derecha != nullptr) cola.push(actual->derecha);
    }
}

int main() {

    // Arbol base (Ejercicio 1)
    Nodo* raiz = new Nodo(10);
    raiz->izquierda = new Nodo(5);
    raiz->derecha = new Nodo(15);
    raiz->izquierda->izquierda = new Nodo(2);
    raiz->izquierda->derecha = new Nodo(7);
    raiz->derecha->izquierda = new Nodo(12);
    raiz->derecha->derecha = new Nodo(20);

    // Agregar nuevos nodos
    raiz->izquierda->izquierda->izquierda = new Nodo(1);
    raiz->izquierda->izquierda->derecha = new Nodo(3);
    raiz->derecha->derecha->izquierda = new Nodo(18);
    raiz->derecha->derecha->derecha = new Nodo(25);

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
