public class Cilindro extends Embalagem{
    public Cilindro(String cod,double pu,int ladoDaBase,int altura){
        super(cod,pu,ladoDaBase,ladoDaBase,altura);
    }

    @Override
    public double getVolume(){
        double raio = getLargura()/2.0;
        double base = Math.PI * raio * raio;
        return  base * getAltura();
    }
}