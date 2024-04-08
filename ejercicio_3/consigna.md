# Modificaciones sobre el ejercicio_2

En base al ejercicio 2 realizar las siguiente modificaciones:

- [ ] 1. Agrega la interfaz `Cocinable`, que permitirá cocinar solo con objetos que la implementen.
- [ ] 2. Introduce la interfaz `Despensable`, para incluir objetos adicionales en las recetas, como Utensilios. Ahora la despensa contendrá no solo ingredientes, sino todos los objetos que sean `Despensable`.
- [ ] 3. Convierte los arreglos utilizados en el TP anterior en colecciones. Se sugiere cambiar el arreglo de `Ingrediente` de la despensa por un `Map` de `Despensable` donde la clave sea el nombre del objeto representado como un `String`.
- [ ] 4. Añade la interfaz `Reutilizable` para los Utensilios, con el atributo `vidaUtil` que se consumirá al ser utilizado para cocinar.
- [ ] 5. Modifica las recetas para incluir los Utensilios utilizados. Cada receta, además de reducir el stock de la Despensa, debería verificar si tiene los utensilios necesarios y el servicio `CocinaService` debe disminuir la `vidaUtil` del utensilio usado.
- [ ] 6. Introduce una excepción personalizada `VidaUtilInsuficiente` para casos en los que el tiempo de vida restante no sea suficiente para cocinar.
- [ ] 7. Agrega una excepción personalizada `StockInsuficiente` para cuando la Despensa no tenga suficiente cantidad de un Ingrediente para la receta.
- [ ] 8. Implementa un servicio `DespensaService` encargado de verificar el stock y la vida útil antes de cocinar. Además, agrega un método `renovarUtensilios` para "resetear" la vida útil de los utensilios inutilizables.
- [ ] 9.  Intenta utilizar streams donde sea posible para mejorar la eficiencia del código.
