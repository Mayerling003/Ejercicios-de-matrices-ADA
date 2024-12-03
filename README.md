# Ejercicios-de-matrices-ADA
# Ejercicio 1: Suma de la Diagonal Principal y Secundaria

Dada una matriz cuadrada `m` de números enteros de dimensión `d`, el objetivo de este ejercicio es calcular la suma de los elementos de:

- **Diagonal principal** (de la esquina superior izquierda a la esquina inferior derecha).
- **Diagonal secundaria** (de la esquina superior derecha a la esquina inferior izquierda).


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

# Complejidad del Segundo Algoritmo
