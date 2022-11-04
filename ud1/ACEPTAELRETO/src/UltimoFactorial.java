import java.util.Scanner;

public class UltimoFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int product;
        int casos;
        int number;
        //int salida[];

        //Cantidad de numeros que se van a procesar
        casos = input.nextInt();

        //Crear array para guardar el resultado de cada operacion
        //salida = new int[casos];

        //Loop que procesa cada uno de los numeros
        for (int i = 0; i < casos; i++) {
            //En cada ejecucion del loop product se pone a 1.
            product = 1;
            //Pedir input para procesar el numero
            number = input.nextInt();

            //Encontrar el factorial del numero introducido
            for (int j = 0; j < number; j++) {
                product = product * (j + 1);
            }

            //Se recoge el ultimo digito del factorial y se guarda en el array salida[].
            //salida[i] = product % 10;
            System.out.println(product);

        }
        input.close();

        //Imprimir cada resultado guardado en salida[]
        //for (int i = 0; i < salida.length; i++) {
        //    System.out.println(salida[i]);
        //}

    }
}
