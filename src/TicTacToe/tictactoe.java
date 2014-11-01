package TicTacToe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
	public Integer[] possibleCMPMove()
	{
		List<Integer> l = new LinkedList<Integer>();
		int counter = 0;
		while(counter < grid.length)
		{
			if(grid[counter] == ' ')
			{
				l.add(counter);
			}
			counter++;
		}
		Integer[] arr = new Integer[(l.size())];
	
		return l.toArray(arr); 
	}
	
	
}
