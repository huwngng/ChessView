package chessview.pieces;

import chessview.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Queen.
 * implement queen piece
 */
public class Queen extends Piece {
    
    /**
     * Instantiates a new queen.
     *
     * @param isWhite the is white
     */
    public Queen (boolean isWhite) {
        super(isWhite);
    }
    
    /**
     * Checks if is valid move.
     *
     * @param oldPosition the old position
     * @param newPosition the new position
     * @param isTaken the is taken
     * @param board the board
     * @return true, if is valid move
     */
    public boolean isValidMove (Position oldPosition, Position newPosition, Piece isTaken, Board board) {
        
        if (!Position.isValid(oldPosition) || !Position.isValid(newPosition))
            return false;
        
        Piece p = board.pieceAt(oldPosition);
        Piece t = board.pieceAt(newPosition);
        
        if (!this.equals(p)
                || (t == null && isTaken != null)            
                || (t != null && isTaken == null)              
                || (t != null && !t.equals(isTaken))            
                || (t != null && t.isWhite() == this.isWhite()))
            return false;
        
        return board.clearColumnExcept(oldPosition, newPosition, p, t)
                || board.clearRowExcept(oldPosition, newPosition, p, t)
                || board.clearDiaganolExcept(oldPosition, newPosition, p, t);
    }
    
    /**
     * To string.
     *
     * @return the string
     */
    public String toString () {
        if (this.isWhite()) {
            return "Q";
        } else {
            return "q";
        }
    }
}
