package com.example.chess;

public class ChessPieceFactory {

    public static ChessPiece getChessPiece(String pieceType, String position) {
        validateInputs(pieceType, position);
        position = position.toUpperCase(); //we're subtracting from ASCII value of 'A' when converting to Int value

        switch (pieceType.toLowerCase()) {
            case "pawn":
                return new Pawn(position);
            case "king":
                return new King(position);
            case "queen":
                return new Queen(position);

            default:
                throw new IllegalArgumentException("Invalid piece type: " + pieceType);
        }
    }

    private static void validateInputs(String pieceType, String position) {

        if (pieceType == null || pieceType.trim().isEmpty()) {
            throw new IllegalArgumentException("Piece type cannot be null or empty");
        }

        if (position == null || position.trim().isEmpty()) {
            throw new IllegalArgumentException("Position cannot be null or empty");
        }

        if (!position.toUpperCase().matches("^[A-H][1-8]$")) {
            throw new IllegalArgumentException("Invalid position: " + position);
        }
    }
}
