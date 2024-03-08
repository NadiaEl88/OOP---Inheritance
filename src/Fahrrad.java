public abstract class Fahrrad extends Fahrzeug {
    private int anzahlRaeder =2;
    private double maxGeschwindigkeit = 30;

    public Fahrrad(double maxGeschwindigkeit) {
        super(0,30);
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }

    public Fahrrad(int anzahlRaeder) {
        super(0,0);
        this.anzahlRaeder = anzahlRaeder;
    }

    public double getMaxGeschwindigkeit() {
        return maxGeschwindigkeit;
    }

    public int getanzahlRaeder() {
        return anzahlRaeder;
    }
}
