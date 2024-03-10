package advinha; // Define o pacote onde a classe AddEdade está localizada

import java.util.Scanner; // Importa a classe Scanner do pacote java.util para receber entrada do usuário
import java.util.Random; // Importa a classe Random do pacote java.util para gerar números aleatórios

public class AddEdade { // Inicia a definição da classe AddEdade
    
    public static void main(String[] args) { // Inicia o método main, ponto de entrada do programa Java
        
        Scanner scanner = new Scanner(System.in); // Cria uma instância de Scanner para entrada de dados do usuário
        Random random = new Random(); // Cria uma instância de Random para gerar números aleatórios

        System.out.println("Bem-vindo ao jogo de adivinhação de idade!"); // Exibe uma mensagem de boas-vindas
        System.out.println("Por favor, pense em um número entre 1 e 100, que representa sua idade."); // Exibe instruções para o usuário

        int palpiteInicial = random.nextInt(100) + 1; // Gera um palpite inicial aleatório para a idade do usuário
        System.out.println("Minha primeira suposição é: " + palpiteInicial + " anos."); // Exibe o palpite inicial na tela

        boolean idadeAdivinhada = false; // Define uma variável booleana para controlar o loop do jogo

        while (!idadeAdivinhada) { // Inicia um loop que continua enquanto a idade não for adivinhada
            
            System.out.println("É essa a sua idade? (sim/não)"); // Pergunta ao usuário se o palpite está correto
            String resposta = scanner.nextLine().toLowerCase(); // Lê a resposta do usuário e a converte para minúsculas

            if (resposta.equals("s")) { // Verifica se a resposta do usuário é "s"
                System.out.println("Yay! Adivinhei corretamente!"); // Exibe uma mensagem de sucesso
                idadeAdivinhada = true; // Define idadeAdivinhada como true para encerrar o loop
            } else if (resposta.equals("n")) { // Verifica se a resposta do usuário é "n"
                System.out.println("Hmm, então estou errado. Deixe-me tentar novamente."); // Exibe uma mensagem de erro
                int novoPalpite = random.nextInt(100) + 1; // Gera um novo palpite aleatório
                System.out.println("Minha próxima suposição é: " + novoPalpite + " anos."); // Exibe o novo palpite na tela
            } else { // Se a resposta do usuário não for "s" nem "n"
                System.out.println("Por favor, responda com 'sim' ou 'não'."); // Solicita ao usuário que responda com "sim" ou "não"
            }
        }

        scanner.close(); // Fecha o objeto Scanner para liberar os recursos do sistema
    }
}



