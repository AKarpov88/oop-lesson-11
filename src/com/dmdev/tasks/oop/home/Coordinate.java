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
