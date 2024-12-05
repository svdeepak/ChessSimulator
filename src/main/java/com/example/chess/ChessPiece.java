package com.example.chess;

import java.util.List;

public abstract class ChessPiece {
    protected int row;
    protected int col;

    public ChessPiece(String position) {
        this.row = position.charAt(1) - '1' + 1; //Row 1-8
        this.col = position.charAt(0) - 'A' + 1; //Col 1-8 mapped to alphabets: A-H
    }

    protected boolean isValidPosition(int row, int col) {
        return row >=1 && row <=8 && col >=1 && col <=8;
    }

    protected String toPosition(int row, int col) {
        return "" + (char) ('A' + col -1) + row;
    }

    public abstract List<String> possibleMoves();
}
