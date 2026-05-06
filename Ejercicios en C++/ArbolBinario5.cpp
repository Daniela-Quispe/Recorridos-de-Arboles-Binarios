#include <iostream>
#include <queue> // Libreria para colas

using namespace std;

// Estructura del nodo del arbol
struct Nodo {
    string dato; // Valor del nodo
    Nodo* izq; // Puntero al hijo izquierdo
    Nodo* der; // Puntero al hijo derecho
    
    // Constructor del nodo
    Nodo(string v) {
        dato = v;
        izq = der = nullptr;
    }
};

// RECORRIDOS

// Preorden: raiz, izquierda, derecha
void preorden(Nodo* r) {
    if (r == nullptr) return; // Caso base

    static bool primero = true; // Controla el formato de impresion
    
    // Imprimir separador (excepto en el primero)
    if (!primero) cout << " -> ";
    cout << r->dato;
    primero = false;

    preorden(r->izq); // Recorrer izquierda
    preorden(r->der); // Recorrer derecha
}

// Inorden: izquierda, raiz, derecha
void inorden(Nodo* r) {
    if (r == nullptr) return; // Caso base

    static bool primero = true; // Controla el formato de impresion

    inorden(r->izq); // Recorre izquierda
    
    // Imprimir separador (excepto en el primero)
    if (!primero) cout << " -> ";
    cout << r->dato;
    primero = false;

    inorden(r->der); // Recorre derecha
}

// Postorden: izquierda, derecha, raiz
void postorden(Nodo* r) {
    if (r == nullptr) return; // Caso base

    static bool primero = true; // Controla el formato de impresion

    postorden(r->izq); // Recorre izquierda
    postorden(r->der); // Recorre derecha
    
    // Imprimir separador (excepto en el primero)
    if (!primero) cout << " -> ";
    cout << r->dato;
    primero = false;
}

// Recorrido por niveles (BFS)
void bfs(Nodo* r) {
    if (r == nullptr) return; // Caso base

    queue<Nodo*> q; // Crear cola
    q.push(r); // Insertar raiz

    bool primero = true; // Controla el formato

    while (!q.empty()) {
        Nodo* actual = q.front(); // Obtener frente
        q.pop(); // Eliminar frente
        
        // Imprimir separador (excepto en el primero)
        if (!primero) cout << " -> ";
        cout << actual->dato;
        primero = false;
        
        // Insertar hijos (si existen)
        if (actual->izq) q.push(actual->izq);
        if (actual->der) q.push(actual->der);
    }
}

int main() {
	
	// Constructor del arbol
    Nodo* raiz = new Nodo("Sistema Web");

    raiz->izq = new Nodo("Usuarios");
    raiz->der = new Nodo("Inventario");

    raiz->izq->izq = new Nodo("Registrar");
    raiz->izq->der = new Nodo("Buscar");

    raiz->der->izq = new Nodo("Productos");
    raiz->der->der = new Nodo("Reportes");

    int opcion; // Variable para le menu

//Menu Principal
    do {
        cout << "\n===== MENU PRINCIPAL DE UN ARBOL BINARIO =====\n";
        cout << "1. Preorden (Mostrar estructura del sistema)\n";
        cout << "2. Inorden (Recorrido ordenado)\n";
        cout << "3. Postorden (Ejecutar modulos internos primero)\n";
        cout << "4. BFS (Recorrido jerarquico por niveles)\n";
        cout << "5. Salir\n";
        cout << "Seleccione: ";
        cin >> opcion;

        cout << "\n";

        switch (opcion) {

            case 1:
                cout << "PREORDEN: "; 
                preorden(raiz); // Ejecutar preorden
                cout << endl;
                break;

            case 2:
                cout << "INORDEN: ";
                inorden(raiz); // Ejecutar inorden
                cout << endl;
                break;

            case 3:
                cout << "POSTORDEN: ";
                postorden(raiz); // Ejecutar postorden
                cout << endl;
                break;

            case 4:
                cout << "BFS: ";
                bfs(raiz); // Ejecutar BFS
                cout << endl;
                break;

            case 5:
                cout << "Cerrando sistema de arboles binarios...\n";
                break;

            default:
                cout << "Opcion invalida\n";
        }

    } while (opcion != 5); // Repetir hasta que el usuario decida salir

    return 0;
}
