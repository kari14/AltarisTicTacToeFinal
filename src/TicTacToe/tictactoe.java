package TicTacToe;

public class tictactoe
{
	public char turn;
	public char[] grid; 
	public tictactoe()
	{
		this.grid = "         ".toCharArray();
		this.turn = 'X';
	}
	
	public String toString()
	{
		return new String(grid);
	}
	
	
}
