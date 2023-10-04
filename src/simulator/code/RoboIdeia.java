package simulator.code;


public abstract class RoboIdeia {
    
    /**
     * Classe abstrata que serve como modelo para rob�s.
     * Esta classe define propriedades e m�todos que os rob�s devem implementar.
     */

    /**
     * Nome do rob�.
     */
    protected String nome;
    
    /**
     * Posi��o inicial do rob� no eixo X.
     */
    protected float posicaoX = 50;
    
    /**
     * Posi��o inicial do rob� no eixo Y.
     */
    protected float posicaoY = 50;
    
    /**
     * Velocidade m�xima do rob�.
     */
    protected float velocidadeMax;
    
    /**
     * Peso m�ximo que o rob� pode carregar.
     */
    protected float pesoCargaMax;
    
    /**
     * Peso do rob�.
     */
    protected float peso;
    
    /**
     * Tipo de tra�ao do rob�.
     */
    protected String tipoTracao;

    /**
     * Enumera��o que representa a orienta��o do rob�.
     */
    protected Orientacao orientacao;
    
    /**
     * Enumera��o para representar a orienta��o do rob�.
     */
    public enum Orientacao {
        FRENTE, TRAS, ESQUERDA, DIREITA;
    }
    
    /**
     * Move o rob� para uma posi��o espec�fica.
     * 
     * @param posX A coordernada X para onde o rob� deve ser movido.
     * @param posY A coordernada Y para onde o rob� deve ser movido.
     */
    public abstract void move(float posX, float posY);
    
    /**
     * Move o rob� ao longo do eixo X.
     * 
     * @param dist A dist�ncia pela qual o rob� deve ser movido ao longo do eixo X.
     */
    public abstract void moveX(float dist);
    
    /**
     * Move o rob� ao longo do eixo Y.
     * 
     * @param dist A dist�ncia pela qual o rob� deve ser movido ao longo do eixo Y.
     */
    public abstract void moveY(float dist);
    
    /**
     * Define a orienta��o do rob� com base em uma tecla.
     * 
     * @param tecla A tecla que representa a nova orienta��o do rob� ('w', 's', 'a' ou 'd').
     */
    public abstract void setOrientacao(char tecla);
    
    /**
     * Imprime a posi��o atual do rob�.
     */
    public abstract void printPos();    
}

