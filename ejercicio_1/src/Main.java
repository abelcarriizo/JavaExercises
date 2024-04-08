import ventas.*;

public class Main {

    public static void main(String[] args) {
        
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();

        Producto camisa = new Producto("camisa", 50.00);
        Producto pantalon = new Producto("pantalon", 60.00);
        Producto medias = new Producto("medias", 20.00);
        Producto gorra = new Producto("gorra", 30.00);

        orden1.agregarProducto(camisa);
        orden1.agregarProducto(pantalon);
        orden2.agregarProducto(medias);
        orden1.agregarProducto(gorra);

        orden1.mostrarOrden();
        orden2.mostrarOrden();


    }
}
