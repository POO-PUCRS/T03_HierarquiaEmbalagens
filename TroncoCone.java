public class TroncoCone extends Embalagem{
    private int raioTopo;

    public TroncoCone(int ladoDaBase,int altura,int raioTopo){
        super(ladoDaBase,ladoDaBase,altura);
        this.raioTopo = raioTopo;
    }

    public int getRaioTopo(){
        return raioTopo;
    }

    @Override

    public double getVolume(){
        double raioBase = getLargura()/2.0;
        return  (1.0/3.0 * Math.PI * getAltura() * ((raioBase*raioBase)+raioBase*raioTopo*raioTopo));
    }
}