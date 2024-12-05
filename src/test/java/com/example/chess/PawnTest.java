package com.example.chess;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PawnTest {

    @Test
    public void testPawnWithValidPosition() {
        Pawn pawn = new Pawn("G2");
        List<String> moves = pawn.possibleMoves();
        assertEquals(1, moves.size());
        assertTrue(moves.contains("G3"));
    }

    @Test
    public void testPawnWithCornerPosition() {
        Pawn pawn = new Pawn("H8");
        List<String> moves = pawn.possibleMoves();
        assertTrue(moves.isEmpty());
    }
}
