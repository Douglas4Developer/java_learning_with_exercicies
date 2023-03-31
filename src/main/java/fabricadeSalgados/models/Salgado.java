package fabricadeSalgados.models;

import fabricadeSalgados.SalgadoIngredientesFactory;

public abstract class Salgado {
    protected String massa;
    protected String molho;
    protected String recheio;

    protected SalgadoIngredientesFactory ingredientes;

    public Salgado() {
    }

    public Salgado(String massa, String molho, String recheio, SalgadoIngredientesFactory ingredientes) {
        this.massa = massa;
        this.molho = molho;
        this.recheio = recheio;
        this.ingredientes = ingredientes;
    }


    public Salgado(String massa, String molho, String recheio) {
        this.massa = massa;
        this.molho = molho;
        this.recheio = recheio;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public SalgadoIngredientesFactory getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(SalgadoIngredientesFactory ingredientes) {
        this.ingredientes = ingredientes;
    }
}
