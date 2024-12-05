package com.example.chess;

import java.util.List;

public class ChessSimulator {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: <piece> <position>");
            return;
        }

        String piece = args[0];
        String position = args[1];

        /*
        String input = "Pan, G1"; //Sample input
        String[] parts = input.split(", ");
        String piece = parts[0];
        String position = parts[1];
         */

        System.out.println("Chess Piece: " + piece);
        System.out.println("Position: " + position);
        ChessPiece chessPiece = ChessPieceFactory.getChessPiece(piece, position);
        List<String> possibleMoves = chessPiece.possibleMoves();
        System.out.println(String.join(", ", possibleMoves));
    }
}
