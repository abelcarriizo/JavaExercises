import ingredientes.Ingrediente;
import src.despensa.Despensa;

public class Main {
    public static void main(String[] args) {
        Ingrediente harina = new Ingrediente("harina", 10);
        Ingrediente sal = new Ingrediente("sal", 2);

        System.out.println("Ingrediente: " + harina);
        System.out.println("Ingrediente: " + sal);

        Despensa despensa = new Despensa(2);
        despensa.addIngrediente(harina);
        despensa.addIngrediente(sal);

        despensa.getIngrediente("harina", 5);
        System.out.println("Ingrediente: " + harina);

    }
}
