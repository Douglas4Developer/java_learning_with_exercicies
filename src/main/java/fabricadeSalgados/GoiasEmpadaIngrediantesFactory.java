package fabricadeSalgados;

public class GoiasEmpadaIngrediantesFactory extends SalgadoIngredientesFactory{

    @Override
    public String criarMassa() {
        return ("Podre");
    }

    @Override
    public String criarMolho() {
        return ("Tomate");
    }


    @Override
    public String criarRecheio() {
        return ("Calabresa");
    }

}
