import java.util.Scanner;

public class IfElse
{



        public static void main(String[] args)
        {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite sua nota ");

            double nota = entrada.nextDouble();

            if( nota >=10.0 || nota < 0.0) {
                System.out.println("Nota Invalida");
            } else if( nota >= 8.1) {
                System.out.println("Conceito A");
            } else if( nota >= 6.1) {
                System.out.println("Conceito B");
            } else if( nota >= 4.1) {
                System.out.println("Conceito C");
            } else if( nota >= 2.1) {
                System.out.println("Conceito D");
            } else {
                System.out.println("Conceito E");
            }

            entrada.close();

        }

}



