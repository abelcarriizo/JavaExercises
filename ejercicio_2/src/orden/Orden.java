package orden;

import computadora.*;

public class Orden {
    private final int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden () {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public int getIdOrden() {
        return this.idOrden;
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_COMPUTADORAS);}

    }

    public void mostrarOrden() {
        System.out.println("Orden nro. " + this.idOrden);

        System.out.println("Productos de la Orden:");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
        System.out.println("------\n");
    }
}
