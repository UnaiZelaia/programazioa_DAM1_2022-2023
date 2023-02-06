package exekutagarriak;

import java.util.Scanner;

import model.*;

public class geometriaAzterketa {
    private final static int MAX = 20;
    private final static int MAXPOS = 10;

    private final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        if(galdera1()){
            System.out.println("Oso ondo");
        }
        else{
            System.out.println("Erantzuna ez dago ondo");
        }

        if(galdera2()){
            System.out.println("Oso ondo");
        }
        else{
            System.out.println("Erantzuna ez dago ondo");
        }

        if(galdera3()){
            System.out.println("Oso ondo");
        }
        else{
            System.out.println("Erantzuna ez dago ondo");
        }

        if(galdera4()){
            System.out.println("Oso ondo");
        }
        else{
            System.out.println("Erantzuna ez dago ondo");
        }
    }



    //This method generates two points with random values and asks the user for 
    //the distance between them. If the nswer is correct, returns true. Else false.
    public static boolean galdera1(){

        int x1 = (int)(Math.random() * MAX);
        int y1 = (int)(Math.random() * MAX);
        int x2 = (int)(Math.random() * MAX);
        int y2 = (int)(Math.random() * MAX);

        if(x1>MAXPOS){
            x1 = MAXPOS - x1;
        }

        if(y1>MAXPOS){
            y1 = MAXPOS - y1;
        }

        if(x2>MAXPOS){
            x2 = MAXPOS - x2;
        }

        if(y2>MAXPOS){
            y2 = MAXPOS - y2;
        }

        MyPoint p1 = new MyPoint(x1, y1);
        MyPoint p2 = new MyPoint(x2, y2);



        float distance = p1.distance(p2);
        System.out.println("Zein da puntu hauen arteko distantzia?");
        System.out.println("\t puntu1: " + p1.toString());
        System.out.println("\t puntu2: " + p2.toString());
        System.out.print("Zure erantzuna: ");

        float erantzuna = input.nextFloat();

        if(erantzuna == distance){
            return true;
        }
        else{
            return false;
        }
    }



    //This method generates two points with random values and then generates a rectangle
    //with them. It then asks the user for the area of said rectangle
    //If the nswer is correct, returns true. Else false.
    public static boolean galdera2(){
        int x1 = (int)(Math.random() * MAX);
        int y1 = (int)(Math.random() * MAX);
        int x2 = (int)(Math.random() * MAX);
        int y2 = (int)(Math.random() * MAX);

        if(x1>MAXPOS){
            x1 = MAXPOS - x1;
        }

        if(y1>MAXPOS){
            y1 = MAXPOS - y1;
        }

        if(x2>MAXPOS){
            x2 = MAXPOS - x2;
        }

        if(y2>MAXPOS){
            y2 = MAXPOS - y2;
        }

        MyPoint p1 = new MyPoint(x1, y1);
        MyPoint p2 = new MyPoint(x2, y2);


        MyRectangle r1 = new MyRectangle(p1, p2);

        float area = r1.getArea();

        System.out.println("Zein da puntu hauek sortzen duten errektanguluaren azalera?");
        System.out.println("\t puntu1: " + p1.toString());
        System.out.println("\t puntu2: " + p2.toString());
        System.out.print("Zure erantzuna: ");
        
        float erantzuna = input.nextFloat();

        if(erantzuna == area){
            return true;
        }
        else{
            return false;
        }
        
    }

    public static boolean galdera3(){
        int x1 = (int)(Math.random() * MAX);
        int y1 = (int)(Math.random() * MAX);
        int x2 = (int)(Math.random() * MAX);
        int y2 = (int)(Math.random() * MAX);

        if(x1>MAXPOS){
            x1 = MAXPOS - x1;
        }

        if(y1>MAXPOS){
            y1 = MAXPOS - y1;
        }

        if(x2>MAXPOS){
            x2 = MAXPOS - x2;
        }

        if(y2>MAXPOS){
            y2 = MAXPOS - y2;
        }

        MyPoint p1 = new MyPoint(x1, y1);
        MyPoint p2 = new MyPoint(x2, y2);

        MyRectangle r1 = new MyRectangle(p1, p2);

        float perimeter = r1.getPerimeter();

        System.out.println("Zein da puntu hauek sortzen duten errektanguluaren perimetroa?");
        System.out.println("\t puntu1: " + p1.toString());
        System.out.println("\t puntu2: " + p2.toString());
        System.out.print("Zure erantzuna: ");
        
        float erantzuna = input.nextFloat();

        if(erantzuna == perimeter){
            return true;
        }
        else{
            return false;
        }
    }


    public static boolean galdera4(){
        int x1 = (int)(Math.random() * MAX);
        int y1 = (int)(Math.random() * MAX);
        int x2 = (int)(Math.random() * MAX);
        int y2 = (int)(Math.random() * MAX);
        int x3 = (int)(Math.random() * MAX);
        int y3 = (int)(Math.random() * MAX);

        if(x1>MAXPOS){
            x1 = MAXPOS - x1;
        }

        if(y1>MAXPOS){
            y1 = MAXPOS - y1;
        }

        if(x2>MAXPOS){
            x2 = MAXPOS - x2;
        }

        if(y2>MAXPOS){
            y2 = MAXPOS - y2;
        }

        if(x3>MAXPOS){
            x3 = MAXPOS - x3;
        }

        if(y3>MAXPOS){
            y3 = MAXPOS - y3;
        }

        MyPoint p1 = new MyPoint(x1, y1);
        MyPoint p2 = new MyPoint(x2, y2);
        MyPoint p3 = new MyPoint(x3, y3);

        MyTriangle t1 = new MyTriangle(p1, p2, p3);

        float perimeter = t1.getPerimeter();

        System.out.println("Zein da puntu hauek sortzen duten trianguluaren perimetroa?");
        System.out.println("\t puntu1: " + p1.toString());
        System.out.println("\t puntu2: " + p2.toString());
        System.out.println("\t puntu2: " + p3.toString());
        System.out.print("Zure erantzuna: ");

        float erantzuna = input.nextFloat();

        if(erantzuna == perimeter){
            return true;
        }
        else{
            return false;
        }
    }
}
