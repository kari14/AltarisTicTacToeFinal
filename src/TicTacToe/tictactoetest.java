package TicTacToe;

import static org.junit.Assert.*;

import org.junit.Test;

public class tictactoetest {
	
	@Test
	public void testName() throws Exception
	{
		tictactoe ttt = new tictactoe();
		assertEquals(" ", ttt.toString());
		assertEquals('X', ttt.turn);
	}
}
