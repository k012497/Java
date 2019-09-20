package chapter18.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

   public static void main(String[] args) throws IOException {
      ServerSocket ss = new ServerSocket(9001);
      System.out.println("Tic Tac Toe 서버가 시작되었습니다.^0^/");
      try {
         while (true) {
            Game game = new Game();
            Socket socket;
            socket = ss.accept();
            Player player1 = new Player(game, socket, 'X');
            Socket socket2 = ss.accept();
            Player player2 = new Player(game, socket2, 'O');
            
            player1.other= player2;
            player2.other= player1;
            player1.start();
            player2.start();
         } // end of while
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   // Game 클래스 설계
   public static class Game {

      private char[][] boards = new char[3][3];
      
      public synchronized char getBoards(int i, int j) {
         return boards[i][j];
      }

      public synchronized void setBoards(int i, int j, char playerMark) {
         this.boards[i][j] = playerMark;
      }

      public synchronized void printBoard() {
         for (int k = 0; k < 3; k++) {
            System.out.println(" " + boards[k][0] + "l " + boards[k][1] + "l " + boards[k][2]);
            if (k != 2) {
               System.out.println("---l---l---");
            }
         }
      }
   }// end of Game class

   public static class Player extends Thread {
      public Game game;
      public Socket socket;
      public BufferedReader br;
      public PrintWriter pw;
      public char playerMark;
      public Player other;

      public Player(Game game, Socket socket, char playerMark) {
         this.game = game;
         this.socket = socket;
         this.playerMark = playerMark;

         try {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw = new PrintWriter(socket.getOutputStream(), true);
            pw.println("START " + playerMark);
            pw.println("PRINT 다른 경기자를 기다리고 있습니다.");

         } catch (IOException e) {
            System.out.println("연결이 끊어졌습니다." + e);
         }

      }

      @Override
      public void run() {
         pw.println("PRINT 모든 경기자가 연결되었습니다.");
         if (playerMark == 'X') {
            pw.println("PRINT 당신 차례입니다.");
         }
         try {
            while (true) {
               String command = br.readLine();
               if (command.startsWith("MOVE")) {
                  int i = Integer.parseInt(command.substring(5, 6));
                  int j = Integer.parseInt(command.substring(7, 8));
                  game.setBoards(i, j, playerMark);
                  game.printBoard();
                  other.pw.println("OTHER " + i + " " + j);
                  pw.println("PRINT 기다리세요!");
                  other.pw.println("PRINT 당신 차례입니다.");
               } else if (command.startsWith("QUIT")) {
                  break;
               }
            } // end of while
         } catch (IOException e) {
            e.printStackTrace();
         } finally {
            try {
               socket.close();
               pw.close();
               br.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
         } // end of finally
      }
   }
}// end of ServerTest class