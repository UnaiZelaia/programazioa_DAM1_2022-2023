package salbuespenak;

public class Prog1 {
    public static void main(String[] args) {
        int[] zenbakiak = {1, 15, 2};
        try{
            System.out.println(zenbakiak[3]);
        } catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Salbuespena gertatu da.");
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass());
        }
    }
}
