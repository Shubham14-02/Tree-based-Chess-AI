package com.chess.player;

import com.chess.Board;
import com.chess.Color;
import com.chess.Movement;

import java.io.InputStream;
import java.util.Scanner;

public class Human extends PlayMode {

    public static final String ID = "HUMAN";

    private Scanner scanner;

    public Human(String name, Scanner scanner) {
        super(name, ID);
        this.scanner = scanner;
    }

    @Override
    public Movement getNextMove(Board board, int turn) {
        // read the movement requested from inputstream and return it
        return new Movement(board, scanner.next());
    }
}
