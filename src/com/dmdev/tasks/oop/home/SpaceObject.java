package com.dmdev.tasks.oop.home;

public abstract class SpaceObject {
    private String name;
    private int mass;
    private int radius;
    private Coordinate coordinate;

    public SpaceObject(String name, int mass, int radius, Coordinate coordinate) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.coordinate = coordinate;
    }

    public SpaceObject getMax(SpaceObject spaceObject) {
        return this.getMass() > spaceObject.getMass() ? this : spaceObject;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getDistance(SpaceObject spaceObject) {
        return Math.sqrt(Math.pow((this.coordinate.getX() - spaceObject.coordinate.getX()), 2) +
                Math.pow((this.coordinate.getY() - spaceObject.coordinate.getY()), 2) +
                Math.pow((this.coordinate.getZ() - spaceObject.coordinate.getZ()), 2));
    }

    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    public int getRadius() {
        return radius;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
}
