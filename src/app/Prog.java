package app;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMath;
import chess.ChessPiece;
import chess.ChessPosition;

public class Prog {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ChessMath chessMath = new ChessMath();
		
		while (true)
		{
			try 
			{
				UI.clearScreen();
				UI.printBoard(chessMath.getPieces());
				
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturePiece = chessMath.performChessMove(source, target);
			}
			catch (ChessException e) 
			{
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch (InputMismatchException e) 
			{
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
}
