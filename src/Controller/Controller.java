package Controller;


import Model.Dot;
import Model.Game;
import Model.Line;
import Model.Player;
import View.View;

import java.util.*;

public class Controller {
    private Game game;
    private View view;
    private Scanner scanner;

    public Controller(Scanner scanner) {
        this.scanner = scanner;
    }


    public void run() {
        String command;
        while (Line.getAvailableLines().size() != 0) {
            command = scanner.nextLine();
            if (command.equalsIgnoreCase("start dot and boxes game")) {
                for (int i = 1; i < 9; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(". ");
                        Dot dot = new Dot(i, j);
                        Dot.addDot(dot);
                    }
                    System.out.println("\t");
                }
                //add side dots

                //  Player p1 = new Player(p1.getUser() ,p1.getWins());
                //get players from plato

            } else if (command.equalsIgnoreCase("end of my turn")) {




            // method draw line needed with 2 ERROR Message
            } else if (command.startsWith("draw line between (x,y) and (x,y)")) {

            //method Boolean for if draw line method is done.
            } else if (command.equalsIgnoreCase("end of my turn")) {

            } else if (command.equalsIgnoreCase("show available lines")) {

            } else if (command.equalsIgnoreCase("show table")) {

            } else if (command.equalsIgnoreCase("who is next?")) {

            } else if (command.equalsIgnoreCase("show result")) {

            } else if (command.equalsIgnoreCase("show score")) {

            }
        }
    }
}
