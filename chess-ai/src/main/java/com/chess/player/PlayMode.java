package com.chess.player;

import com.chess.Board;
import com.chess.Color;
import com.chess.Movement;

public abstract class PlayMode {

    private String name;
    private String identifier;


    public PlayMode(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    public abstract Movement getNextMove(Board board, int turn);

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }
}
