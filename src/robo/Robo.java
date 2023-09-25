package robo;
public class Robo {
    final String nome;    
    final float peso;
    final float velocidadeMax = 5;
    final float pesoCargaMax = 20;
    final String tipoTracao = "esteira";
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
    public void printStatus(){
        System.out.println("-----------Info R-ATM----------");
        System.out.println("Nome do Rob�: " + nome);
        System.out.println("Peso do Rob�: " + peso);
        System.out.println("Velocidade Max: " + velocidadeMax);
        System.out.println("Carga Max: " + pesoCargaMax);
        System.out.println("Tipo de Tra��o: " + tipoTracao);
        System.out.println("Posi��o X do Rob�: " + posicaoX);
        System.out.println("Posi��o Y do Rob�: " + posicaoY);
        System.out.println("-------------------------------");
    }
    public static void main(String[] args) {
        
    }
}
