package school.sptech;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConsoleLogs {
    static void main() {
        Scanner input = new Scanner(System.in);
        LocalDateTime dtAv = LocalDateTime.now();
        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");

        System.out.println("Bem vindo! \nAntes de começarmos, insira o seu nome: ");
        String nome = input.nextLine();

        System.out.printf("\nNovo login! Usuário %s logou ás %s%n \n", nome, dtAv.format(formatado));

        System.out.println("Insira o filme/série favorito: ");
        String filmeFav = input.nextLine();

        System.out.println("\nInsira seu gẽnero favorito: ");
        String genero = input.nextLine();

        System.out.printf("O usuário %s adicionou novas informações ao seu perfil: \n", nome);
        System.out.printf(" - Filme Favorito: %s \n - Gênero Favorito: %s \n", filmeFav, genero);
        System.out.printf("Data da alteração: %s%n \n", dtAv.format(formatado));

        System.out.println("Insira um filme/série que deseja avaliar: ");
        String filmeAv = input.nextLine();

        System.out.println("\nAvalie este filme (0 a 10): ");
        Integer nota = input.nextInt();

        System.out.printf("\nO usuário %s avaliou um filme/série: \n", nome);
        System.out.printf(" - Filme Avaliado: %s \n - Nota: %d \n - Data da avaliação: %s%n \n", filmeAv, nota, dtAv.format(formatado));

    }
}
