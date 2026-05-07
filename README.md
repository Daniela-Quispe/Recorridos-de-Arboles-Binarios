# Recorridos Inorden, Preorden, Postorden y BFS

# 1.	INTRODUCCION:
Un recorrido de árbol es un proceso sistemático para visitar todos los nodos de una estructura jerárquica. En arboles binarios se utilizan principalmente recorridos en profundidad: Inorden, Preorden y Postorden. Además, el recorrido BFS permite visitar nodos por niveles usando una cola.

Los árboles binarios son estructuras de datos dinámicas utilizadas para organizar información de manera jerárquica. Cada nodo puede tener un hijo izquierdo y un hijo derecho, permitiendo representar relaciones entre elementos.
Dentro de las estructuras de datos, los recorridos de árboles son fundamentales porque permiten visitar todos los nodos siguiendo diferentes estrategias. Los recorridos más utilizados son:
<pre>
•	Inorden
•	Preorden
•	Postorden
•	BFS (Breadth First Search)
</pre>
Los recorridos Inorden, Preorden y Postorden pertenecen a DFS (Depth First Search), mientras que BFS trabaja por niveles utilizando una cola.
En esta tarea se desarrollaron programas en C++ y Java para implementar los diferentes recorridos de árboles binarios, analizar su funcionamiento y aplicar los conceptos a un caso real relacionado con un sistema web.

# 2.	MARCO TEORICO:
<pre> 
*Arboles Binarios:*
</pre>
Un árbol binario es una estructura dinámica formada por nodos conectados entre sí. Cada nodo puede contener:
<pre>
•	Un dato o valor. 
•	Un hijo izquierdo. 
•	Un hijo derecho. 
</pre>
El primer nodo del árbol se denomina raíz y es el punto de inicio de toda la estructura. Los nodos que no tienen hijos se conocen como hojas.
<pre>
*Nodos en un Árbol Binario:*
</pre>
Los nodos representan cada elemento almacenado dentro del árbol. Cada nodo contiene información y referencias hacia otros nodos.
En C++ se utilizan punteros para conectar nodos dinámicamente, mientras que en Java se utilizan referencias a objetos.
La utilización de nodos permite que el árbol pueda crecer dinámicamente durante la ejecución del programa.
<pre>
*Recursividad:*
</pre>
La recursividad es una técnica de programación donde una función se llama a sí misma para resolver un problema de manera repetitiva.
Los recorridos DFS utilizan recursividad porque cada subárbol puede tratarse como un árbol independiente.
<pre>
*Recorridos de Árboles Binarios:*
</pre>
Un recorrido es el proceso mediante el cual se visitan todos los nodos del árbol siguiendo un orden específico.
Los recorridos permiten:
<pre>
•	Mostrar información. 
•	Buscar datos. 
•	Procesar estructuras jerárquicas. 
•	Organizar información. 
</pre>
Existen dos tipos principales:
<pre>
•	DFS (Depth First Search) 
•	BFS (Breadth First Search) 
</pre>
<pre>
*DFS (Depth First Search):*
</pre>
DFS significa “búsqueda en profundidad”. Este método recorre primero las ramas más profundas del árbol antes de regresar a otros nodos.
Los recorridos DFS son:
<pre>
•	Inorden 
•	Preorden 
•	Postorden 
</pre>
DFS generalmente utiliza:
<pre>
•	Recursividad 
•	Pila implícita del sistema 
</pre>

# Recorrido Inorden:
El recorrido Inorden sigue el orden: Izquierda → Raíz → Derecha
# Recorrido Preorden:
El recorrido Preorden sigue el orden: Raíz → Izquierda → Derecha
# Recorrido Postorden:
El recorrido Postorden sigue el orden: Izquierda → Derecha → Raíz
3 BFS (Breadth First Search):
BFS significa “búsqueda en anchura”. Este recorrido visita los nodos nivel por nivel.

# Árboles Binarios en C++:
En C++ los árboles binarios se implementan utilizando:
<pre>
•	estructuras (struct) 
•	punteros 
•	memoria dinámica (new) 
</pre>
<pre>
Ejemplo:
Nodo* izquierdo;
Nodo* derecho;
</pre>
# Árboles Binarios en Java:
En Java los árboles binarios se implementan mediante:
<pre>
•	clases 
•	objetos 
•	referencias 
</pre>
<pre>
Ejemplo:
Nodo izquierdo;
Nodo derecho;
</pre>
# Aplicación de Árboles Binarios en Sistemas Reales:
En esta práctica se aplicó un árbol binario para representar módulos de un sistema web:
<pre>
              Sistema Web
          /                \
      Usuarios         Inventario
     /       \         /         \
Registrar  Buscar  Productos  Reportes
</pre>
Esto permite comprender cómo las estructuras jerárquicas pueden utilizarse para organizar módulos y procesos dentro de aplicaciones reales.

# 3.	DESARROLLO DE LOS EJERCICIOS:

La práctica se desarrolló mediante la implementación de recorridos de árboles binarios en los lenguajes C++ y Java, utilizando estructuras dinámicas, recursividad y colas. 

## EJERCICIO 1:

Dado este árbol:
<pre>
          10
        /    \
      5      15
     / \     / \
   2   7    12 20  
</pre>
Escriba manualmente:
<pre>
1.	Preorden
2.	Inorden
3.	Postorden
4. BFS
</pre>
## Construcción del Árbol Binario:
Inicialmente se creó un árbol binario utilizando nodos enlazados dinámicamente. Cada nodo almacena un valor y referencias hacia sus hijos izquierdo y derecho.

El árbol utilizado fue el siguiente:
<pre>
          10
        /    \
      5       15
     / \     /  \
   2   7    12  20
</pre>
<pre>
Donde:
•	10 representa la raíz principal. 
•	5 y 15 corresponden al segundo nivel. 
•	2, 7, 12 y 20 representan nodos hoja. 
</pre>
La construcción del árbol se realizó manualmente asignando cada hijo izquierdo y derecho en ambos lenguajes de programación.

## Implementación de Recorridos DFS:
Posteriormente se implementaron los recorridos DFS utilizando funciones recursivas. Estos recorridos permiten explorar completamente una rama del árbol antes de pasar a otra.
Los recorridos implementados fueron:
<pre>
•	Preorden 
•	Inorden 
•	Postorden 
</pre>
## Recorrido Preorden:
El recorrido Preorden sigue el orden: Raíz → Izquierda → Derecha
<pre>
Proceso realizado:
1.	Visitar la raíz 10. 
2.	Recorrer el subárbol izquierdo. 
3.	Recorrer el subárbol derecho. 
</pre>
Resultado obtenido: 10 5 2 7 15 12 20
Este recorrido permitió observar primero la estructura principal del árbol antes de recorrer sus niveles inferiores.

## Recorrido Inorden:
El recorrido Inorden sigue el orden: Izquierda → Raíz → Derecha
<pre>
Proceso realizado:
1.	Recorrer completamente el subárbol izquierdo. 
2.	Visitar la raíz. 
3.	Recorrer el subárbol derecho. 
</pre>
Resultado obtenido: 2 5 7 10 12 15 20
Este recorrido mostró los valores ordenados de menor a mayor debido a la estructura del árbol binario.

## Recorrido Postorden:
El recorrido Postorden sigue el orden: Izquierda → Derecha → Raíz
<pre>
Proceso realizado:
1.	Recorrer el subárbol izquierdo. 
2.	Recorrer el subárbol derecho. 
3.	Visitar la raíz al final. 
</pre>
Resultado obtenido: 2 7 5 12 20 15 10
Este recorrido permitió procesar primero los nodos hijos antes de trabajar con el nodo principal.

## Implementación del Recorrido BFS:
Después de implementar DFS, se desarrolló el recorrido BFS utilizando una cola. BFS permite recorrer el árbol nivel por nivel.
<pre>
Proceso realizado:
1.	Insertar la raíz en la cola. 
2.	Extraer el nodo frontal. 
3.	Mostrar el valor. 
4.	Insertar los hijos izquierdo y derecho. 
5.	Repetir el proceso hasta vaciar la cola. 
</pre>
Resultado obtenido: 10 5 15 2 7 12 20
La utilización de la cola permitió mantener el orden correcto de recorrido por niveles.

# EJERCICIO 2:

Modifique el árbol anterior agregando los nodos 1, 3, 18 y 25. Ejecute nuevamente los recorridos.

## Modificación del Árbol Binario:
Posteriormente se agregaron nuevos nodos al árbol original para analizar cómo cambian los recorridos. Nuevos nodos agregados:
<pre>
•	1 
•	3 
•	18 
•	25 
</pre>
Árbol actualizado:
<pre>
               10
          /            \
        5               15
       /  \           /    \
     2     7         12    20
    /  \                  /   \
  1    3                 18   25
</pre>
Con esta modificación se ejecutaron nuevamente los recorridos para verificar el funcionamiento correcto del programa.

## Resultados Actualizados:
<pre>
Preorden: 10 5 2 1 3 7 15 12 20 18 25
Inorden: 1 2 3 5 7 10 12 15 18 20 25
Postorden: 1 3 2 7 5 12 18 25 20 15 10
BFS: 10 5 15 2 7 12 20 1 3 18 25
</pre>
Los resultados obtenidos demostraron que los recorridos funcionan correctamente incluso después de modificar la estructura del árbol.

## Implementación de Funciones Adicionales:
Además de los recorridos, se implementaron funciones complementarias para fortalecer el manejo del árbol binario.

# EJERCICIO 3:

Implemente una función que cuente la cantidad total de nodos del árbol.

Conteo Total de Nodos: Se implementó una función recursiva capaz de contar todos los nodos del árbol.
<pre>
Proceso:
1.	Verificar si el nodo es nulo. 
2.	Contar el nodo actual. 
3.	Contar recursivamente el subárbol izquierdo. 
4.	Contar recursivamente el subárbol derecho. 
</pre>
Resultado obtenido: Total de nodos: 11

# EJERCICIO 4:

Implemente una función que cuente las hojas del árbol.

Conteo de Hojas: También se implementó una función para identificar y contar las hojas del árbol. Se consideró hoja a todo nodo sin hijos.
<pre>
Hojas identificadas:1 3 7 12 18 25
Resultado: 6 hojas
</pre>

# EJERCICIO 5 APLICADO AL PROYECTO FINAL:

Represente los módulos de un sistema web como un árbol Binario. Ejemplo:
<pre>
             Sistema Web
         /                 \
     Usuarios          Inventario
    /        \         /         \
Registrar  Buscar  Productos  Reportes
</pre>
<pre>
Explique qué recorrido usaría para:
1.	Mostrar menú principal.
2.	Procesar primero los módulos internos.
3.	Mostrar módulos nivel por nivel.
</pre>

## Caso aplicado:

Una empresa desea organizar sus módulos de un sistema web mediante un árbol binario:
<pre>
1. Nodo raíz: Sistema principal
2.	Subárbol izquierdo: Gestión de usuarios
3.	Subárbol derecho: Gestión de inventario
4.	Nodos hoja: Operaciones especificas como registrar, buscar, actualizar y eliminar.
</pre>

## Aplicación al Caso Real:
Finalmente, se aplicó el árbol binario a un sistema web para representar módulos jerárquicos.

Estructura utilizada:
<pre>
             Sistema Web
         /                 \
     Usuarios          Inventario
    /        \         /         \
Registrar  Buscar  Productos  Reportes
</pre>

## Aplicaciones de recorridos:
<pre>
•	Preorden: Mostrar el menú principal primero. 
•	Postorden: Procesar módulos secundarios antes del principal. 
•	BFS: Mostrar módulos nivel por nivel. 
</pre>
## Comparación entre C++ y Java:
Durante la práctica se observó que ambos lenguajes permiten implementar árboles binarios de manera eficiente.
<pre>
En C++:
•	se utilizaron punteros, 
•	memoria dinámica, 
•	estructuras (struct). 
En Java:
•	se utilizaron objetos, 
•	clases, 
•	referencias automáticas. 
</pre>
Aunque la lógica de recorridos es similar, la sintaxis y manejo de memoria presentan diferencias importantes entre ambos lenguajes.

# 4.	IMPLEMENTACION DE LOS EJERCICIOS EN C++:

## EJERCICIO 1:

Recorrido Preorden:
<pre>
void preorden(Nodo* raiz) {
    if (raiz == NULL) return;
    cout << raiz->dato << " ";
    preorden(raiz->izquierdo);
    preorden(raiz->derecho);
}
</pre>
Funcionamiento: La función realiza el recorrido Preorden utilizando recursividad. Primero visita la raíz, luego recorre el subárbol izquierdo y finalmente el subárbol derecho.

## Recorrido Inorden:
<pre>
void inorden(Nodo* raiz) {
    if (raiz == NULL) return;
    inorden(raiz->izquierdo);
    cout << raiz->dato << " ";
    inorden(raiz->derecho);
}
</pre>
Funcionamiento: La función recorre primero el subárbol izquierdo, después muestra la raíz y finalmente recorre el subárbol derecho.

## Recorrido Postorden:
<pre>
void postorden(Nodo* raiz) {
    if (raiz == NULL) return;
    postorden(raiz->izquierdo);
    postorden(raiz->derecho);
    cout << raiz->dato << " ";
}
</pre>
Funcionamiento: La función primero recorre los hijos izquierdo y derecho.
La raíz se muestra al final del recorrido.

## Recorrido BFS:
<pre>
void bfs(Nodo* raiz) {
    if (raiz == NULL) return;
    queue<Nodo*> cola;
    cola.push(raiz);

    while (!cola.empty()) {
        Nodo* actual = cola.front();
        cola.pop();
        cout << actual->dato << " ";

        if (actual->izquierdo != NULL) cola.push(actual->izquierdo);
        if (actual->derecho != NULL) cola.push(actual->derecho);
    }
}
</pre>
Funcionamiento: La función BFS utiliza una cola para recorrer el árbol nivel por nivel. Primero se inserta la raíz en la cola y posteriormente se recorren sus hijos en orden.

# EJERCICIO 2:

## Agregar Nuevos Nodos:
<pre>
raiz->izquierdo->izquierdo->izquierdo = new Nodo(1);
raiz->izquierdo->izquierdo->derecho = new Nodo(3);
raiz->derecho->derecho->izquierdo = new Nodo(18);
raiz->derecho->derecho->derecho = new Nodo(25);
</pre>
Funcionamiento: Se agregan nuevos nodos al árbol original utilizando memoria dinámica. Esto permite modificar la estructura del árbol y ejecutar nuevamente los recorridos.

# EJERCICIO 3:

## Contar Nodos:
<pre>
int contarNodos(Nodo* raiz) {
    if (raiz == NULL) return 0;
    return 1 + contarNodos(raiz->izquierdo) + contarNodos(raiz->derecho);
}
</pre>
Funcionamiento: La función utiliza recursividad para contar todos los nodos del árbol. Cuenta el nodo actual y suma los nodos de los subárboles izquierdo y derecho.

# EJERCICIO 4:

## Contar Hojas:
<pre>
int contarHojas(Nodo* raiz) {
    if (raiz == NULL) return 0;
    if (raiz->izquierdo == NULL && raiz->derecho == NULL) return 1;
    return contarHojas (raiz->izquierdo) + contarHojas(raiz->derecho);
}
</pre>
Funcionamiento: La función identifica los nodos que no tienen hijos y los considera hojas. Posteriormente cuenta todas las hojas existentes en el árbol.

# EJERCICIO 5:

## Sistema Web:
<pre>
Nodo* raiz = new Nodo("Sistema Web");
raiz->izquierdo = new Nodo("Usuarios");
raiz->derecho = new Nodo("Inventario");
raiz->izquierdo->izquierdo = new Nodo("Registrar");
raiz->izquierdo->derecho = new Nodo("Buscar");
raiz->derecho->izquierdo = new Nodo("Productos");
raiz->derecho->derecho = new Nodo("Reportes");
</pre>
Funcionamiento: El árbol representa módulos de un sistema web mediante una estructura jerárquica. Cada nodo corresponde a un módulo principal o secundario del sistema.

# 5.	IMPLEMENTACION DE LOS EJERCICIOS EN JAVA:

## EJERCICIO 1:

### Recorrido Preorden:
<pre>
static void preorden(Nodo raiz) {
    if (raiz == null) return;
    System.out.print(raiz.dato + " ");
    preorden(raiz.izquierdo);
    preorden(raiz.derecho);
}
</pre>
Funcionamiento: La función recorre primero la raíz y posteriormente los subárboles izquierdo y derecho utilizando recursividad.

### Recorrido Inorden:
<pre>
static void inorden(Nodo raiz) {
    if (raiz == null) return;
    inorden(raiz.izquierdo);
    System.out.print(raiz.dato + " ");
    inorden(raiz.derecho);
}
</pre>
Funcionamiento: La función recorre primero el hijo izquierdo, luego muestra la raíz y finalmente recorre el hijo derecho.

### Recorrido Postorden:
<pre>
static void postorden(Nodo raiz) {
    if (raiz == null) return;
    postorden(raiz.izquierdo);
    postorden(raiz.derecho);
    System.out.print(raiz.dato + " ");
}
</pre>
Funcionamiento: La función procesa primero ambos subárboles y al final muestra la raíz principal.

### Recorrido BFS:
<pre>
static void bfs (Nodo raiz) {
if (raiz == null) return;
Queue<Nodo> cola = new LinkedList<>();
cola.add(raiz);
while (!cola.isEmpty()) {
Nodo actual = cola.poll();
System.out.print(actual.dato + " ");
if (actual.izquierdo != null) cola.add(actual.izquierdo);
if (actual.derecho != null) cola.add(actual.derecho);
    }
}
</pre>

Funcionamiento: La función BFS utiliza una cola para recorrer los nodos por niveles.
Los nodos se almacenan temporalmente hasta completar el recorrido del árbol.

# EJERCICIO 2:

## Agregar Nuevos Nodos:
<pre>
raiz.izquierdo.izquierdo.izquierdo = new Nodo(1);
raiz.izquierdo.izquierdo.derecho = new Nodo(3);
raiz.derecho.derecho.izquierdo = new Nodo(18);
raiz.derecho.derecho.derecho = new Nodo(25);
</pre>
Funcionamiento: Se agregan nuevos nodos al árbol binario original para modificar su estructura. Cada nuevo nodo se conecta mediante referencias hacia los hijos izquierdo y derecho. Después de insertar los nodos, los recorridos se ejecutan nuevamente para observar los cambios producidos en el árbol.

# EJERCICIO 3:

## Contar Nodos:
<pre>
static int contarNodos(Nodo raiz) {
    if (raiz == null) return 0;
    return 1 + contarNodos(raiz.izquierdo) + contarNodos(raiz.derecho);
}
</pre>
Funcionamiento: La función utiliza recursividad para recorrer todo el árbol binario.
Cuenta el nodo actual y suma la cantidad de nodos encontrados en el subárbol izquierdo y derecho. El resultado corresponde al número total de nodos existentes en el árbol.

# EJERCICIO 4:

## Contar Hojas:
<pre>
static int contarHojas(Nodo raiz) {
    if (raiz == null) return 0;
    if (raiz.izquierdo == null && raiz.derecho == null) return 1;
    return contarHojas(raiz.izquierdo) + contarHojas(raiz.derecho);
}
</pre>
Funcionamiento: La función identifica los nodos que no tienen hijos y los considera hojas. Posteriormente recorre el árbol utilizando recursividad para calcular la cantidad total de hojas.

# EJERCICIO 5:

## Sistema Web:
<pre>
Nodo raiz = new Nodo("Sistema Web");
raiz.izquierdo = new Nodo("Usuarios");
raiz.derecho = new Nodo("Inventario");
raiz.izquierdo.izquierdo = new Nodo("Registrar");
raiz.izquierdo.derecho = new Nodo("Buscar");
raiz.derecho.izquierdo = new Nodo("Productos");
raiz.derecho.derecho = new Nodo("Reportes");
</pre>
Funcionamiento: El árbol binario representa la estructura jerárquica de un sistema web. La raíz representa el sistema principal y los demás nodos corresponden a módulos secundarios. Esta representación permite aplicar los recorridos a situaciones reales dentro del desarrollo de software.

# 6.	CAPTURAS EN C++:

Se incluyen capturas del funcionamiento del programa:

