public class Embalagem {
    private int largura;
    private int profundidade;
    private int altura;

    public Embalagem(int largura, int profundidade, int altura) {
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public int getProfundidade() {
        return profundidade;
    }
    
    public double getVolume(){
        return largura*altura*profundidade;
    }
}