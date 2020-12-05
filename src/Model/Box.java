package Model;

import java.util.*;

@SuppressWarnings("ALL")
public class Box {
    private Dot dot1;
    private Dot dot2;
    private Dot dot3;
    private Dot dot4;
    private static ArrayList<Box> boxes = new ArrayList<>();

    public Box(Dot dot1, Dot dot2, Dot dot3, Dot dot4) {
        this.dot1 = dot1;
        this.dot2 = dot2;
        this.dot3 = dot3;
        this.dot4 = dot4;
    }

    public static void addBox(Box box) {
        boxes.add(box);
    }

    public static int howManyBoxesMade(Line line) {
        int counter = 0;
        if (line.getDirection().equalsIgnoreCase("Horizontal")) {
            if (line.getyStart() > 1) {
                Dot upStartDot = Dot.getDotByPosition(line.getxStart(), line.getyStart() - 1);
                Dot upFinishDot = Dot.getDotByPosition(line.getxFinish(), line.getyFinish() - 1);
                if (Line.isConnected(line.getStartDot(), upStartDot)) {
                    if (Line.isConnected(line.getFinishDot(), upFinishDot)) {
                        if (Line.isConnected(upStartDot, upFinishDot)) {
                            counter++;
                        }
                    }
                }
            }
            if (line.getyStart() < 8) {
                Dot downStartDot = Dot.getDotByPosition(line.getxStart(), line.getyStart() + 1);
                Dot downFinishDot = Dot.getDotByPosition(line.getxFinish(), line.getyFinish() + 1);
                if (Line.isConnected(line.getStartDot(), downStartDot)) {
                    if (Line.isConnected(line.getFinishDot(), downFinishDot)) {
                        if (Line.isConnected(downStartDot, downFinishDot)) {
                            counter++;
                        }
                    }
                }
            }
        } else {

        }
        return counter;
    }


}
