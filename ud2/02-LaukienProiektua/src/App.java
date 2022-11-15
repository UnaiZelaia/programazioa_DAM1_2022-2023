public class App {
    public static void main(String[] args) throws Exception {
        Laukia bat = new Laukia(5, 5);
        bat.marraztuBeteta('?');
        System.out.println();
        String prueba = bat.laukiBetea(); 
        System.out.println(prueba);
    }
}
