package com.dmdev.tasks.oop.home;

public class Planet extends SpaceObject {
    private Satellite satellite;

    public Planet(String name, int mass, int radius, Coordinate coordinate) {
        super(name, mass, radius, coordinate);
    }

    @Override
    public String toString() {
        return "Planet: " + this.getName() + ", mass: " + this.getMass() +
                ", radius: " + this.getRadius() + ", coordinate: " + this.getCoordinate().toString();
    }

    class Satellite {
        private String name;
        private int mass;
        private int radius;
        private Coordinate coordinate;


        public Satellite(String name, int mass, int radius, Coordinate coordinate) {
            this.name = name;
            this.mass = mass;
            this.radius = radius;
            this.coordinate = coordinate;
        }

        @Override
        public String toString() {
            return "Satellite: " + name + ", mass: " + mass +
                    ", radius: " + radius + ", parent planet: " + Planet.this.getName() + ", coordinate: " + coordinate.toString();
        }
    }
}
