package factorymarketingRefrigerante.models;

public class Pepsi extends Refrigerante{

    private String promocao;

    public Pepsi(String marca, String tipo, int volume, double preco, String promocao) {
        super(marca, tipo, volume, preco);
        this.promocao = promocao;
    }

    public Pepsi(String promocao) {
        this.promocao = promocao;
    }

    public String getPromocao() {
        return promocao;
    }

    public void setPromocao(String promocao) {
        this.promocao = promocao;
    }


    @Override
    public void Propaganda(){
        System.out.println("Marca: " + super.getMarca() + "  " + "Volume: " + super.getVolume() +
                "Tipo: " +super.getTipo() + "  " +   "Preço: " +super.getPreco() + "  " + "Promoção: " + getPromocao());

    }







}
