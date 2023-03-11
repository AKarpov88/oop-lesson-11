package com.dmdev.tasks.oop.home;

import static com.dmdev.tasks.oop.home.SpaceUtils.*;

public class SpaceRunner {

    public static void main(String[] args) {

        Star sun = new Star("Sun", 10000000, 25000000, new Coordinate(0, 30, 7),800);
        Planet earth = new Planet("Earth",590, 6371, new Coordinate(1, 100, 500));
        Planet.Satellite moon = earth.new Satellite("Moon", 7, 1738, new Coordinate(2, 150, 700));
        Comet halley = new Comet("Halley", 1, 1, new Coordinate(5,10,15), 100);
        Asteroid vesta = new Asteroid("Vesta", 2, 3, new Coordinate(100, 550, 30));

        System.out.println(moon.toString());
        System.out.println(earth.getMax(sun).getName());
        System.out.println(vesta.getDiameter());
        System.out.println(earth.getDistance(sun));
        System.out.println(isStar(vesta));
        System.out.println(getGravitation(sun, earth));
        System.out.println(sun.isBright());
        System.out.println(halley.isFast());
    }
}
