package simulador.main;

import java.util.Scanner;
import simulator.code.Robo;

/**
 * Esta classe cont�m a aplica��o principal que permite interagir com um rob� e executar
 * diferentes comandos de movimento.
 * 
 * @author matheus
 */
public class App {
    
    /**
     * O m�todo principal da aplica��o.
     * 
     * @param args Os argumentos da linha de comando passados para a aplica��o.
     */
    public static void main(String[] args) {

        // Verifica se nenhum argumento foi fornecido na linha de comando
        if (args.length == 0) {
            // Inicializa um objeto com configura��es padr�o
            Robo robo = new Robo();
            String tecla = "";
            Scanner scan = new Scanner(System.in);
            boolean ok = false;

            // Loop principal para receber entrada do usu�rio
            do {
                try {
                    // L� a pr�xima tecla digitada pelo usu�rio
                    tecla = scan.next();

                    // Configura a orienta��o do Robo com base na tecla digitada
                    robo.setOrientacao(tecla.charAt(0));

                    // Imprime a posi��o atual do Robo
                    robo.printPos();
                } catch (IllegalArgumentException ex) {
                    if (tecla.charAt(0) == '0') {
                        // Se '0' for digitado, termina o loop
                        ok = true;
                    } else {
                        // Se uma tecla inv�lida for digitada, exibe uma mensagem de erro
                        System.out.println("Valor errado");
                        scan.nextLine();
                    }
                }
            } while (!ok);

            // Exibe uma mensagem de sa�da quando o programa termina
            System.out.println("Exit");
        } else {
            // Converte o primeiro argumento para letras min�sculas
            args[0] = args[0].toLowerCase();

            // Verifica o valor do primeiro argumento
            switch (args[0]) {
                case "--author" ->
                    // Exibe o autor
                    System.out.println("Autor: Matheus");
                case "--version" ->
                    // Exibe a vers�o
                    System.out.println("Vers�o referente a U3S2 do livro");
                case "--help" -> {
                    // Exibe informa��o de ajuda
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
                    System.out.println("\t0: sair da aplica��o");
                }
                case "--move" -> {
                    Scanner scanner = new Scanner(System.in);

                    // Solicita ao usu�rio que digite a sequ�ncia de movimentos
                    System.out.println("Digite a sequ�ncia de movimentos:");
                    String stringDeComandos = scanner.nextLine();
                    char[] listaDeComandos = new char[stringDeComandos.length()];

                    // Loop para validar e armazenar os comandos de movimento
                    for (int i = 0; i < stringDeComandos.length(); i++) {
                        char c = stringDeComandos.charAt(i);
                        if (c == 'w' || c == 'a' || c == 's' || c == 'd') {
                            listaDeComandos[i] = stringDeComandos.charAt(i);
                        } else {
                            // Se um comando inv�lido for encontrado, exibe uma mensagem de erro
                            System.out.println("argumento invalido");
                            break;
                        }
                    }

                    // Inicializa um objeto Robo
                    Robo robo = new Robo();

                    // Executa movimentos agendados com base nos comandos v�lidos
                    robo.movimentosAgendados(listaDeComandos);
                }
                default -> {
                    // Se um arguento inv�lido for fornecido, exibe uma mensagem de erro
                    System.out.println("Argumento invalido.");
                    break;
                }
            }
        }
    }
}
