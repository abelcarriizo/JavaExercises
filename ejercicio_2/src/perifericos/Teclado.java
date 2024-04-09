package perifericos;

public class Teclado extends DispositivoEntrada {
    private final int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipo, String marca) {
        super(tipo, marca);
        this.idTeclado = ++Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
       return "Teclado: [ID: " + this.idTeclado + ", " + super.toString() + "]"; 
    }
}
