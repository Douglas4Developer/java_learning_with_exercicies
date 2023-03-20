package factorymarketingRefrigerante.models;

public class CocaCola extends Refrigerante {
    public CocaCola(String marca, String tipo, int volume, double preco) {
        super(marca, tipo, volume, preco);
    }

    public CocaCola() {
    }

    @Override
    public void Propaganda(){
        System.out.println("Marca: " + super.getMarca() + "  " + "Volume: " + super.getVolume() + "  " +
                "Tipo: " +super.getTipo() + "  " +   "Preço: " +super.getPreco());

    }




}