package despensa;

import ingredientes.Ingrediente;

public class Despensa {
    private Ingrediente[] ingredientes;
    public static int contador;


    public Despensa(int capacidad){
        this.ingredientes = new Ingrediente[capacidad];
    }

    public void addIngrediente(Ingrediente ingrediente) {
        this.ingredientes[Despensa.contador++] = ingrediente;
    }

    public boolean getIngrediente(String ingrediente, int cantidad) {
        for (int i = 0; i < this.ingredientes.length; i++) {
            System.out.println(this.ingredientes[i]);
            if (this.ingredientes[i] != null && this.ingredientes[i].getNombre().equals(ingrediente)){
                this.ingredientes[i].sacar(cantidad);
                return true;
            }
        }
        return false;
    }

}