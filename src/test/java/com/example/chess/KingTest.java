package com.example.chess;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KingTest {

    @Test
    public void testKingWithValidPosition() {
        King king = new King("E5");
        List<String> moves = king.possibleMoves();
        assertEquals(8, moves.size());
        assertTrue(moves.contains("E4"));
        assertTrue(moves.contains("F5"));
        assertTrue(moves.contains("D6"));
    }

    @Test
    public void testKingWithCornerPosition() {
        King king = new King("A1");
        List<String> moves = king.possibleMoves();
        assertEquals(3, moves.size());
        assertTrue(moves.contains("B1"));
        assertTrue(moves.contains("B2"));
        assertTrue(moves.contains("A2"));
    }
}
