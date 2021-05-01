package com.chess.board;

import com.chess.common.File;
import com.chess.common.Location;
import com.chess.squares.Square;
import com.chess.squares.SquareColor;

public class Board {
    private static final Integer BOARD_LENGTH = 8;
    Square[][]boardSquares = new Square[BOARD_LENGTH][BOARD_LENGTH]; // 8x8 instance of square?

    public Board(){
        for(int i=0;i<boardSquares.length;i++){
            int column = 0;
            SquareColor currentColor = (i%2==0) ? SquareColor.LIGHT : SquareColor.DARK;
            for (File file: File.values()){
                Square newSquare = new Square(currentColor,new Location(file,BOARD_LENGTH-i));
                boardSquares[i][column] = newSquare;
                currentColor = (currentColor == SquareColor.DARK) ? SquareColor.LIGHT : SquareColor.DARK;
                column++;
            }
        }
    }
    public void printBoard(){
        for(Square[] row : boardSquares){
            for (Square square : row) {
                System.out.print(square.getLocation().getFile());
                System.out.print(square.getLocation().getRank());
                //System.out.println(square);
            }
            System.out.println();
        }
    }

}
