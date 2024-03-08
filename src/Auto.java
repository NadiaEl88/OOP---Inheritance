public abstract class Auto extends Fahrzeug {
    private int anzahlRaeder = 4;
    private double maxGeschwindigkeit = 140;

    public Auto(double position, double geschwindigkeit) {
        super(position, 140);
    }

    @Override
    public double getmaxGeschwindigkeit() {
        return maxGeschwindigkeit;
    }
    @Override
    public int getAnzahlRaeder() {
        return anzahlRaeder;
    }
}
