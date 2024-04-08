package ventas;

public class Orden {
    private int idOrden;
    private Producto[] productos;
    private static int contadorOrdenes;
    private int contadorProductos;
    public static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            productos[contadorProductos++] = producto;
        } else {System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);}
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("ID Orden: " + this.idOrden);

        System.out.println("Productos de la Orden:");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }

        double total = this.calcularTotal();
        System.out.println("Precio Total: $" + total);
        System.out.println("------\n");
    }
}
