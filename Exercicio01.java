import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a matricula");
        String matricula = input.nextLine();
        String[] posicao = matricula.split("");

        String curso = "";

        if ((posicao[0].equals("A")) || (posicao[0].equals("B")) || (posicao[0].equals("C"))) {

            if ((posicao[5].equals(".")) && (posicao[7].equals("."))) {
                if ((posicao[6].equals("1")) || (posicao[6].equals("2"))) {

                    if (posicao[0].equals("A")) {
                        curso = "Administração";
                    } else if (posicao[0].equals("B")) {
                        curso = "Direito";
                    } else if (posicao[0].equals("C")) {
                        curso = "Nutrição";
                    }

                    System.out.println("Aluno " + posicao[8] + posicao[9] + posicao[10] + posicao[11] + posicao[12] +
                                       " do curso de " + curso + ", matricula do ano " +
                                       posicao[1] + posicao[2] + posicao[3] + posicao[4] +
                                       " do " + posicao[6] + "º semestre");
                }
            }
        }
        input.close();
    }
}