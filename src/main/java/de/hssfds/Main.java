package de.hssfds;

public class Main {

    public static void main(String[] args) {

        Anzeige display = new Anzeige();

        Linie line = new Linie();

        Punkt p1 = new Punkt();
        p1.setX(0);
        p1.setY(0);

        Punkt p2 = new Punkt();
        p2.setX(3);
        p2.setY(4);
        line.setP1(p1);
        line.setP2(p2);
        line.setAnz(display);
        line.rufeAnzeige();

        Kreis circle = new Kreis();
        circle.setP1(p1);
        circle.setRadius(5.0);
        circle.setAnz(display);
        circle.rufeAnzeige();

        Rechteck rect = new Rechteck();
        rect.setP1(p1);
        rect.setP2(new Punkt());
        rect.getP2().setX(5);
        rect.setP3(new Punkt());
        rect.getP3().setX(5);
        rect.getP3().setY(4);
        rect.setP4(new Punkt());
        rect.getP4().setY(4);
        rect.setAnz(display);
        rect.rufeAnzeige();

    }
}