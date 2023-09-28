package simulator.code;
public abstract class RoboIdeia {
    
    protected String nome;
    protected float posicaoX = 50;
    protected float posicaoY = 50;
    protected int orientacao;
    final protected int FRENTE = 1;
    final protected int ATRAS = 2;
    final protected int ESQUERDA = 3;
    final protected int DIREITA = 4;
    protected float velocidadeMax;
    protected float pesoCargaMax;
    protected float peso;
    protected String tipoTracao;
    
    public abstract void move(float posX, float posY);
    public abstract void moveX(float dist);
    public abstract void moveY(float dist);
    public abstract void printPos();
}

