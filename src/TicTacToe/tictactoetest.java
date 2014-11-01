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
	
	@Test
	public void testMove() throws Exception
	{
		tictactoe ttt = new tictactoe().move(1);
		assertEquals(" X       ", ttt.toString());
		assertEquals('O', ttt.turn);
	}
	
	@Test
	public void testCMPPossibleMove() throws Exception
	{
		tictactoe ttt = new tictactoe().move(7).move(5).move(8);
		assertArrayEquals(new Integer[] {0, 1, 2, 3, 4, 6}, ttt.possibleCMPMove());
		
	}
	
	
}
