package chessview.pieces;

import chessview.*;

public class King extends PieceImpl implements Piece {
	boolean isFirstMove;
	public King(boolean isWhite) {
		super(isWhite);
		this.isFirstMove = true;
	}	
	
	public boolean isValidMove(Position oldPosition, Position newPosition,
			Piece isTaken, Board board) {
		int oldRow = oldPosition.row();
		int oldCol = oldPosition.column();
		int newRow = newPosition.row();
		int newCol = newPosition.column();
		
		if (!Position.isValid(oldPosition)
				|| !Position.isValid(newPosition))
			return false;
		
		Piece p = board.pieceAt(oldPosition);
		Piece t = board.pieceAt(newPosition);
				
		if (!this.equals(p) || (isTaken != null && !isTaken.equals(t)))
			return false;

		boolean isValid = false;
		int diffCol = Math.abs(oldCol - newCol);
		int diffRow = Math.abs(oldRow - newRow);
		if ((diffCol == 1 || diffRow == 1) && diffCol <= 1 && diffRow <= 1) {		// regular case
			isValid = true;
		} else {
			// check valid castling move
			if (oldRow == newRow
					&& ((oldRow == 1 && this.isWhite) || (oldRow == 8 && !this.isWhite))) {
				if (newCol == 3 || newCol == 7) {
					Position rookPos = new Position(oldRow, newCol == 3 ? 1 : 8);
					Piece rook = board.pieceAt(rookPos);
					
					if (this.isFirstMove && ((Rook) rook).isFirstMove
							&& board.clearRowExcept(oldPosition, rookPos, p, rook)) {
						int increment = newCol == 3 ? -1 : +1;
						Board tmpBoard = new Board(board);
						for (int i = oldCol; i != newCol + increment; i += increment) {
							Position tryPos = new Position(oldRow, i);
							tmpBoard.move(oldPosition, tryPos);
							if (tmpBoard.isInCheck(this.isWhite)) {
								return false;
							}
							tmpBoard.move(tryPos, oldPosition);
						}
						isValid = true;
					}
				}
			}
		}
		
		return isValid;
	}
	
	public String toString() {
		if(isWhite) {
			return "K";
		} else {
			return "k";
		}
	}
}
