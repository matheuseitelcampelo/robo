package simulator.code;


public abstract class RoboIdeia {
    
    /**
     * Classe abstrata que serve como modelo para robôs.
     * Esta classe define propriedades e métodos que os robôs devem implementar.
     */

    /**
     * Nome do robô.
     */
    protected String nome;
    
    /**
     * Posição inicial do robô no eixo X.
     */
    protected float posicaoX = 50;
    
    /**
     * Posição inicial do robô no eixo Y.
     */
    protected float posicaoY = 50;
    
    /**
     * Velocidade máxima do robô.
     */
    protected float velocidadeMax;
    
    /**
     * Peso máximo que o robô pode carregar.
     */
    protected float pesoCargaMax;
    
    /**
     * Peso do robô.
     */
    protected float peso;
    
    /**
     * Tipo de traçao do robô.
     */
    protected String tipoTracao;

    /**
     * Enumeração que representa a orientação do robô.
     */
    protected Orientacao orientacao;
    
    /**
     * Enumeração para representar a orientação do robô.
     */
    public enum Orientacao {
        FRENTE, TRAS, ESQUERDA, DIREITA;
    }
    
    /**
     * Move o robô para uma posição específica.
     * 
     * @param posX A coordernada X para onde o robô deve ser movido.
     * @param posY A coordernada Y para onde o robô deve ser movido.
     */
    public abstract void move(float posX, float posY);
    
    /**
     * Move o robô ao longo do eixo X.
     * 
     * @param dist A distância pela qual o robô deve ser movido ao longo do eixo X.
     */
    public abstract void moveX(float dist);
    
    /**
     * Move o robô ao longo do eixo Y.
     * 
     * @param dist A distância pela qual o robô deve ser movido ao longo do eixo Y.
     */
    public abstract void moveY(float dist);
    
    /**
     * Define a orientação do robô com base em uma tecla.
     * 
     * @param tecla A tecla que representa a nova orientação do robô ('w', 's', 'a' ou 'd').
     */
    public abstract void setOrientacao(char tecla);
    
    /**
     * Imprime a posição atual do robô.
     */
    public abstract void printPos();    
}

