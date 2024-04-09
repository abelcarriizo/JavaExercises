import perifericos.*;
import computadora.*;
import orden.*;

public class Main {
    public static void main(String[] args) {
        Monitor lg = new Monitor("lg",27.0);
        Monitor samsung = new Monitor("samsung", 40.0);

        Raton logitech = new Raton("USB", "Logitech");
        Raton philip = new Raton("Inalambrico", "Philip");

        Teclado redDragon = new Teclado("USB-C", "Red Dragon");
        Teclado hyperX = new Teclado("Bluetooth", "HyperX");

        Computadora razer = new Computadora("Razer Blade", lg, redDragon, logitech);
        Computadora asus = new Computadora("Asus Rog Zephirus", samsung, hyperX, philip);

        Orden orden1 = new Orden();
        Orden orden2 = new Orden();

        orden1.agregarComputadora(razer);
        orden1.agregarComputadora(asus);

        orden1.mostrarOrden();

        orden2.agregarComputadora(asus);
        
        orden2.mostrarOrden();
    }    
}