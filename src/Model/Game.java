package Model;

import java.util.*;

public class Game {
    private Player p1;
    private Player p2;
    private int turn;


    Random generator = new Random();

    {
        turn = generator.nextInt(2);
    }


    public void setP1(Player p1) {
        this.p1 = p1;
    }

    public void setP2(Player p2) {
        this.p2 = p2;
    }

    public void setTurn() {
        int win1 = p1.getWins();
        int win2 = p2.getWins();

        if (win1 > win2) {
            turn = 0;
        } else if (win1 < win2) {
            turn = 1;
        } else
            turn = generator.nextInt(2);
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

        } else if (count == 2) {
            whoIsTurn();

        }

    }
}
