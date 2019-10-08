package backend;

public class Grid implements iController {

	private int[][] grid;

	public Grid() {
		this.grid = new int[3][3];
	}

	public boolean XTurn(int x, int y) {
		if (this.grid[x][y] == 0) {
			this.grid[x][y] = 1;
			return true;
		} else {
			return false;
		}
	}

	public boolean YTurn(int x, int y) {
		if (this.grid[x][y] == 0) {
			this.grid[x][y] = 2;
			return true;
		} else {
			return false;
		}
	}

	public boolean hasWon(int number) {
		if (this.grid[0][0] == number && this.grid[0][1] == number && this.grid[0][2] == number) {
			return true;
		} else if (this.grid[1][0] == number && this.grid[1][1] == number && this.grid[1][2] == number) {
			return true;
		} else if (this.grid[2][0] == number && this.grid[2][1] == number && this.grid[2][2] == number) {
			return true;
		} else if (this.grid[0][0] == number && this.grid[1][0] == number && this.grid[2][0] == number) {
			return true;
		} else if (this.grid[0][1] == number && this.grid[1][1] == number && this.grid[2][1] == number) {
			return true;
		} else if (this.grid[0][2] == number && this.grid[1][2] == number && this.grid[2][2] == number) {
			return true;
		} else if (this.grid[0][0] == number && this.grid[1][1] == number && this.grid[2][2] == number) {
			return true;
		} else if (this.grid[0][2] == number && this.grid[1][1] == number && this.grid[2][0] == number) {
			return true;
		} else {
			return false;
		}
	}

	public void clear() {
		for (int i = 0; i < 3; i++) {
			for (int o = 0; o < 3; o++) {
				this.grid[i][o] = 0;
			}
		}
	}

}
