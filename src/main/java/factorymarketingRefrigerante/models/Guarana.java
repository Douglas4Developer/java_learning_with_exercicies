package factorymarketingRefrigerante.models;

public class Guarana extends Refrigerante{

    public Guarana(String marca, String tipo, int volume, double preco, String brinde) {
        super(marca, tipo, volume, preco);
        this.brinde = brinde;
    }

    public Guarana(String brinde) {
        this.brinde = brinde;
    }

    private String brinde;

    public String getBrinde() {
        return brinde;
    }

    public void setBrinde(String brinde) {
        this.brinde = brinde;
    }

    @Override
    public void Propaganda(){
        System.out.println("Marca: " + super.getMarca() + "  " + "Volume: " + super.getVolume() + "  " +
                "Tipo: " +super.getTipo() + "  " +   "Preço: " +super.getPreco() + "  " + "Brinde: " + getBrinde());

    }

}
