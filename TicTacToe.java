package Practice;
import java.util.Scanner;

public class TicTacToe {
    static char[][] board={{'1','2','3'},{'4','5','6'},{'7','8','9'}};

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char currentPlayer='X';
        int moves=0;

        while(true){
            printBoard();
            System.out.print("Player "+currentPlayer+", enter a cell number (1-9): ");
            int move=sc.nextInt();
            if(!makeMove(currentPlayer, move)){
                System.out.println("❌ Invalid move. Try again.");
                continue;
            }
            moves++;
            if(checkWinner(currentPlayer)){
                printBoard();
                System.out.println("🎉 Player "+currentPlayer+" wins!");
                break;
            }
            if(moves==9){
                printBoard();
                System.out.println("🤝 It's a draw!");
                break;
            }
            currentPlayer=(currentPlayer=='X')?'O':'X';
        }
        sc.close();
    }

    static void printBoard(){
        System.out.println();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+board[i][j]+" ");
                if(j<2)System.out.print("|");
            }
            System.out.println();
            if(i<2)System.out.println("---+---+---");
        }
        System.out.println();
    }

    static boolean makeMove(char player,int pos){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]==(char)(pos+'0')){
                    board[i][j]=player;
                    return true;
                }
            }
        }
        return false;
    }

    static boolean checkWinner(char player){
        for(int i=0;i<3;i++){
            if(board[i][0]==player && board[i][1]==player && board[i][2]==player)return true;
            if(board[0][i]==player && board[1][i]==player && board[2][i]==player)return true;
        }
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player)return true;
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player)return true;
        return false;
    }
}