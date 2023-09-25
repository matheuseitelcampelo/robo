package robo;
public class Robo {
    final String nome;    
    final float peso;
    final float velocidadeMax = 5;
    final float pesoCargaMax = 20;
    final String tipoTracao = "esteira";
    int orientacao;
    static final int FRENTE = 0;
    static final int ATRAS = 1;
    static final int ESQUERDA = 2;
    static final int DIREITA = 3;
    float posicaoX;
    float posicaoY;
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