package com.example.chess;

import java.util.List;

public class ChessSimulator {

    public static void main(String[] args) {
        String input = "Pan, G1";
        String[] parts = input.split(", ");
        String pieceType = parts[0];
        String position = parts[1];

        ChessPiece piece = ChessPieceFactory.getChessPiece(pieceType, position);
        List<String> possibleMoves = piece.possibleMoves();
        System.out.println(String.join(", ", possibleMoves));
    }
}
