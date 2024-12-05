package com.example.chess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class King extends ChessPiece {
    public King(String position) {
        super(position);
    }

    @Override
    public List<String> possibleMoves() {
        int[] rowOffSets = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] colOffSets = {-1, 0, 1, -1, 1, -1, 0, 1};

        List<String> moves = new ArrayList<>();
        for (int i=0; i < rowOffSets.length; i++) {
            int newRow = row + rowOffSets[i];
            int newCol = col + colOffSets[i];
            if (isValidPosition(newRow, newCol)) {
                moves.add(toPosition(newRow, newCol));
            }
        }
        return moves;
        //return Collections.unmodifiableList(moves);
    }
}
