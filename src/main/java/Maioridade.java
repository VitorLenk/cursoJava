public class Maioridade {
    // Enunciado: Quero saber se o usuário tem idade para consumir bebida alcoolica
    // O usuário está dirigindo?

    public static void main(String[] args) {

        int idade = 19;
        boolean dirigindo = true;

        if (idade >= 18 && dirigindo == false){
            System.out.println("Pode consumir.");
        } else if (idade >= 18 && dirigindo == true){
            System.out.println("Não pode consumir.");
        } else if (idade < 18) {
            System.out.println("Não pode consumir e nem dirigir.");
        }
     }
}
