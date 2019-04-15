public class Cilindro extends Embalagem{
    public Cilindro(int ladoDaBase,int altura){
        super(ladoDaBase,ladoDaBase,altura);
    }

    @Override
    public double getVolume(){
        double raio = getLargura()/2.0;
        double base = Math.PI * raio * raio;
        return  base * getAltura();
    }
}