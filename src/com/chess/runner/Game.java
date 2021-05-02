package com.chess.runner;

import com.chess.board.Board;
import com.chess.piece.*;

import java.sql.SQLOutput;

public class Game {
    public static void  main(String[] args){
        //Board board = new Board();
        //board.printBoard();
        PieceColor color = PieceColor.DARK;
        //Movable pawn = new Pawn(color);
        Movable queen = new Queen(color);
        //Game.printPiece(pawn);
        Game.printPiece(queen);
    }
    public static void printPiece(Movable piece){
        //System.out.println(piece.toString());
        piece.getValidMoves(null);
    }
}
