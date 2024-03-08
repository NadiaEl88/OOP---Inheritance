public abstract class Fahrzeug {
    private double position;
    private double geschwindigkeit;
    private double maxGeschwindigkeit;
    private int Räder;


    public Fahrzeug(double position, double geschwindigkeit) {
        this.position = position;
        this.geschwindigkeit = geschwindigkeit;
        this.Räder = 4;
    }
public void bewege(double minuten) {
    this.position += (geschwindigkeit / 60) * minuten;  //Mit Hilfe von ChatGPT gelöst, da ich nicht auf die gewünschte Formel gekommen bin. Daher bin ich nicht sicher, ob das richtig ist.
}

    //Die Methode Math. min() erwartet zwei Zahlen als Parameter und gibt die kleinere der beiden Zahlen zurück.
    public void setzeGeschwindigkeit(double neueGeschwindigkeit) {
        geschwindigkeit = Math.min(neueGeschwindigkeit, maxGeschwindigkeit);
    }


    public double getmaxGeschwindigkeit() {
        return maxGeschwindigkeit;
    }

    public int getRäder() {
        return Räder;
    }

    public abstract int getAnzahlRaeder();
}
