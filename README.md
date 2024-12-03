# Ejercicios-de-matrices-ADA
# Complejidad del Algoritmo

Este algoritmo realiza operaciones sobre una matriz de tamaño `n x n`, con las siguientes tareas principales:

1. Lectura de la matriz y cálculo de las sumas de las diagonales.
2. Mostrar la matriz.

## 1. Complejidad Temporal

### a. Lectura de los Elementos de la Matriz
Se realiza un ciclo anidado que recorre todos los elementos de la matriz. Dado que la matriz es de tamaño `n x n`, la complejidad es:

- **Complejidad**: `O(n^2)`

### b. Cálculo de las Sumas de las Diagonales
Se recorre la matriz una vez con un solo ciclo que va de `0` a `n - 1`. Por lo tanto, esta operación tiene complejidad:

- **Complejidad**: `O(n)`

### c. Mostrar la Matriz
De nuevo, se recorre todos los elementos de la matriz con un ciclo anidado. Esto tiene una complejidad de:

- **Complejidad**: `O(n^2)`

### d. Complejidad Total Temporal
La operación dominante es la lectura y visualización de los elementos, ambas con complejidad `O(n^2)`. Por lo tanto, la complejidad temporal total del algoritmo es:

- **Complejidad Total**: `O(n^2)`

## 2. Complejidad Espacial

### a. Matriz
El algoritmo utiliza una matriz de `n x n`, lo que requiere espacio adicional de:

- **Complejidad**: `O(n^2)`

### b. Variables Auxiliares
Solo se utilizan unas pocas variables auxiliares (`sp`, `ss`, `i`, `j`), lo cual es constante:

- **Complejidad**: `O(1)`

### c. Complejidad Total Espacial
La complejidad espacial total es dominada por el espacio requerido para la matriz:

- **Complejidad Total**: `O(n^2)`

## Conclusión

- **Complejidad Temporal**: `O(n^2)`
- **Complejidad Espacial**: `O(n^2)`
