import java.util.Scanner;

public class HumanPlayer extends Player{
	HumanPlayer(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}

	void makeMove() {
		Scanner scan = new Scanner(System.in);
		int row, col;
		do {
			System.out.println("Enter the row and col");
			row = scan.nextInt();
			col = scan.nextInt();
			
		} while (!isValidMove(row, col));
		TicTacToe.placeMark(row, col, mark);
	}
}
