package de.hssfds;

public class Rechteck {

    private Punkt p1;
    private Punkt p2;
    private Punkt p3;
    private Punkt p4;
    private Anzeige anz;

    public Rechteck() {
        this.p1 = new Punkt();
        this.p2 = new Punkt();
        this.p3 = new Punkt();
        this.p4 = new Punkt();
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
    public Punkt getP3() {
        return p3;
    }
    public void setP3(Punkt p3) {
        this.p3 = p3;
    }
    public Punkt getP4() {
        return p4;
    }
    public void setP4(Punkt p4) {
        this.p4 = p4;
    }
    public Anzeige getAnz() {
        return anz;
    }
    public void setAnz(Anzeige anz) {
        this.anz = anz;
    }
    public void rufeAnzeige() {
        if (anz != null) {
            anz.flaeche(this);
        }
    }

}