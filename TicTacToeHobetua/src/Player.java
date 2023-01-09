public class Player {
    private String name;
    private char symbol;
    //Cambio de Unai: contador de numero de victorias.
    private int wins = 0;
    
    public Player(String name, char symbol){
        setName(name);
        setSymbol(symbol);
    }
    
    public void setName(String name) {
        
        if(!name.isEmpty()) {
            this.name = name;
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setSymbol(char symbol) {
        if(symbol != '\0') {
            this.symbol = symbol;
        }
    }
    
    public char getSymbol() {
        return this.symbol;
    }

    //Método que añade una victoria a la persona que gane.
    public void addWin() {
        wins = wins + 1;
    }

    public int getWins() {
        return this.wins;
    }
}
