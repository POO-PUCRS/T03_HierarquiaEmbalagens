public class TroncoCone extends Embalagem{
    private int raioTopo;

    public TroncoCone(String cod,double pu,int ladoDaBase,int altura,int raioTopo){
        super(cod,pu,ladoDaBase,ladoDaBase,altura);
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