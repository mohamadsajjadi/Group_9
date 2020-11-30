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
        return XPosition;
    }

    public int getYPosition() {
        return YPosition;
    }

    public ArrayList<Dot> getSideDots() {
        return sideDots;
    }

    public int getSideDotsNum() {
        return sideDotsNum;
    }

    public HashMap<Integer, Dot> getDots() {
        return dots;
    }

    public ArrayList<Dot> getAvailableDots() {
        return availableDots;
    }

    public void setXPosition(int xPosition) {
        this.XPosition = xPosition;
    }

    public void setYPosition(int yPosition) {
        this.YPosition = yPosition;
    }

    public void setSideDots(ArrayList<Dot> sideDots) {
        this.sideDots = sideDots;
    }

    public void setSideDotsNum(int sideDotsNum) {
        this.sideDotsNum = sideDotsNum;
    }

    public static void setDots(HashMap<Integer, Dot> dot) {
        dots = dot;
    }

    public static void setAvailableDots(ArrayList<Dot> availableDot) {
        availableDots = availableDot;
    }


}


