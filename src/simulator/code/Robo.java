package simulator.code;

/**
 * Esta classe representa um Rob� com funcionalidades de movimento e orienta��o.
 * � uma extens�o da classe abstrata RoboIdeia.
 * @author matheus
 */
public final class Robo extends RoboIdeia {

    /**
     * Contru��o padr�o do Rob�. Inicializada os atributos com valores padr�o.
     */
    public Robo() {
        super.nome = "R-ATM";
        super.peso = 50;
        super.pesoCargaMax = 20;
        super.tipoTracao = "esteira";
        super.velocidadeMax = 5;
    }
    
    /*
    * Contrutor personalizado do Rob�.
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
     * Move o rob� ao longo do eixo X.
     * 
     * @param posX A posi��o X para mover o rob�.
     * @param posY A posi��o Y para mover o rob�.
     * @throws IllegalArgumentException Se os argumentos posX ou posY forem NaN ou infinitos.
     */
    @Override
    public void move(float posX, float posY) {
        if (Float.isNaN(posX) || Float.isNaN(posY)
                || Float.isInfinite(posX) || Float.isInfinite(posY)) {
            throw new IllegalArgumentException("Args n�o v�lidos");
        }
        super.posicaoX += posX;
        super.posicaoY += posY;
    }

    /**
     * Move o rob� ao longo do eixo X.
     * 
     * @param dist A dist�ncia a ser percorrida ao longo do eixo X.
     * @throws IllegalArgumentException Se a dist�ncia for NaN ou Infinita.
     */
    @Override
    public void moveX(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Args n�o v�lido");
        }
        super.posicaoX += dist;
    }
    
    /**
     * Move o rob� ao longo do eixo Y.
     * 
     * @param dist A dist�ncia a ser percorrida ao longo do eixo Y.
     * @throws IllegalArgumentException Se a dist�ncia for NaN ou Infinita.
     */
    @Override
    public void moveY(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Args n�o v�lido");
        }
        super.posicaoY += dist;
    }

    /**
     * Imprime a posi��o atual do rob� no plano XY.
     */
    @Override
    public void printPos() {
        System.out.println("Posicao x: " + super.posicaoX);
        System.out.println("Posicao y: " + super.posicaoY + "\n");
    }
    
    /**
     * Define a orienta��o do rob� com base na tecla pressionada.
     * 
     * @param tecla A tecla pressionada para definir a orienta��o (w, a, s, d).
     * @throws IllegalArgumentException Se a tecla n�o for v�lida.
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
                throw new IllegalArgumentException("Tecla n�o valida");
        }
    }

    /**
     * Executa uma sequ�ncia de movimentos agendados com base nas teclas fornecidas.
     * 
     * @param movimentos Uma sequ�ncia de teclas (w, a, s, d) para movimentos.
     */
    public void movimentosAgendados(char... movimentos) {
        for (char c : movimentos) {
            this.setOrientacao(c);
            this.printPos();
        }

        // Outros m�todos de Robo podem ser adicionados aqu, se necess�rio.
    }

}
