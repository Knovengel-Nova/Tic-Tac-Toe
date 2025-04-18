public class Player {
    private char playerMove;
    private int playerScore;


    public char getPlayerMove(){
        return this.playerMove;
    }

    public int getPlayerScore(){
        return this.playerScore;
    }

    public void increamentPlayerScore(){
        this.playerScore++;
    }

    Player(char c){
        this.playerMove = c;
        this.playerScore =0;
    }
}