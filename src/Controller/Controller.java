package Controller;


import Model.Game;
import Model.Line;
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

            } else if (command.equalsIgnoreCase("end of my turn")) {

            } else if (command.equalsIgnoreCase("draw line between (x,y) and (x,y)")) {

            } else if (command.equalsIgnoreCase("end of my turn")) {

            } else if (command.equalsIgnoreCase("show available lines")) {

            } else if (command.equalsIgnoreCase("show table")){

            }else if(command.equalsIgnoreCase("who is next?")){

            }else if (command.equalsIgnoreCase("show result")){

            }else if (command.equalsIgnoreCase("show score")) {

            }
        }
    }
}
