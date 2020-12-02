package Model;

import java.util.*;

public class Line {
    private Dot startDot;
    private Dot finishDot;
    private int xStart;
    private int yStart;
    private int xFinish;
    private int yFinish;
    private ArrayList<Line> lines = new ArrayList<>();
    private ArrayList<Line> availableLines = new ArrayList<>();

    public Line(Dot startDot, Dot finishDot) {
        this.startDot = startDot;
        this.finishDot = finishDot;
        this.xStart = startDot.getXPosition();
        this.yStart = startDot.getYPosition();
        this.xFinish = finishDot.getXPosition();
        this.yFinish = finishDot.getYPosition();

    }

    public int getxStart() {
        return xStart;
    }

    public int getyStart() {
        return yStart;
    }

    public int getxFinish() {
        return xFinish;
    }

    public int getyFinish() {
        return yFinish;
    }

}
