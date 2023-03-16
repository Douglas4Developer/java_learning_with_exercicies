package radioRelogio;

public class main {
    public static void main(String[] args) {
        radioRelogio panasonic = new radioRelogio(102.9, "12:00");
        System.out.println("Hora: " + panasonic.getHora());
        System.out.println("Emissora " + panasonic.getEmissora());
    }
}
