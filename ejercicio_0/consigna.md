# Clase Caja en Java

## Descripción del ejercicio

Se requiere crear una clase en Java llamada `Caja` que contenga tres atributos: alto, ancho y profundidad. Además, la clase debe tener dos constructores, uno vacío y otro que acepte los valores para los atributos alto, ancho y profundidad. También, debe tener un método que calcule el volumen de la caja.

Además de la clase `Caja`, se debe crear una clase `Main` que interactúe con la clase `Caja`, ingresando valores para los atributos y mostrando el resultado del cálculo del volumen.

## Requisitos

1. La clase `Caja` debe tener los siguientes atributos:
   - alto (tipo int)
   - ancho (tipo int)
   - profundidad (tipo int)

2. La clase `Caja` debe tener los siguientes métodos:
   - Constructor vacío `Caja()`
   - Constructor `Caja(int alto, int ancho, int profundidad)`
   - Método `calcularVolumen()` que retorne el volumen de la caja (tipo int)

3. La clase `Main` debe tener un método `main` que:
   - Cree una instancia de la clase `Caja`
   - Asigne valores a los atributos de la caja
   - Llame al método `calcularVolumen()` para obtener el volumen
   - Muestre el resultado del cálculo del volumen en la consola

## Ejemplo de uso

Supongamos que se crean los siguientes objetos:

```java
Caja miCaja = new Caja();  // Utiliza el constructor vacío
Caja cajaPersonalizada = new Caja(10, 20, 15);  // Utiliza el constructor con parámetros
int volumen = cajaPersonalizada.calcularVolumen();
System.out.println("El volumen de la caja personalizada es: " + volumen);
