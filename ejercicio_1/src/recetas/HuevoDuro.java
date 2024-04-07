package recetas;

import ingredientes.Ingrediente;

public class HuevoDuro extends Receta {
    public HuevoDuro() {
        super(10, new Ingrediente[]{new Ingrediente("Huevo", 1), new Ingrediente("Agua", 100)}, "Poner 1 huevo en agua hirviendo durante 10 minutos.");
    }

    public String obtenerReceta() {
        return "HUEVO DURO\n" + super.obtenerReceta();
    }
}

