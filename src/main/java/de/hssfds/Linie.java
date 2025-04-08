package de.hssfds;

public class Linie {

    private Punkt p1;
    private Punkt p2;
    private Anzeige anz;

    public Linie() {
        this.p1 = new Punkt();
        this.p2 = new Punkt();
    }
    public Punkt getP1() {
        return p1;
    }
    public void setP1(Punkt p1) {
        this.p1 = p1;
    }
    public Punkt getP2() {
        return p2;
    }
    public void setP2(Punkt p2) {
        this.p2 = p2;
    }
    public Anzeige getAnz() {
        return anz;
    }
    public void setAnz(Anzeige anz) {
        this.anz = anz;
    }
    public void rufeAnzeige() {
        if (anz != null) {
            anz.laenge(this);
        }
    }

}