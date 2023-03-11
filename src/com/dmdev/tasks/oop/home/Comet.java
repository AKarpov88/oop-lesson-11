package com.dmdev.tasks.oop.home;

public class Comet extends SpaceObject implements WithSpeed {

    private int speed;

    public Comet(String name, int mass, int radius, Coordinate coordinate, int speed) {
        super(name, mass, radius, coordinate);
        this.speed = speed;
    }

    @Override
    public boolean isFast() {
        return speed > 120;
    }

    @Override
    public String toString() {
        return "Comet: " + this.getName() + ", mass: " + this.getMass() +
                ", radius: " + this.getRadius() + ", speed: " + this.getSpeed() + ", coordinate: " + this.getCoordinate().toString();
    }

    public int getSpeed() {
        return speed;
    }

}
