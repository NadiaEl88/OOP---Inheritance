public abstract class Rennwagen extends Fahrzeug {

    private int anzahlRaeder = 4;
    private double maxGeschwindigkeit = 220;

    public Rennwagen(double position, double geschwindigkeit) {
        super(0, 220);
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





