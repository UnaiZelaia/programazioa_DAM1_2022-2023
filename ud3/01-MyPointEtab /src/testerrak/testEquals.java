package testerrak;
import model.*;

public class testEquals {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(7,8);
        MyPoint p2 = new MyPoint(7,8);

        if (p1.equals(p2)) {
            System.out.println("Espazioko puntu berdina adierazten dute.");
        }
    }
}
