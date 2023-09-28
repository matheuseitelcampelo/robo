package simulator.code;
public final class Robo extends RoboIdeia{
    
    public Robo() {
        super.nome = ("R-ATM");
        super.peso = (50);
        super.pesoCargaMax = 20;
        super.tipoTracao = "esteira";
        super.velocidadeMax = 5;
    }
    
    public Robo(String nome, int peso, int pesoCargaMax, String tipoTracao,
                int velocidadeMax) {
        super.nome = (nome);
        super.peso = (peso);
        super.pesoCargaMax = pesoCargaMax;
        super.tipoTracao = "´tipoTracao";
        this.velocidadeMax = velocidadeMax;
    }
    
    @Override
    public void move(float posX, float posY) {
        if(Float.isNaN(posX) || Float.isNaN(posY) ||
        Float.isInfinite(posX) || Float.isInfinite(posY)) {
            throw new IllegalArgumentException ("Args não válidos");
        }
        super.posicaoX += posX;
        super.posicaoY += posY;
    }
    
    @Override
    public void moveX(float dist) {
        if(Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Args não válido");
        }
        super.posicaoX += dist;
    }

    @Override
    public void moveY(float dist) {
        if(Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Args não válido");
        }
        super.posicaoY += dist;
    }
    
    @Override
    public void printPos() {
        System.out.println("Posicao x: " + super.posicaoX);
        System.out.println("Posicao y: " + super.posicaoY);
    }

    public void setOrientacao(char tecla) {
        if(tecla == 'w') {
            super.orientacao = super.FRENTE;
            moveY(super.velocidadeMax);
        }else if(tecla == 's') {
            super.orientacao = super.ATRAS;
            moveY(- super.velocidadeMax);
        }else if(tecla == 'a') {
            super.orientacao = super.ESQUERDA;
            moveX(- super.velocidadeMax);
        }else if(tecla == 'd') {
            super.orientacao = super.DIREITA;
            moveX(super.velocidadeMax);
        }
    }
}