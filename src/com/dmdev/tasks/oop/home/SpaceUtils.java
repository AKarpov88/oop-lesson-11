package com.dmdev.tasks.oop.home;

public final class SpaceUtils {

    private SpaceUtils() {
    }

    public static double getGravitation(SpaceObject spaceObject1, SpaceObject spaceObject2) {
        double distance = spaceObject1.getDistance(spaceObject2);
        return spaceObject1.getMass() * spaceObject2.getMass() / Math.pow(distance, 2);
    }

    public static boolean isStar(SpaceObject spaceObject) {
        return spaceObject instanceof Star;
    }
}
