import java.util.Scanner;

public class GameBoard {
    private char[] pos = new char[9];
    String warning = "";
    private int occupied;
    private Player xPlayer = new Player('X');
    private Player oPlayer = new Player('O');
    private Player x = xPlayer;

    private void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }
    
    public void display(){
        clearScreen();
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n");
        System.out.println("    1   2   3\t\t\t***Score***");  
        System.out.println("a   " + pos[0] + " | " + pos[1] + " | " + pos[2]+"\t\t\t X\t O");  
        System.out.println("   ---+---+---\t\t\t "+xPlayer.getPlayerScore()+"\t "+oPlayer.getPlayerScore());  
        System.out.println("b   " + pos[3] + " | " + pos[4] + " | " + pos[5]);  
        System.out.println("   ---+---+---\t "+warning);  
        System.out.println("c   " + pos[6] + " | " + pos[7] + " | " + pos[8]);  
        System.out.println("\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        input();
    }

    public void changePlayer(){
        if(x == xPlayer)
            x = oPlayer;
        else
            x = xPlayer;
    }

    public void resetBoard(){
        for(int i=0; i<9; i++){
            pos[i] = ' ';
        }
    }

    public void gameStatus(){  
        if(pos[0] == 'X' && pos[1] == 'X' && pos[2] == 'X'){
            xPlayer.increamentPlayerScore();
            occupied =0;
            resetBoard();
            warning = "\t <Player X won this round!>";
            display();
            x = xPlayer;
        }if(pos[3] == 'X' && pos[4]== 'X' && pos[5] == 'X'){
            xPlayer.increamentPlayerScore();
            occupied =0;
            resetBoard();
            warning = "\t <Player X won this round!>";
            display();
            x = xPlayer;
        }if(pos[6] == 'X' && pos[7]== 'X' && pos[8] == 'X'){
            xPlayer.increamentPlayerScore();
            occupied =0;
            resetBoard();
            warning = "\t <Player X won this round!>";
            display();
            x = xPlayer;
        }if(pos[0] == 'X' && pos[3] == 'X' && pos[6] == 'X'){
            xPlayer.increamentPlayerScore();
            occupied =0;
            resetBoard();
            warning = "\t <Player X won this round!>";
            display();
            x = xPlayer;
        }if(pos[1] == 'X' && pos[4]== 'X' && pos[7] == 'X'){
            xPlayer.increamentPlayerScore();
            occupied =0;
            resetBoard();
            warning = "\t <Player X won this round!>";
            display();
            x = xPlayer;
        }if(pos[2] == 'X' && pos[5]== 'X' && pos[8] == 'X'){
            xPlayer.increamentPlayerScore();
            occupied =0;
            resetBoard();
            warning = "\t <Player X won this round!>";
            display();
            x = xPlayer;
        }
        if(pos[0] == 'X' && pos[4]== 'X' && pos[8] == 'X'){
            xPlayer.increamentPlayerScore();
            occupied =0;
            resetBoard();
            warning = "\t <Player X won this round!>";
            display();
            x = xPlayer;
        }if(pos[2] == 'X' && pos[4]== 'X' && pos[6] == 'X'){
            xPlayer.increamentPlayerScore();
            occupied =0;
            resetBoard();
            warning = "\t <Player X won this round!>";
            display();
            x = xPlayer;
        }

        if(pos[0] == 'O' && pos[1] == 'O' && pos[2] == 'O'){
            oPlayer.increamentPlayerScore();
            occupied =0;
            resetBoard();
            warning = "\t <Player O won this round!>";
            display();
            x = xPlayer;
        }if(pos[3] == 'O' && pos[4]== 'O' && pos[5] == 'O'){
            oPlayer.increamentPlayerScore();
            occupied =0;
            resetBoard();
            warning = "\t <Player O won this round!>";
            display();
            x = xPlayer;
        }if(pos[6] == 'O' && pos[7]== 'O' && pos[8] == 'O'){
            oPlayer.increamentPlayerScore();
            occupied =0;
            resetBoard();
            warning = "\t <Player O won this round!>";
            display();
            x = xPlayer;
        }if(pos[0] == 'O' && pos[3] == 'O' && pos[6] == 'O'){
            oPlayer.increamentPlayerScore();
            occupied =0;
            resetBoard();
            warning = "\t <Player O won this round!>";
            display();
            x = xPlayer;
        }if(pos[1] == 'O' && pos[4]== 'O' && pos[7] == 'O'){
            oPlayer.increamentPlayerScore();
            occupied =0;
            resetBoard();
            warning = "\t <Player O won this round!>";
            display();
            x = xPlayer;
        }if(pos[2] == 'O' && pos[5]== 'O' && pos[8] == 'O'){
            oPlayer.increamentPlayerScore();
            occupied =0;
            resetBoard();
            warning = "\t <Player O won this round!>";
            display();
            x = xPlayer;
        }
        if(pos[0] == 'O' && pos[4]== 'O' && pos[8] == 'O'){
            oPlayer.increamentPlayerScore();
            occupied =0;
            resetBoard();
            warning = "\t <Player O won this round!>";
            display();
            x = xPlayer;
        }if(pos[2] == 'O' && pos[4]== 'O' && pos[6] == 'O'){
            oPlayer.increamentPlayerScore();
            occupied =0;
            resetBoard();
            warning = "\t <Player O won this round!>";
            display();
            x = xPlayer;
        }

        if(occupied == 9){
            warning = "\t <This round was a Draw!>";
            occupied =0;
            resetBoard();
            x=xPlayer;
        }
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        warning = "";
        while (true) {
            System.out.print("\n> ");
            String in = sc.next().toLowerCase();

            int index = -1;

            switch (in) {
                case "a1":
                    index = 0;
                    break;

                case "a2":
                    index = 1;
                    break;
                
                case "a3":
                    index = 2;
                    break;
                    
                case "b1":
                    index = 3;
                    break;

                case "b2":
                    index = 4;
                    break;

                case "b3":
                    index = 5;
                    break;
                
                case "c1":
                    index = 6;
                    break;
                    
                case "c2":
                    index = 7;
                    break;

                case "c3":
                    index = 8;
                    break;

                case "exit":
                    System.exit(0);
                    break;
            
                default:
                    warning = "\t\t<Invalid Move!>";
                    display();
                    continue;
            }
            if (pos[index] == ' ') {
                pos[index] = x.getPlayerMove();
                occupied++;
                changePlayer();
                gameStatus();
                display();
                break;
            } else {
                warning = "<Can't place your move on " + in + ". Already placed!>";
                display();
            }
        }
        sc.close();
    }

    GameBoard(){
        resetBoard();
        occupied = 0;
    }
}
