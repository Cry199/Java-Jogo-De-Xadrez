package app;

import chess.ChessMath;

public class Prog {

	public static void main(String[] args) 
	{
		ChessMath chessMath = new ChessMath();
		UI.printBoard(chessMath.getPieces());
	}
}
