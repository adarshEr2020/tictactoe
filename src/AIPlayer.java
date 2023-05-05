import java.util.Random;

class AIPlayer extends Player {
	AIPlayer(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}

	void makeMove() {
		int row, col;
		do {
			Random r = new Random();
			row = r.nextInt(3);
			col = r.nextInt(3);
		} while (!isValidMove(row, col));
		TicTacToe.placeMark(row, col, mark);
	}
}
