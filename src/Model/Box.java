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
            if (Line.isConnected(line.getStartDot(), Dot.getDotByPosition(line.getxStart(), line.getyStart() - 1)) && line.getyStart() > 1) {
                if (Line.isConnected(line.getFinishDot(), Dot.getDotByPosition(line.getxFinish(), line.getyFinish() - 1)) && line.getyFinish() > 1) {
                    if (Line.isConnected(Dot.getDotByPosition(line.getxStart(), line.getyStart()-1), Dot.getDotByPosition(line.getxFinish(), line.getyFinish()-1))) {
                        counter++;
                    }
                }
            }
        } else {

        }
        return counter;
    }


}
