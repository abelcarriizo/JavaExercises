package perifericos;

public class Monitor {
    private final int IdMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    public Monitor() {
        this.IdMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double tamaño) {
        this();
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public int getIdMonitor() {
        return this.IdMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Monitor [ ID: " + this.IdMonitor + ", Marca: " + this.marca + ", Tamaño: " + this.tamaño + " ]";
    }
}
