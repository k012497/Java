package chapter18.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9001);
		System.out.println("GAME START");
		
		try {
		while(true) {
			Game game = new Game();
			
			Socket socket1;
				socket1 = ss.accept();
			Player player1 = new Player(game, socket1, 'X');
			Socket socket2 = ss.accept();
			Player player2 = new Player(game, socket2, 'O');
			
			player1.start();
			player2.start();
			
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}// end of main
	
	public static class Game {
		private char[][] boards = new char[3][3];

		public synchronized char getBoards(int i, int j) {
			return boards[i][j];
		}

		public synchronized void setBoards(int i, int j, char playerMark) {
			boards[i][j] = playerMark;
		}
		
		public synchronized void printBoard() {
			for (int k = 0; k < 3; k++) {
				System.out.println("  " + boards[k][0] + "|  " + "  " + boards[k][1] + "|  " + "  " + boards[k][2] + "|  ");
				if ( k != 2) {
					System.out.println("---|---|---");
				}
			}
		}
		
	}//end of Game
	
	public static class Player extends Thread{
		Game game;
		Socket socket;
		BufferedReader br;
		PrintWriter pw;
		char playerMark;
		Player other;
		
		public Player (Game game, Socket socket, char PlayerMark) {
			
			this.game = game;
			this.socket = socket;
			try {
				this.br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				this.pw = new PrintWriter(socket.getOutputStream(), true);
				pw.println("START " + playerMark);
				pw.println("PRINT 다른 경기자를 기다리고 있습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			pw.println("PRINT 모든 경기자가 연결되었습니다.");
			if(playerMark == 'X') {
				pw.println("PRINT 당신 차례입니다.");
			}
			
			try {
			while(true) {
				String command;
					command = br.readLine();
				if(command == null) continue;
				
				if(command.startsWith("MOVE")) {
					int i  = Integer.parseInt(command.substring(5, 6));
					int j  = Integer.parseInt(command.substring(7, 8));
					game.setBoards(i, j, playerMark);
					game.printBoard();
					pw.println("PRINT 기다리세요");
					other.pw.println("PRINT 당신 차례입니다.");
				}else if (command.startsWith("QUIT")) {
					break;
				}
			}//end of while
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
					pw.close();
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}// end of finally 
		}//end of run
		
	}

}// end of ServerTest
