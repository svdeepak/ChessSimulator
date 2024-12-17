package com.example.chess;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class RookTest extends TestCase {

    @Test
    public void testRookWithCornerPosition() {
        ChessPiece piece = new Rook("A8");
        List<String> moves = piece.possibleMoves();
        assertTrue(moves.contains("A7")); // Linear move upward
        assertTrue(moves.contains("B8")); // Vertical move downward
        assertFalse(moves.contains("H4")); // false case
        assertEquals(14, moves.size());
    }

    @Test
    public void testRookWithOtherCornerPosition() {
        ChessPiece piece = new Rook("H1");
        List<String> moves = piece.possibleMoves();
        assertTrue(moves.contains("D1")); // Linear move upward
        assertTrue(moves.contains("H6")); // Vertical move downward
        assertFalse(moves.contains("E3")); // false case
        assertEquals(14, moves.size());
    }

    @Test
    public void testRookWithValidPosition() {
        ChessPiece piece = new Rook("D5");
        List<String> moves = piece.possibleMoves();
        assertTrue(moves.contains("D7")); // Linear move upward
        assertTrue(moves.contains("B5")); // Vertical move downward
        assertFalse(moves.contains("G4")); // false case
        assertEquals(14, moves.size());
    }
}