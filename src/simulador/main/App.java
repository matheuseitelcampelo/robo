package simulador.main;

import java.util.Scanner;
import simulator.code.Robo;

/**
 * Esta classe contém a aplicação principal que permite interagir com um robô e executar
 * diferentes comandos de movimento.
 * 
 * @author matheus
 */
public class App {
    
    /**
     * O método principal da aplicação.
     * 
     * @param args Os argumentos da linha de comando passados para a aplicação.
     */
    public static void main(String[] args) {

        // Verifica se nenhum argumento foi fornecido na linha de comando
        if (args.length == 0) {
            // Inicializa um objeto com configurações padrão
            Robo robo = new Robo();
            String tecla = "";
            Scanner scan = new Scanner(System.in);
            boolean ok = false;

            // Loop principal para receber entrada do usuário
            do {
                try {
                    // Lê a próxima tecla digitada pelo usuário
                    tecla = scan.next();

                    // Configura a orientação do Robo com base na tecla digitada
                    robo.setOrientacao(tecla.charAt(0));

                    // Imprime a posição atual do Robo
                    robo.printPos();
                } catch (IllegalArgumentException ex) {
                    if (tecla.charAt(0) == '0') {
                        // Se '0' for digitado, termina o loop
                        ok = true;
                    } else {
                        // Se uma tecla inválida for digitada, exibe uma mensagem de erro
                        System.out.println("Valor errado");
                        scan.nextLine();
                    }
                }
            } while (!ok);

            // Exibe uma mensagem de saída quando o programa termina
            System.out.println("Exit");
        } else {
            // Converte o primeiro argumento para letras minúsculas
            args[0] = args[0].toLowerCase();

            // Verifica o valor do primeiro argumento
            switch (args[0]) {
                case "--author" ->
                    // Exibe o autor
                    System.out.println("Autor: Matheus");
                case "--version" ->
                    // Exibe a versão
                    System.out.println("Versão referente a U3S2 do livro");
                case "--help" -> {
                    // Exibe informação de ajuda
                    System.out.println("Exec. Movimentos Agendados:");
                    System.out.println("\t--move w a w w s d d a");
                }
                case "--commands" -> {
                    // Exibe comandos suportados
                    System.out.println("Comandos suportados:");
                    System.out.println("\tw: move para cima");
                    System.out.println("\ta: move para esquerda");
                    System.out.println("\ts: move para tras");
                    System.out.println("\td: move para direita");
                    System.out.println("\t0: sair da aplicação");
                }
                case "--move" -> {
                    Scanner scanner = new Scanner(System.in);

                    // Solicita ao usuário que digite a sequência de movimentos
                    System.out.println("Digite a sequência de movimentos:");
                    String stringDeComandos = scanner.nextLine();
                    char[] listaDeComandos = new char[stringDeComandos.length()];

                    // Loop para validar e armazenar os comandos de movimento
                    for (int i = 0; i < stringDeComandos.length(); i++) {
                        char c = stringDeComandos.charAt(i);
                        if (c == 'w' || c == 'a' || c == 's' || c == 'd') {
                            listaDeComandos[i] = stringDeComandos.charAt(i);
                        } else {
                            // Se um comando inválido for encontrado, exibe uma mensagem de erro
                            System.out.println("argumento invalido");
                            break;
                        }
                    }

                    // Inicializa um objeto Robo
                    Robo robo = new Robo();

                    // Executa movimentos agendados com base nos comandos válidos
                    robo.movimentosAgendados(listaDeComandos);
                }
                default -> {
                    // Se um arguento inválido for fornecido, exibe uma mensagem de erro
                    System.out.println("Argumento invalido.");
                    break;
                }
            }
        }
    }
}
