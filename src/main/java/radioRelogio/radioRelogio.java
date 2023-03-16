package radioRelogio;

public class radioRelogio implements Radio, Relogio{
    private double emissora;
    private String hora;

    @Override
    public void setEmissora(double e) {
    this.emissora = e;
    }

    public radioRelogio() {
    }

    public radioRelogio(double emissora, String hora) {
        this.emissora = emissora;
        this.hora = hora;
    }

    @Override
    public double getEmissora() {
        return this.emissora;
    }

    @Override
    public void setHora(String h) {
    this.hora = h;
    }

    @Override
    public String getHora() {
        return this.hora;
    }
}
