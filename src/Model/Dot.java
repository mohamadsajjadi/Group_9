package Model;

import java.util.*;

public class Dot {
    private int XPosition;
    private int YPosition;
    private ArrayList<Dot> sideDots;
    private int sideDotsNum;
    private static HashMap<Integer, Dot> dots = new HashMap<>();
    private static ArrayList<Dot> availableDots = new ArrayList<>();

    {
        sideDots = new ArrayList<>();
    }

    public int getXPosition() {
        return this.XPosition;
    }

    public int getYPosition() {
        return this.YPosition;
    }

    public ArrayList<Dot> getSideDots() {
        return this.sideDots;
    }

    public int getSideDotsNum() {
        return this.sideDotsNum;
    }

    public static HashMap<Integer, Dot> getDots() {
        return dots;
    }

    public static ArrayList<Dot> getAvailableDots() {
        return availableDots;
    }

    public void setXPosition(int xPosition) {
        this.XPosition = xPosition;
    }

    public void setYPosition(int yPosition) {
        this.YPosition = yPosition;
    }

    public void addSideDot(Dot sideDot) {
        this.sideDots.add(sideDot);
    }

    public void setSideDotsNum(int sideDotsNum) {
        this.sideDotsNum = sideDotsNum;
    }

    public static void addDot(Dot dot) {
        int x = dot.getXPosition();
        int y = dot.getYPosition();
        dots.put(x * 10 + y, dot);
    }

    public static void addAvailableDot(Dot availableDot) {
        availableDots.add(availableDot);
    }

    public boolean isSideDotAvailable(Dot sideDot) {
        if (this.sideDots.contains(sideDot)) {
            return true;
        } else {
            return false;
        }
    }

    public static void removeAvailableDot(Dot dot) {
        if (availableDots.contains(dot)) {
            availableDots.remove(dot);
        } else {
        }
    }

    public static boolean isAvailableDot(Dot dot) {
        if (availableDots.contains(dot)) {
            return true;
        } else {
            return false;
        }
    }
}