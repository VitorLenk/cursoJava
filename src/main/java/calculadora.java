import java.util.Scanner;

public class calculadora
{

    public static void main(String[] args)
    {

        Scanner entrada = new Scanner(System.in);

        System.out.print("informe a média: ");
        double media = entrada.nextDouble();

        if(media <=10.0 && media >= 7.0)
        {
            System.out.println("Aprovado!");
            System.out.println("Parabens!");
        }

        entrada.close();




    }






}
