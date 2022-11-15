public class Laukia{

    private final double DEFAULT_ZABALERA = 5.00;
    private final double DEFAULT_ALTUERA = 5.00;
    private double zabalera;
    private double altuera;

    /**Default constructor for Laukia. Default values = 5.00 */
    public Laukia(){
        this.zabalera = DEFAULT_ZABALERA;
        this.altuera = DEFAULT_ALTUERA;
    }
    /**Constructor for Laukia(int zabalera, int altuera) */
    public Laukia(double zabal, double altu){
        this.zabalera = zabal;
        this.altuera = altu;
    }

    /*Getters for different parameters */
    public double getZabalera(){
        return this.zabalera;
    }

    public double getAltuera(){
        return this.altuera;
    }

    public double getAzalera(){
        return zabalera * altuera;
    }

    public double getPerimetroa(){
        return (zabalera * 2) + (altuera * 2);
    }


    /*Setters for the parameter zabalera and altuera */
    public void setAltuera(double altu){
        this.altuera = altu;
    }

    public void setZabalera(double zabal){
        this.zabalera = zabal;
    }


    /*Methods that return information about the object created */
    public String toString(){
        return "Laukia[" + altuera + "x" + zabalera + "]";
    }

    public String getMota(){
        if(this.zabalera > this.altuera){
            return "Horizontala";
        }
        else if(this.zabalera < this.altuera){
            return "Bertikala";
        }
        else if(this.zabalera == this.altuera){
            return "Karratua";
        }
        else{
            return "Errore bat egon da.";
        }
    }


    /*Methods to print out the square */
    public void marraztuBeteta(){
        for(int col = 1; col <= this.altuera; col++){
            for(int row = 1; row <= this.zabalera; row++){
                System.out.print("#  ");
            }
            System.out.println();
            System.out.println();
        }    
    }

    public void marraztuBeteta(char c){
        for(int col = 1; col <= this.altuera; col++){
            for(int row = 1; row <= this.zabalera; row++){
                System.out.print(c + "  ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public void marraztuHutsik(){
        for(int col = 1; col <= this.altuera; col++){
            for(int row = 1; row <= this.zabalera; row++){
                if((col == 1 || col == this.altuera) || (row == 1 || row == this.zabalera)){
                    System.out.print("#  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            System.out.println();
        }   
    }

    public String laukiBetea(){
        String laukia = "";
        for(int col = 1; col <= this.altuera; col++){
            for(int row = 1; row <= this.zabalera; row++){
                laukia = laukia.concat("#  ");
            }
            laukia = laukia.concat("\n\n");
        }    
        return laukia;
    }

    
    /** Return true if the Laukia used to call the method is bigger. Else returns false. Returns false on equal Laukiak */
    public boolean isBiggerThan(Laukia l){
        if(l.getAzalera() < this.getAzalera()){
            return true;
        }
        else{
            return false;
        }
    }

    /**Return the biggest Laukia of an array of Laukia[]. Static method */
    public static Laukia getTheBiggest(Laukia[] lk){
        double max = 0;
        int maxIndex = 0;
        for(int i = 0; i < lk.length; i++){
            if(lk[i].getAzalera() > max){
                max = lk[i].getAzalera();
                maxIndex = i;
            }
        }
        return lk[maxIndex];
    }
}