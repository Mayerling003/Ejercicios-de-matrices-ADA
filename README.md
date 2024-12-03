# Ejercicios-de-matrices-ADA
# Complejidad del Primer Algoritmo

El algoritmo realiza dos tareas principales: 

1. Leer la matriz y calcular las sumas de las diagonales.
2. Mostrar la matriz.

## Complejidad Temporal

- **Lectura de la matriz**: Recorre todos los elementos con un ciclo anidado, por lo que la complejidad es `O(n^2)`.
- **Cálculo de sumas de las diagonales**: Solo se recorre la matriz una vez, con complejidad `O(n)`.
- **Mostrar la matriz**: Se recorre nuevamente todos los elementos con complejidad `O(n^2)`.

**Complejidad total**: `O(n^2)` (dominado por la lectura y visualización de la matriz).

## Complejidad Espacial

- **Matriz**: Se necesita espacio para una matriz de `n x n`, lo que requiere `O(n^2)` de espacio.
- **Variables auxiliares**: Solo se usan algunas variables como `sp`, `ss`, `i`, `j`, lo cual es `O(1)`.

**Complejidad total**: `O(n^2)` (dominado por la matriz).

## Conclusión

- **Complejidad Temporal**: `O(n^2)`
- **Complejidad Espacial**: `O(n^2)`
