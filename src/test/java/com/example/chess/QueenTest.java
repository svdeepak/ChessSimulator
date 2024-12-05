package com.example.chess;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QueenTest {

    @Test
    public void testQueenWithValidPosition() {
        Queen queen = new Queen("D4");
        List<String> moves = queen.possibleMoves();
        assertTrue(moves.contains("A1")); // Diagonal move
        assertTrue(moves.contains("D8")); // Vertical move
        assertTrue(moves.contains("H4")); // Horizontal move
        assertEquals(27, moves.size()); // Total valid moves
    }

    @Test
    public void testQueenWithCornerPosition() {
        Queen queen = new Queen("H8");
        List<String> moves = queen.possibleMoves();
        assertTrue(moves.contains("A1")); // Diagonal to A1
        assertTrue(moves.contains("H1")); // Horizontal to H1
        assertTrue(moves.contains("A8")); // Horizontal left
        assertEquals(21, moves.size());
    }
}
