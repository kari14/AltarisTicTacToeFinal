package TicTacToe;

public class tictactoe
{
	public char turn;
	public char[] grid; 
	//Empty constructor that creates a new empty grid.
	public tictactoe()
	{
		//			 012345678
		this.grid = "         ".toCharArray();
		this.turn = 'X';
	}
	//A constructor which creates a new board in middle of the game.
	public tictactoe(char[] newGrid, char turn)
	{
		this.grid = newGrid;
		this.turn = turn;
	}
	
	public String toString()
	{
		return new String(grid);
	}
	
	public tictactoe move(int j)
	{
		char[] newGrid = grid.clone();
		newGrid[j] = turn;

		if(turn == 'X')
		{
			turn = 'O';
		}
		else
		{
			turn = 'X';
		}
		return new tictactoe(newGrid, turn);
	}
	
	
}
