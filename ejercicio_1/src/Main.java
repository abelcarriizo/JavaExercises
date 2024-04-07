import ingredientes.Ingrediente;
import despensa.Despensa;
import recetas.*;

public class Main {
    public static void main(String[] args) {

        //Ingrediente
        Ingrediente harina = new Ingrediente("harina", 10);
        Ingrediente sal = new Ingrediente("sal", 2);

        System.out.println("Ingrediente: " + harina);
        System.out.println("Ingrediente: " + sal);

        //Despensa
        Despensa despensa = new Despensa(2);
        despensa.addIngrediente(harina);
        despensa.addIngrediente(sal);

        despensa.getIngrediente("harina", 5);
        System.out.println("Ingrediente: " + harina); //Verificando si la cantidad fue extraida

        //Recetas
        HuevoDuro huevoDuro = new HuevoDuro();
        System.out.println(huevoDuro.obtenerReceta());

        Pizza pizza = new Pizza();
        System.out.println(pizza.obtenerReceta());

        Omelette omelette = new Omelette();
        System.out.println(omelette.obtenerReceta());
    }
}
