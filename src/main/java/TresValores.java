public class TresValores {
    // Ler três valores e falar qual é o maior entre eles.


    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 7;
        int num3 = 10;

        if (num1 > num2){
            if (num1 > num3) {
                System.out.println("Número 1 é o maior");
            } else if (num2 > num3 ){
                System.out.println("Número 2 é o maior");
            }
            else{
                System.out.println("Número 3 é o maior");
            }

            }
        else{
            System.out.println("Número 2 é o maior");
        }

        }

        /*if (num2 > num1){
            if (num2 > num3) {
                System.out.println("Número 2 é o maior");
            }
        }
        if (num3 > num1){
            if (num3 > num2) {
                System.out.println("Número 3 é o maior");
            }
        }*/

}



