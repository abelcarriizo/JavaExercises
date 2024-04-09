package computadora;

import perifericos.*;

public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadora;

    private Computadora() {
        this.idComputadora = ++Computadora.contadorComputadora;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public int getIdComputadora() {
        return this.idComputadora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(String marca, double tamaño) {
        this.monitor.setMarca(marca);
        this.monitor.setTamaño(tamaño);
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(String marca, String tipo) {
        this.teclado.setMarca(marca);
        this.teclado.setTipo(marca);
    }

    public Raton getRaton() {
        return this.raton;
    }

    public void setRaton(String marca, String tipo) {
        this.raton.setMarca(nombre);
        this.raton.setTipo(tipo);
    }

    @Override
    public String toString() {
        return "\nComputadora " + this.idComputadora + " { " + this.monitor + ", " + this.teclado + ", " + this.raton + " }";
    }
}
