package com.example.chess;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ChessSimulatorTest {

    @Test
    public void testIntegrationWithPawn() {
        ChessPiece pawn = new Pawn("G2");
        List<String> moves = pawn.possibleMoves();
        assertEquals(1, moves.size());
        assertTrue(moves.contains("G3"));
    }

    @Test
    public void testIntegrationWithQueen() {
        ChessPiece queen = new Queen("D4");
        List<String> moves = queen.possibleMoves();
        assertTrue(moves.contains("D8"));
        assertTrue(moves.contains("H4"));
        assertTrue(moves.contains("A1"));
        assertFalse(moves.contains("I5")); // Invalid position
    }

    @Test
    public void testIntegrationWithKing() {
        ChessPiece king = new King("D5");
        List<String> moves = king.possibleMoves();
        List<String> differences = new ArrayList<>(Arrays.asList("C4", "C5", "C6", "D4", "D6", "E4", "E5", "E6"));
        differences.removeAll(moves);
        assertTrue(differences.isEmpty());
    }
}
