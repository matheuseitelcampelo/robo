package simulator.code;
public class Robo {
    private final String nome;    
    private final float peso;
    private final float velocidadeMax = 5;
    private final float pesoCargaMax = 20;
    private final String tipoTracao = "esteira";
    private int orientacao;
    static final int FRENTE = 0;
    static final int ATRAS = 1;
    static final int ESQUERDA = 2;
    static final int DIREITA = 3;
    float posicaoX;
    float posicaoY;
    public float getPosicaoX(){
        return posicaoX;
    }
    public float getPosicaoY(){
        return posicaoY;
    }
    public int getOrientacao(){
        return orientacao;
    }
    public Robo(){
        this.nome = "R-ATM";
        this.peso = 70;
        this.posicaoX = 50;
        this.posicaoY = 50;
    }
    public Robo(String nome, float peso){
        this.nome = nome;
        this.peso = peso;
        this.posicaoX = 50;
        this.posicaoY = 50;
    }
    public Robo(String nome, float peso, float posX, float posY){
        this.nome = nome;
        this.peso = peso;
        this.posicaoX = posX;
        this.posicaoY = posY;
    }
    @Override
    public String toString(){
        return "Robo{" + "posicaoX = " + posicaoX + ", posicaoY = "
                + posicaoY + ". orientacao = " + orientacao + '}';
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Robo){
            Robo robo = (Robo)obj;
            return this.nome.equals(robo.nome);
        }else{
            return false;
        }
    }
    public void move(float posY){
        this.posicaoY = posY;
    }
    public void move(float posX, float posY){
        this.posicaoX = posX;
        this.posicaoY = posY;
    }
    public void setOrientacao(char tecla){
        if(tecla == 'w'){
            this.orientacao = FRENTE;
        }else if (tecla == 's'){
            this.orientacao = ATRAS;
        }else if(tecla == 'a'){
            this.orientacao = ESQUERDA;
        }else if(tecla == 'd'){
            this.orientacao = DIREITA;
        }
    }
        public void printPos(){
            System.out.println("posicao x = " + this.posicaoX);
            System.out.println("posicao y = " + this.posicaoY);
            System.out.println("-----------------");
        }
}