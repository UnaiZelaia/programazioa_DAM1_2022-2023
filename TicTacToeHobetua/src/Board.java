public class Board {
    private char board[][];
    private int boardSize = 4;
    private char p1Symbol, p2Symbol;
    private int count;
    public final static int PLAYER_1_WINS = 1;
    public final static int PLAYER_2_WINS = 2;
    public final static int DRAW = 3;
    public final static int INCOMPLETE = 4;
    public final static int INVALID = 5;
    public Board(char p1Symbol, char p2Symbol){
        board = new char[boardSize][boardSize];
        for(int i =0; i < boardSize; i++){
            for(int j =0; j < boardSize; j++){
                board[i][j] = ' ';
            }
        }
        this.p1Symbol = p1Symbol;
        this.p2Symbol = p2Symbol;
    }
    public int move(char symbol, int x, int y) {
        if(x < 1 || x >= boardSize || y < 1 || y >= boardSize || board[x][y] != ' '){
            return INVALID;
        }
        board[x][y] = symbol;
        count++;
        // Check Row
        if(board[x][1] == board[x][2] && board[x][1] == board[x][3]){
            return symbol == p1Symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
        }
        // Check Col
        if(board[1][y] == board[2][y] && board[1][y] == board[3][y]){
            return symbol == p1Symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
        }
        // First Diagonal
        if(board[1][1] != ' ' && board[1][1] == board[2][2] && board[1][1] == board[3][3]){
            return symbol == p1Symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
        }
        // Second Diagonal
        if(board[1][3] != ' ' && board[1][3] == board[2][2] && board[1][3] == board[3][1]){
            return symbol == p1Symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
        }
        if(count == boardSize * boardSize){
            return DRAW;
        }
        return  INCOMPLETE;
    }
    public void print() {
        System.out.println("---------------");
        for(int i =1; i < boardSize; i++){
            for(int j =1; j < boardSize; j++){
                System.out.print("| " + board[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---------------");
    }
}
