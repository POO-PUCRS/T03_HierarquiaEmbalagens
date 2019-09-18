public class Embalagem {
    private String codigo;
    private double precoUnitario;
    private int largura;
    private int profundidade;
    private int altura;

    public Embalagem(String cod,double pu,int largura, int profundidade, int altura) {
        this.codigo = cod;
        this.precoUnitario = pu;
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }

    public String getCodigo(){
        return codigo;
    }

    public double getPrecoUnitario(){
        return precoUnitario;
    }

    public void setPrecoUnitario(double novoPreco){
        precoUnitario = novoPreco;
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

    public String toString(){
        String str = "Cod: "+getCodigo()+", ";
        str += "Preco: "+getPrecoUnitario()+", ";
        str += "Modelo: "+this.getClass().getName()+", ";
        str += "Volume: "+getVolume();
        return str;
    }
}