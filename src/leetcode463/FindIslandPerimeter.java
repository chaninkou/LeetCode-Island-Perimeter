package leetcode463;

public class FindIslandPerimeter {
	 public int islandPerimeter(int[][] grid) {
	        int islands = 0, neighbours = 0;

	        for (int i = 0; i < grid.length; i++) {
	            for (int j = 0; j < grid[i].length; j++) {
	                if (grid[i][j] == 1) {
	                    islands++;
	                    
	                    // Check if neighbour is on down
	                    if (i < grid.length - 1 && grid[i + 1][j] == 1){
	                        neighbours++;
	                    } 
	                    
	                    // Check if neighbour is on right
	                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1){
	                        neighbours++;
	                    }
	                }
	            }
	        }

	        // Each island have 4 sides
	        // 1 neighours means 2 lines is gone
	        return islands * 4 - neighbours * 2;
	    }
}
