package com.example.chess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pawn extends ChessPiece {
    public Pawn(String position) {
        super(position);
    }

    @Override
    public List<String> possibleMoves() {
        List<String> moves = new ArrayList<>();
        if (isValidPosition(row + 1, col)) {
            moves.add(toPosition(row +1, col));
        }
        return Collections.unmodifiableList(moves);
    }
}
