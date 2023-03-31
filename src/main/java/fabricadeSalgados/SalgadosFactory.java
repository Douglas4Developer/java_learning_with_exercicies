package fabricadeSalgados;

import fabricadeSalgados.models.Coxinha;
import fabricadeSalgados.models.Empada;
import fabricadeSalgados.models.Salgado;

public  class SalgadosFactory {

    private SalgadoIngredientesFactory ingredientes;
    private Salgado salgadinho;

    public SalgadosFactory() {
    }

    public SalgadosFactory(SalgadoIngredientesFactory ingredientesFactory, Salgado salgadinho) {
        this.ingredientes = ingredientesFactory;
        this.salgadinho = salgadinho;
    }

    public void assarSalgado(String tipo, String regiao){

        if (tipo.equals("COXINHA")){
            if (regiao.equals("GOIAS"))
            {
                this.ingredientes = new GoiasCoxinhaIngredientesFactory();
                this.salgadinho = new Coxinha(ingredientes.criarMassa(), ingredientes.criarMolho(), ingredientes.criarRecheio());
            }
                this.ingredientes = new CearaCoxinhaIngredientesFactory();
                this.salgadinho = new Coxinha(ingredientes.criarMassa(), ingredientes.criarMolho(), ingredientes.criarRecheio());

        } else
            if (tipo.equals("EMPADA")) {
                if(regiao.equals("GOIAS")){
                  this.ingredientes = new GoiasEmpadaIngrediantesFactory();
                    this.salgadinho = new Empada(ingredientes.criarMassa(), ingredientes.criarMolho(), ingredientes.criarRecheio());
              }else
                  this.ingredientes = new CearaEmpadaIngrediantesFactory();
                  this.salgadinho = new Empada(ingredientes.criarMassa(), ingredientes.criarMolho(), ingredientes.criarRecheio());
        }
    }

    public SalgadoIngredientesFactory getIngredientesCoxinha(String regiao){
        if (regiao.equals("GOIAS")){
            return new GoiasCoxinhaIngredientesFactory();
        }else
            return new CearaCoxinhaIngredientesFactory();
    }
    public SalgadoIngredientesFactory getIngredienteEmpada(String regiao){
        if (regiao.equals("GOIAS")){
            return new GoiasEmpadaIngrediantesFactory();
        }else
            return new CearaEmpadaIngrediantesFactory();
    }

    public Salgado getSalgadinho() {
        return salgadinho;
    }

    @Override public String toString(){
        return "Massa: " + this.salgadinho.getMassa() +  " " +
                "Molho: " + this.salgadinho.getMolho() + " " +
                "Recheio: " + this.salgadinho.getRecheio();

    }

}
