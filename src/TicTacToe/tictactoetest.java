package TicTacToe;

import static org.junit.Assert.*;

import org.junit.Test;

public class tictactoetest {
	
	@Test
	public void testEmptyGrid() throws Exception
	{
		tictactoe ttt = new tictactoe();
		//			  012345678
		assertEquals("         ", ttt.toString());
		assertEquals('X', ttt.turn);
	}
	
	
}
