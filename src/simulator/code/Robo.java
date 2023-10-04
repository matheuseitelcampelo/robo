package simulator.code;

/**
 * Esta classe representa um Robô com funcionalidades de movimento e orientação.
 * É uma extensão da classe abstrata RoboIdeia.
 * @author matheus
 */
public final class Robo extends RoboIdeia {

    /**
     * Contrução padrão do Robô. Inicializada os atributos com valores padrão.
     */
    public Robo() {
        super.nome = "R-ATM";
        super.peso = 50;
        super.pesoCargaMax = 20;
        super.tipoTracao = "esteira";
        super.velocidadeMax = 5;
    }
    
    /*
    * Contrutor personalizado do Robô.
    */
    public Robo(String nome, int peso, int pesoCargaMax, String tipoTracao,
            int velocidadeMax) {
        super.nome = nome;
        super.peso = peso;
        super.pesoCargaMax = pesoCargaMax;
        super.tipoTracao = tipoTracao;
        this.velocidadeMax = velocidadeMax;
    }
    
    /**
     * Move o robô ao longo do eixo X.
     * 
     * @param posX A posição X para mover o robô.
     * @param posY A posição Y para mover o robô.
     * @throws IllegalArgumentException Se os argumentos posX ou posY forem NaN ou infinitos.
     */
    @Override
    public void move(float posX, float posY) {
        if (Float.isNaN(posX) || Float.isNaN(posY)
                || Float.isInfinite(posX) || Float.isInfinite(posY)) {
            throw new IllegalArgumentException("Args não válidos");
        }
        super.posicaoX += posX;
        super.posicaoY += posY;
    }

    /**
     * Move o robô ao longo do eixo X.
     * 
     * @param dist A distância a ser percorrida ao longo do eixo X.
     * @throws IllegalArgumentException Se a distância for NaN ou Infinita.
     */
    @Override
    public void moveX(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Args não válido");
        }
        super.posicaoX += dist;
    }
    
    /**
     * Move o robô ao longo do eixo Y.
     * 
     * @param dist A distância a ser percorrida ao longo do eixo Y.
     * @throws IllegalArgumentException Se a distância for NaN ou Infinita.
     */
    @Override
    public void moveY(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Args não válido");
        }
        super.posicaoY += dist;
    }

    /**
     * Imprime a posição atual do robô no plano XY.
     */
    @Override
    public void printPos() {
        System.out.println("Posicao x: " + super.posicaoX);
        System.out.println("Posicao y: " + super.posicaoY + "\n");
    }
    
    /**
     * Define a orientação do robô com base na tecla pressionada.
     * 
     * @param tecla A tecla pressionada para definir a orientação (w, a, s, d).
     * @throws IllegalArgumentException Se a tecla não for válida.
     */
    @Override
    public void setOrientacao(char tecla) {
        switch (tecla) {
            case 'w' -> {
                super.orientacao = Orientacao.FRENTE;
                this.moveY(this.velocidadeMax);
            }
            case 's' -> {
                super.orientacao = Orientacao.TRAS;
                this.moveY(-this.velocidadeMax);
            }
            case 'a' -> {
                super.orientacao = Orientacao.ESQUERDA;
                this.moveX(this.velocidadeMax);
            }
            case 'd' -> {
                super.orientacao = Orientacao.DIREITA;
                this.moveX(-this.velocidadeMax);
            }
            default ->
                throw new IllegalArgumentException("Tecla não valida");
        }
    }

    /**
     * Executa uma sequência de movimentos agendados com base nas teclas fornecidas.
     * 
     * @param movimentos Uma sequência de teclas (w, a, s, d) para movimentos.
     */
    public void movimentosAgendados(char... movimentos) {
        for (char c : movimentos) {
            this.setOrientacao(c);
            this.printPos();
        }

        // Outros métodos de Robo podem ser adicionados aqu, se necessário.
    }

}
