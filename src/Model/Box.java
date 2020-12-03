package Model;
import java.util.*;

@SuppressWarnings("ALL")
public class Box {
    private Dot dot1 ;
    private Dot dot2 ;
    private Dot dot3 ;
    private Dot dot4 ;
    private static ArrayList<Box> boxes = new ArrayList<>();

    public Box(Dot dot1, Dot dot2, Dot dot3, Dot dot4) {
        this.dot1 = dot1;
        this.dot2 = dot2;
        this.dot3 = dot3;
        this.dot4 = dot4;
    }
    public static void addBox(Box box){
        boxes.add(box);
    }
    public static int howManyBoxesMade(Line line){      //not complete
        int counter = 0;

        return counter;
    }
}
