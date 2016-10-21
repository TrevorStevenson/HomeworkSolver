package ts;

import java.util.*;

public class Matrix {
	
	private int rows= 0;
	private int columns = 0;
	private int[][] myMatrix = null;

	public Matrix(int rows, int columns)
	{
		this.rows = rows;
		this.columns = columns;
		
		myMatrix = new int[rows][columns];
	}
	
	public void createMatrix()
	{
		try(Scanner in = new Scanner(System.in))
		{
			for (int i = 0; i < rows; i++)
			{
				for (int c = 0; c < columns; c++)
				{
					myMatrix[i][c] = in.nextInt();
				}
			}
		}
	}
	
	public void printMatrix()
	{	
		for (int r = 0; r < rows; r++)
		{
			System.out.print("|");
			for (int c = 0; c < columns; c++)
			{
				System.out.print(myMatrix[r][c]);
				if (c != columns - 1) System.out.print(" ");
			}
			System.out.println("|");
		}
	}
}		
		