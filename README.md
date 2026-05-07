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

*Recursividad:*
La recursividad es una técnica de programación donde una función se llama a sí misma para resolver un problema de manera repetitiva.
Los recorridos DFS utilizan recursividad porque cada subárbol puede tratarse como un árbol independiente.

*Recorridos de Árboles Binarios:*
Un recorrido es el proceso mediante el cual se visitan todos los nodos del árbol siguiendo un orden específico.
Los recorridos permiten:
<pre>
•	Mostrar información. 
•	Buscar datos. 
•	Procesar estructuras jerárquicas. 
•	Organizar información. 
</pre>
Existen dos tipos principales:

•	DFS (Depth First Search) 
•	BFS (Breadth First Search) 

DFS (Depth First Search):
DFS significa “búsqueda en profundidad”. Este método recorre primero las ramas más profundas del árbol antes de regresar a otros nodos.
Los recorridos DFS son:
•	Inorden 
•	Preorden 
•	Postorden 
DFS generalmente utiliza:
•	Recursividad 
•	Pila implícita del sistema 

Recorrido Inorden:
El recorrido Inorden sigue el orden: Izquierda → Raíz → Derecha
Recorrido Preorden:
El recorrido Preorden sigue el orden: Raíz → Izquierda → Derecha
Recorrido Postorden:
El recorrido Postorden sigue el orden: Izquierda → Derecha → Raíz
BFS (Breadth First Search):
BFS significa “búsqueda en anchura”. Este recorrido visita los nodos nivel por nivel.

Árboles Binarios en C++:
En C++ los árboles binarios se implementan utilizando:
•	estructuras (struct) 
•	punteros 
•	memoria dinámica (new) 

Ejemplo:
Nodo* izquierdo;
Nodo* derecho;

Árboles Binarios en Java:
En Java los árboles binarios se implementan mediante:
•	clases 
•	objetos 
•	referencias 

Ejemplo:
Nodo izquierdo;
Nodo derecho;

Aplicación de Árboles Binarios en Sistemas Reales:
En esta práctica se aplicó un árbol binario para representar módulos de un sistema web:

Sistema Web
/                            \
  Usuarios               Inventario
/           \                /               \
Registrar  Buscar  Productos  Reportes

Esto permite comprender cómo las estructuras jerárquicas pueden utilizarse para organizar módulos y procesos dentro de aplicaciones reales.
