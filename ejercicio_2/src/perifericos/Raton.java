package perifericos;

public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipo, String marca) {
        super(tipo, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
       return "Raton: [ID: " + this.idRaton + ", " + super.toString() + "]"; 
    }
}
