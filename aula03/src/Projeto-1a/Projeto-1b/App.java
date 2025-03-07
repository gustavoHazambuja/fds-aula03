

import java.util.Scanner;
import Professor;

public class App {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);


        System.out.println("Nome do professor:");
        String nome = dados.nextLine();
        System.out.println("Anos de experiência:");
        int anos = dados.nextInt();

        Professor p = new Professor(nome,anos);
        System.out.println(p.toString());
        System.out.println("Categoria: " + p.classifica);

        dados.close();
    }
}
