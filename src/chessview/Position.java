package chessview;
/**
 * the class is used to locate the pieces on the chess board
 * @author hung
 */
public final class Position {
	private int row; // must be between 1 and 8
	private int col; // must be between 1 and 8
	
	public Position(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	public int row() { 
		return row; 
	}
	
	public int column() { 
		return col; 
	}
	
	public boolean equals(Object o) {
		if(o instanceof Position) {
			Position p = (Position) o;
			return row == p.row && col == p.col;
		}
		return false;
	}
	
	public int hashCode() {
		return row ^ col;
	}
	
	public String toString() {		
		return ((char)('a'+(col-1))) + Integer.toString(row);		
	}
	
	public static boolean isValid (Position p) {
		return (1 <= p.row() && p.row() <= 8) && (1 <= p.column() && p.column() <= 8);
	}
}
