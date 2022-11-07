import java.util.Scanner;

public class codificar {

/* 
    La entrada está formada por un número indeterminado de casos de prueba.

    Cada caso de prueba consiste en una única línea cuyo primer carácter es el código de la letra 'p', 
    seguido de un mensaje codificado con el método Cesar descrito antes utilizando el desplazamiento 
    adecuado para que la letra 'p' se codifique con ese primer carácter.

    Los casos de prueba terminan con un mensaje codificado que, una vez traducido, contiene exactamente
    la cadena "FIN". Cuando se lee este mensaje codificado el programa debe terminar sin generar
    ninguna otra salida más.
*/
    public static void main(String[] args) {
        boolean cont = true;
        Scanner input = new Scanner(System.in);
        String msg;
        int p;
        int dif;

        do{
            int count = 0;
            msg = input.nextLine();
            p = msg.charAt(0);
            dif = p - 112;

            for(int i = 0; i < msg.length(); i++){
                int letraDeco = (int)msg.charAt(i) - dif;
                msg = msg.replace(msg.charAt(i), (char)letraDeco);

                if(msg.charAt(i) == 'a' || msg.charAt(i) == 'e' ||msg.charAt(i) == 'i' ||msg.charAt(i) == 'o' ||msg.charAt(i) == 'u' || 
                msg.charAt(i) == 'A' || msg.charAt(i) == 'E' ||msg.charAt(i) == 'I' ||msg.charAt(i) == 'O' ||msg.charAt(i) == 'U'){
                    count++;
                }
            }
            if(msg.equals("pFIN")){
                cont = false;
            }
            else{
                System.out.println(count);
            }
        }while(cont);
        input.close();
    }
}
