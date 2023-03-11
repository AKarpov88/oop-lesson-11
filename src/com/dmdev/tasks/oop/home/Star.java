package com.dmdev.tasks.oop.home;

public class Star extends SpaceObject implements WithLight {

    private int luminosity;

    public Star(String name, int mass, int radius, Coordinate coordinate, int luminosity) {
        super(name, mass, radius, coordinate);
        this.luminosity = luminosity;
    }

    @Override
    public boolean isBright() {
        return luminosity > 500;
    }

    @Override
    public String toString() {
        return "Star: " + this.getName() + ", mass: " + this.getMass() +
                ", radius: " + this.getRadius() + ", coordinate: " + this.getCoordinate().toString() +
                ", luminosity: " + this.getLuminosity();
    }

    public int getLuminosity() {
        return luminosity;
    }
}
