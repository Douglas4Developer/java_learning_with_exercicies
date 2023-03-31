package fabricadeSalgados;

public class CearaCoxinhaIngredientesFactory extends SalgadoIngredientesFactory{
    @Override
    public String criarMassa() {
        return ("Grosso");
    }

    @Override
    public String criarMolho() {
        return ("Pimenta");
    }

    @Override
    public String criarRecheio() {
        return ("Carne Seca");
    }
}
