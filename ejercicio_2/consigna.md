# Gestión de Ingredientes y Recetas

## Parte A: Entidad Ingrediente

1. Crea la entidad `Ingrediente` con los atributos `nombre` y `cantidad`. Implementa constructores, getters, setters y sobrecarga del método `toString()`.
2. Desarrolla una clase principal que instancie objetos `Ingrediente` y los muestre por pantalla.

## Parte B: Funcionalidades de la Despensa

1. Agrega el método `sacar()` a la entidad `Ingrediente`, que permita disminuir la cantidad del ingrediente, verificando que haya suficiente cantidad disponible.
2. Implementa la entidad `Despensa`, que contendrá un arreglo de `Ingrediente`. Añade el método `addIngrediente` para agregar un ingrediente a la despensa, y `getIngrediente` para obtener una cantidad específica de un ingrediente sin eliminarlo de la despensa.
3. Desarrolla una clase principal que verifique el funcionamiento de las funcionalidades implementadas.

## Parte C: Clase Receta y Subclases

1. Implementa la clase `Receta`, con atributos `tiempoCoccion`, `ingredientes` (un arreglo de `Ingrediente`) y `preparacion`.
2. Esta clase servirá como base para otras clases como `HuevoDuro`, que tendrá en el arreglo dos ingredientes (huevo y agua), un tiempo de cocción de 10 minutos y una preparación específica.
3. Construye al menos tres clases heredadas con recetas diferentes.
4. Desarrolla una clase principal que pruebe las clases y funcionalidades implementadas.

## Parte D: Gestión de Cocina y Chef

1. Crea la entidad `Chef` con los atributos `nombre` y `estrellasMichelin`. Implementa constructores, setters, getters y sobrecarga del método `toString()`.
2. Agrega una clase `CocinaService` que será utilizada por el Chef para preparar las recetas implementadas.
3. Antes de preparar una receta, el Chef debe verificar si tiene los ingredientes necesarios. Si no los tiene, mostrará un mensaje indicando la falta de ingredientes y cuánto falta de cada uno.
4. Si tiene los ingredientes necesarios, mostrará la preparación y la cantidad de ingredientes restantes en la despensa al finalizar la preparación.
5. No es necesaria la interacción del usuario, pero asegúrate de construir un escenario que muestre la salida teniendo en cuenta todas las posibilidades.
