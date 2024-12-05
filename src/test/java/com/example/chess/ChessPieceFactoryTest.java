package com.example.chess;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessPieceFactoryTest {

    @Test
    public void testFactoryWithValidInput() {
        ChessPiece chessPiece = ChessPieceFactory.getChessPiece("Queen", "D4");
        assertNotNull(chessPiece);
        assertTrue(chessPiece instanceof Queen);

    }

    @Test
    public void testFactoryWithInvalidPieceName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                ChessPieceFactory.getChessPiece("Knight", "E4")
        );
        assertEquals("Invalid piece type: Knight", exception.getMessage());
    }

    @Test
    public void testFactoryWithInvalidPosition() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                ChessPieceFactory.getChessPiece("Pawn", "Z9")
        );
        assertEquals("Invalid position: Z9", exception.getMessage());
    }

    @Test
    public void testFactoryWithInvalidNullInputs() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                ChessPieceFactory.getChessPiece(null, null)
        );
        assertEquals("Piece type cannot be null or empty", exception.getMessage());

    }

    @Test
    public void testFactoryWithEmptyInputs() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                ChessPieceFactory.getChessPiece("", "")
        );
        assertEquals("Piece type cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testFactoryWithInvalidCharactersInPosition() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                ChessPieceFactory.getChessPiece("Pawn", "D#4")
        );
        assertEquals("Invalid position: D#4", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () ->
                ChessPieceFactory.getChessPiece("Pawn", "3A")
        );
        assertEquals("Invalid position: 3A", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () ->
                ChessPieceFactory.getChessPiece("King", "B0")
        );
        assertEquals("Invalid position: B0", exception.getMessage());
    }

    @Test
    public void testFactoryWithCaseInsensitiveInput() {
        ChessPiece piece = ChessPieceFactory.getChessPiece("queen", "d4");
        assertNotNull(piece);
        assertTrue(piece instanceof Queen);
    }
}
