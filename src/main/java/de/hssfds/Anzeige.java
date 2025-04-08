package de.hssfds;

public class Anzeige {

    public Anzeige() {

    }
    public void flaeche(Kreis k) {
        double area = Math.PI * k.getRadius() * k.getRadius();
        System.out.println("Fläche des Kreises: " + area);
    }
    public void flaeche(Rechteck r) {
        double width = calculateDistance(r.getP1(), r.getP2());
        double height = calculateDistance(r.getP2(), r.getP3());
        double area = width * height;
        System.out.println("Fläche des Rechtecks: " + area);
    }
    public void laenge(Linie l) {
        double length = calculateDistance(l.getP1(), l.getP2());
        System.out.println("Länge der Linie: " + length);
    }
    private double calculateDistance(Punkt p1, Punkt p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
