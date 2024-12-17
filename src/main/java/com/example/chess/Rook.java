package com.example.chess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rook extends ChessPiece {
    public Rook(String position) {
        super(position);
    }

    @Override
    public List<String> possibleMoves() {
        List<String> moves = new ArrayList<>();
        int[] rowOffSets = {0, 0, 1, -1};
        int[] colOffSets = {-1, 1, 0, 0};

        for (int i=0; i < rowOffSets.length; i++) {
            int newRow = row;
            int newCol = col;
            while(true) {
                newRow += rowOffSets[i];
                newCol += colOffSets[i];
                if (isValidPosition(newRow, newCol)) {
                    moves.add(toPosition(newRow, newCol));
                } else {
                    break;
                }
            }
        }
        return Collections.unmodifiableList(moves);
    }
}
