package de.hssfds;

public class Kreis {

    private Punkt p1;
    private double radius;
    private Anzeige anz;

    public Kreis() {
        this.p1 = new Punkt();
        this.radius = 0.0;
    }
    public Punkt getP1() {
        return p1;
    }
    public void setP1(Punkt p1) {
        this.p1 = p1;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
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