package ejercicio_0;

public class Caja {
    int ancho;
    int alto;
    int profundo;

    public Caja() { 
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calculadoraVolumen() {
        int volumen = this.ancho * this.alto * this.profundo;
        return volumen;
    }
}
