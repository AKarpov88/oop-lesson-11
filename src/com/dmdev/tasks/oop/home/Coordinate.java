package com.dmdev.tasks.oop.home;

public class Coordinate {
    private final int x;
    private final int y;
    private final int z;

    public Coordinate(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

//    public double getDistance(Coordinate coordinate) {
//        return Math.sqrt(Math.pow((this.x - coordinate.x), 2) + Math.pow((this.y - coordinate.y), 2) + Math.pow((this.z - coordinate.z), 2));
//    }

    @Override
    public String toString() {
        return "x=" + this.x + " ,y=" + this.y + " ,z=" + this.z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
