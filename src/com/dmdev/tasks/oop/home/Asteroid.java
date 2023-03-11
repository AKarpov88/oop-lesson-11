package com.dmdev.tasks.oop.home;

public class Asteroid extends SpaceObject {
    public Asteroid(String name, int mass, int radius, Coordinate coordinate) {
        super(name, mass, radius, coordinate);
    }

    @Override
    public String toString() {
        return "Asteroid: " + this.getName() + ", mass: " + this.getMass() +
                ", radius: " + this.getRadius() + ", coordinate: " + this.getCoordinate().toString();
    }
}
