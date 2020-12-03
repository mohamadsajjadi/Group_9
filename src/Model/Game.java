package Model;

import java.util.*;
public class Game {
    private Player p1;
    private Player p2;
    private int turn;



    public void setP1(Player p1) {
        this.p1 = p1;
    }

    public void setP2(Player p2) {
        this.p2 = p2;
    }

    public void changeTurn() {

    }

    public Player whoIsTurn() {


    }

    public void checkTable(Line line) {
        int count = Box.howManyBoxesMade(line);
        if (count == 0) {
            changeTurn();
        } else if (count == 1) {
            whoIsTurn();

        } else if(count == 2){
            whoIsTurn();

        }

    }
}
