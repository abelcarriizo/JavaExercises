package perifericos;

public class DispositivoEntrada {
    private String tipo;
    private String marca;

    public DispositivoEntrada(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Marca: " + this.marca + ", Tipo de entrada: " + this.tipo;
    }
}
