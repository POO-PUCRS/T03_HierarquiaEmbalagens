import java.util.ArrayList;

public class App {
    public static void atualizaExibeEmbalagem(Embalagem e){
        if (e instanceof Embalagem){
            System.out.println(e.getClass().getName()+" e instancia de Embalagem");
        }
        if (e instanceof Cone){
            System.out.println(e.getClass().getName()+" e instancia de Cone");
        }
        double pr = e.getPrecoUnitario();
        pr = pr * 1.1;
        e.setPrecoUnitario(pr);
        System.out.println("Tipo da embalagem: "+e.getClass().getName());
        System.out.println("Preco: "+e.getPrecoUnitario());
        System.out.println("Volume: "+e.getVolume());
        if (e instanceof TroncoCone){
            TroncoCone tc = (TroncoCone)e;
            System.out.println("Raio do tronco: "+tc.getRaioTopo());
        }
        System.out.println("");
    }

    public static void main(String args[]){
        Embalagem e = new Embalagem("E12",10.0,10,20,50);
        Cilindro c = new Cilindro("CCA12",5.0,10,40);
        Cone cn = new Cone("C12",25.0,10,40);
        TroncoCone tc = new TroncoCone("T12",20.0,20,40,10);

        ArrayList<Embalagem> lst = new ArrayList<>();
        lst.add(e);
        lst.add(c);
        lst.add(cn);
        lst.add(tc);
        lst.add(new Cone("XX1212",4.5,10,30));
        
        for(Embalagem emb:lst){
            System.out.println(emb.getCodigo()+":"+emb.getVolume());
        }

        /*
        atualizaExibeEmbalagem(c);
        atualizaExibeEmbalagem(tc);
        atualizaExibeEmbalagem(e);
        atualizaExibeEmbalagem(cn);
        atualizaExibeEmbalagem(new TroncoCone("T1232",20.0,20,40,10));
        */
    }
}