public abstract class Krankenwagen extends Fahrzeug {
    private boolean blaulicht = true;

    public Krankenwagen(double position, double geschwindigkeit, boolean blaulicht) {
        super(position, geschwindigkeit);
        this.blaulicht = blaulicht;
    }

    public Krankenwagen() {
        super(0,0);
        blaulicht = true;
    }

    public boolean blaulichtStatus() {
        return blaulicht;
    }

    public void blaulichtEinAus() {
        blaulicht = !blaulicht;
    }
}
