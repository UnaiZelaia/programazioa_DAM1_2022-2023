import java.util.Scanner;


public class TicTacToe {
    private Player player1, player2;
    private Board board;
    String playAgain = "";

    public static void main(String args[]) {
        TicTacToe t = new TicTacToe();
        t.startGame();
    }

    public void startGame() {
            Scanner s = new Scanner(System.in);
            // Players input
            player1 = takePlayerInput(1);
            player2 = takePlayerInput(2);
            while (player1.getSymbol() == player2.getSymbol()) {
                System.out.println("Symbol Already taken !! Pick another symbol !!");
                char symbol = s.next().charAt(0);
                player2.setSymbol(symbol);
            }
            do { //Unai: He movido donde se situa este do para que no pida nombres nuevos en cada partida.
            // Create Board
            board = new Board(player1.getSymbol(), player2.getSymbol());
            // Conduct the Game
            boolean player1Turn = true;
            int status = Board.INCOMPLETE;
            while (status == Board.INCOMPLETE || status == Board.INVALID) {
                if (player1Turn) {
                    System.out.println("Player 1 - " + player1.getName() + "'s turn");
                    System.out.println("Enter the column position [1-3]: ");
                    int y = s.nextInt();
                    System.out.println("Enter the row position[1-3]: ");
                    int x = s.nextInt();
                    status = board.move(player1.getSymbol(), x, y);
                    if (status != Board.INVALID) {
                        player1Turn = false;
                        board.print();
                    } else {
                        System.out.println("Invalid Move!! Try Again!!");
                    }

                } else {
                    System.out.println("Player 2 - " + player2.getName() + "'s turn");
                    System.out.println("Enter the column position [1-3]: ");
                    int y = s.nextInt();
                    System.out.println("Enter the row position[1-3]: ");
                    int x = s.nextInt();
                    status = board.move(player2.getSymbol(), x, y);
                    if (status != Board.INVALID) {
                        player1Turn = true;
                        board.print();
                    } else {
                        System.out.println("Invalid Move!! Try Again!!");
                    }
                }
            }

            if (status == Board.PLAYER_1_WINS) {
                System.out.println("Player 1 - " + player1.getName() + " wins !!");
                player1.addWin(); //Añade la victoria al jugador que ha ganado.
            } else if (status == Board.PLAYER_2_WINS) {
                System.out.println("Player 2 - " + player2.getName() + " wins !!");
                player2.addWin(); //Añade la victoria al jugador que ha ganado.s
            } else {
                System.out.println("Draw!!");
            }
            //Se imprimen las victorias de cada jugador.
            System.out.println("The score is:\n\t" + player1.getName() + " - " + player1.getWins() + "\n\t" + player2.getName() + " - " + player2.getWins() + "\n");
            Scanner sc = new Scanner(System.in);
            System.out.println("Would you like to play again? Enter Y to play or any other key to quit: ");
            playAgain = sc.nextLine();

        } while (playAgain.equalsIgnoreCase("Y"));

        //If para comparar victorias de cada jugador y mostrar el mensaje adecuado.
        if(player1.getWins() > player2.getWins()){
            System.out.println(player1.getName() + " wins!\n");
        } 
        else if(player1.getWins() < player2.getWins()){
            System.out.println(player2.getName() + " wins!\n");
        }
        else{
            System.out.println("It's a draw!!\n");
        }
        System.out.println("Thanks for playing!");
    }

    private Player takePlayerInput(int num) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Player " + num + " name: ");
        String name = s.nextLine();
        System.out.println("Enter Player " + num + " symbol: ");
        char symbol = s.next().charAt(0);
        Player p = new Player(name, symbol);
        return p;
    }
}
