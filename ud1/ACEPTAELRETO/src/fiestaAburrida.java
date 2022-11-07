import java.util.Scanner;

public class fiestaAburrida {
    /*
     * La entrada comienza con un número que indica la cantidad de gente a la que Tinín no conoce 
     * en la fiesta en la que está. A continuación viene una línea por cada una de esas personas 
     * en la que se presenta indicando su nombre: "Soy Lotario". La línea siempre tendrá el 
     * mismo formato; una primera palabra "Soy" seguida del nombre de la persona que será simple
     * (no será un nombre compuesto por varias palabras) y formado por como mucho 100 letras del
     *  alfabeto inglés. 
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombres[];
        int j = 0;

        int num = input.nextInt();

        nombres = new String[num];

        for(int p = 0; p < num; p++){
            for(int i = 0; i < 2; i++){
                String soy[] = new String[2];
                soy[i] = input.next();
                if(i == 1){
                    nombres[j] = soy[i];
                    j++;
                }
            }
        }
        input.close();

        for(int i = 0; i < num; i++){
            System.out.println("Hola, " + nombres[i] + ".");
        }

    }
}
