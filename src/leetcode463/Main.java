package leetcode463;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] grid = {{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}};
		
		System.out.println("Grid: " + Arrays.deepToString(grid));
		
		FindIslandPerimeter solution = new FindIslandPerimeter();
		
		System.out.println("Solution: " + solution.islandPerimeter(grid));
		
	}
}
