package fabricadeSalgados;

public class CearaEmpadaIngrediantesFactory extends SalgadoIngredientesFactory{
    @Override
    public String criarMassa() {
        return ("Crepioca");
    }

    @Override
    public String criarMolho() {
        return ("Camarao");
    }

    @Override
    public String criarRecheio() {
        return ("Peixe");
    }
}
