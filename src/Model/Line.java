package Model;
import java.util.*;

public class Line {
    private Dot startDot;
    private Dot finishDot;
    private int xStart;
    private int yStart;
    private int xFinish;
    private int yFinish;
    private static ArrayList<Line> lines = new ArrayList<>();
    private static ArrayList<Line> availableLines = new ArrayList<>();

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

    public static void addLine(Line line) {
        lines.add(line);
    }

    public static void removeAvailabe(Line line) {
        if (availableLines.contains(line)) {
            availableLines.remove(line);
        }
    }

    public static boolean isLineAvailable(Line line) {
        if (availableLines.contains(line)) {
            return true;
        } else {
            return false;
        }
    }

    public static void drawLine(int xStart, int yStart, int xFinish, int yFinish) {
        Dot dot1 = Dot.getDotByPosition(xStart, yStart);
        Dot dot2 = Dot.getDotByPosition(xFinish, yFinish);
        Line line = new Line(dot1, dot2);
        lines.add(line);
        removeAvailabe(line);
    }

    public static Line getLineByDots(Dot dot1, Dot dot2) {
        for (Line line : lines) {
            if (line.getxStart() == dot1.getXPosition() && line.getyStart() == dot1.getYPosition()) {
                if (line.getxFinish() == dot2.getXPosition() && line.getyFinish() == dot2.getYPosition()) {
                    return line;
                }
            } else if (line.getxStart() == dot2.getXPosition() && line.getyStart() == dot2.getYPosition()) {
                if (line.getxStart() == dot1.getXPosition() && line.getyStart() == dot1.getYPosition()) {
                    return line;
                }
            }
        }
        return null;
    }

}
