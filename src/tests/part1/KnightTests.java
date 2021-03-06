package tests.part1;

import org.junit.Test;
import junit.framework.TestCase;
import static tests.TestHelpers.*;

/**
 * The Class KnightTests.
 */
public class KnightTests extends TestCase {
	
	/**
	 * Test knight moves.
	 */
	public @Test void testKnightMoves() {
		String[][] tests = { 
				// Test 1
				{"Nb1-c3",
				 "8|r|n|b|q|k|b|n|r|\n"+
				 "7|p|p|p|p|p|p|p|p|\n"+
				 "6|_|_|_|_|_|_|_|_|\n"+
				 "5|_|_|_|_|_|_|_|_|\n"+
				 "4|_|_|_|_|_|_|_|_|\n"+
				 "3|_|_|N|_|_|_|_|_|\n"+
				 "2|P|P|P|P|P|P|P|P|\n"+
				 "1|R|_|B|Q|K|B|N|R|\n"+
				 "  a b c d e f g h"
				},
				// Test 2
				{"Nb1-c3 Ng8-f6",
				 "8|r|n|b|q|k|b|_|r|\n"+
				 "7|p|p|p|p|p|p|p|p|\n"+
				 "6|_|_|_|_|_|n|_|_|\n"+
				 "5|_|_|_|_|_|_|_|_|\n"+
				 "4|_|_|_|_|_|_|_|_|\n"+
				 "3|_|_|N|_|_|_|_|_|\n"+
				 "2|P|P|P|P|P|P|P|P|\n"+
				 "1|R|_|B|Q|K|B|N|R|\n"+
				 "  a b c d e f g h"
				},
				// Test 3
				{"Ng1-f3 Ng8-f6\nNf3-d4",
				 "8|r|n|b|q|k|b|_|r|\n"+
				 "7|p|p|p|p|p|p|p|p|\n"+
				 "6|_|_|_|_|_|n|_|_|\n"+
				 "5|_|_|_|_|_|_|_|_|\n"+
				 "4|_|_|_|N|_|_|_|_|\n"+
				 "3|_|_|_|_|_|_|_|_|\n"+
				 "2|P|P|P|P|P|P|P|P|\n"+
				 "1|R|N|B|Q|K|B|_|R|\n"+
				 "  a b c d e f g h"
				},
				// Test 4
				{"Ng1-f3 Ng8-f6\nc2-c3 Nf6-e4",
				 "8|r|n|b|q|k|b|_|r|\n"+
				 "7|p|p|p|p|p|p|p|p|\n"+
				 "6|_|_|_|_|_|_|_|_|\n"+
				 "5|_|_|_|_|_|_|_|_|\n"+
				 "4|_|_|_|_|n|_|_|_|\n"+
				 "3|_|_|P|_|_|N|_|_|\n"+
				 "2|P|P|_|P|P|P|P|P|\n"+
				 "1|R|N|B|Q|K|B|_|R|\n"+
				 "  a b c d e f g h"
				},
				//additional test case
				{"Ng1-f3 Ng8-f6\nd2-d3 Nf6-e4\nNf3-g5 Ne4-d2",
				 "8|r|n|b|q|k|b|_|r|\n"+
				 "7|p|p|p|p|p|p|p|p|\n"+
				 "6|_|_|_|_|_|_|_|_|\n"+
				 "5|_|_|_|_|_|_|N|_|\n"+
				 "4|_|_|_|_|_|_|_|_|\n"+
				 "3|_|_|_|P|_|_|_|_|\n"+
				 "2|P|P|P|n|P|P|P|P|\n"+
				 "1|R|N|B|Q|K|B|_|R|\n"+
				 "  a b c d e f g h"
				},
				{"Ng1-f3 Ng8-f6\nNf3-h4 Nf6-e4",
				 "8|r|n|b|q|k|b|_|r|\n"+
				 "7|p|p|p|p|p|p|p|p|\n"+
				 "6|_|_|_|_|_|_|_|_|\n"+
				 "5|_|_|_|_|_|_|_|_|\n"+
				 "4|_|_|_|_|n|_|_|N|\n"+
				 "3|_|_|_|_|_|_|_|_|\n"+
				 "2|P|P|P|P|P|P|P|P|\n"+
				 "1|R|N|B|Q|K|B|_|R|\n"+
				 "  a b c d e f g h"
				},
		};
		checkValidTests(tests);
	}
	
	/**
	 * Test knight takes.
	 */
	public @Test void testKnightTakes() {
		String[][] tests = {
				// Test 1
				{"Nb1-c3 d7-d5\nNc3xd5",
				 "8|r|n|b|q|k|b|n|r|\n"+
				 "7|p|p|p|_|p|p|p|p|\n"+
				 "6|_|_|_|_|_|_|_|_|\n"+
				 "5|_|_|_|N|_|_|_|_|\n"+
				 "4|_|_|_|_|_|_|_|_|\n"+
				 "3|_|_|_|_|_|_|_|_|\n"+
				 "2|P|P|P|P|P|P|P|P|\n"+
				 "1|R|_|B|Q|K|B|N|R|\n"+
				 "  a b c d e f g h"
				},
				// Test 2
				{"d2-d4 Nb8-c6\nNg1-f3 Nc6xd4",
				 "8|r|_|b|q|k|b|n|r|\n"+
				 "7|p|p|p|p|p|p|p|p|\n"+
				 "6|_|_|_|_|_|_|_|_|\n"+
				 "5|_|_|_|_|_|_|_|_|\n"+
				 "4|_|_|_|n|_|_|_|_|\n"+
				 "3|_|_|_|_|_|N|_|_|\n"+
				 "2|P|P|P|_|P|P|P|P|\n"+
				 "1|R|N|B|Q|K|B|_|R|\n"+
				 "  a b c d e f g h"
				},
				// Test 3
				{"d2-d4 Nb8-c6\nNg1-f3 Nc6-e5\nNf3xNe5",
				 "8|r|_|b|q|k|b|n|r|\n"+
				 "7|p|p|p|p|p|p|p|p|\n"+
				 "6|_|_|_|_|_|_|_|_|\n"+
				 "5|_|_|_|_|N|_|_|_|\n"+
				 "4|_|_|_|P|_|_|_|_|\n"+
				 "3|_|_|_|_|_|_|_|_|\n"+
				 "2|P|P|P|_|P|P|P|P|\n"+
				 "1|R|N|B|Q|K|B|_|R|\n"+
				 "  a b c d e f g h"
				},
				// Test 4
				{"Nb1-c3 a7-a6\nNc3-d5 a6-a5\nNd5xe7",
				 "8|r|n|b|q|k|b|n|r|\n"+
				 "7|_|p|p|p|N|p|p|p|\n"+
				 "6|_|_|_|_|_|_|_|_|\n"+
				 "5|p|_|_|_|_|_|_|_|\n"+
				 "4|_|_|_|_|_|_|_|_|\n"+
				 "3|_|_|_|_|_|_|_|_|\n"+
				 "2|P|P|P|P|P|P|P|P|\n"+
				 "1|R|_|B|Q|K|B|N|R|\n"+
				 "  a b c d e f g h"
				}
		};
		
		checkValidTests(tests);
	}
}
