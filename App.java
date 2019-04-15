public class App{
    public static void main(String args[]){
        Embalagem e = new Embalagem(10,20,50);
        Cilindro c = new Cilindro(10,40);
        Cone cn = new Cone(10,40);
        TroncoCone tc = new TroncoCone(20,40,10);

        System.out.println("Embalagem: "+e.getVolume());
        System.out.println("Cilindro: "+c.getVolume());
        System.out.println("Cone: "+cn.getVolume());
        System.out.println("Tronco do Cone: "+tc.getVolume());
    }
}