package simulator.code;
public final class Robo extends RoboIdeia{
    
    public Robo() {
        this.setNome("R-ATM");
        this.setPeso(50);
        this.setPesoCargaMax(20);
        this.setPosicaoX(50);
        this.setPosicaoY(50);
        this.setTipoTracao("esteira");
        this.setVelocidadeMax(5);
    }
    
    public Robo(String nome, int peso, int pesoCargaMax, String tipoTracao,
                int velocidadeMax) {
        this.setNome(nome);
        this.setPeso(peso);
        this.setPesoCargaMax(pesoCargaMax);
        this.setTipoTracao(tipoTracao);
        this.setVelocidadeMax(velocidadeMax);
        this.setPosicaoX(50);
        this.setPosicaoY(50);
    }
    
    public String getNome() {
    return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(float posicaoX) {
        this.posicaoX = posicaoX;
    }

    public float getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(float posicaoY) {
        this.posicaoY = posicaoY;
    }

    public int getOrientacao() {
        return orientacao;
    }

    public void setOrientacao(int orientacao) {
        this.orientacao = orientacao;
    }

    public float getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(float velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public float getPesoCargaMax() {
        return pesoCargaMax;
    }

    public void setPesoCargaMax(float pesoCargaMax) {
        this.pesoCargaMax = pesoCargaMax;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTipoTracao() {
        return tipoTracao;
    }

    public void setTipoTracao(String tipoTracao) {
        this.tipoTracao = tipoTracao;
    }
    
    @Override
    public void move(float posX, float posY) {
        if(Float.isNaN(posX) || Float.isNaN(posY) ||
        Float.isInfinite(posX) || Float.isInfinite(posY)) {
            throw new IllegalArgumentException ("Args não válidos");
        }
        this.setPosicaoX(this.getPosicaoX() + posX);
        this.setPosicaoY(this.getPosicaoY() + posY);
    }
    
    @Override
    
    public void moveX(float dist) {
        if(Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Args não válido");
        }
        this.setPosicaoY(this.getPosicaoX() + dist);
    }

    @Override
    public void moveY(float dist) {
        if(Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Args não válido");
        }
        this.setPosicaoY(this.getPosicaoY() + dist);
    }

    public void setOrientacao(char tecla) {
        if(tecla == 'w') {
            this.setOrientacao(super.FRENTE);
            moveY(this.getVelocidadeMax());
        }else if(tecla == 's') {
            this.setOrientacao(super.ATRAS);
            moveY(-this.getVelocidadeMax());
        }else if(tecla == 'a') {
            this.setOrientacao(super.ESQUERDA);
            moveX(-this.getVelocidadeMax());
        }else if(tecla == 'd') {
            this.setOrientacao(super.DIREITA);
            moveX(this.getVelocidadeMax());
        }
    }
}