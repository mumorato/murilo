
public class TesteCarro {

    //psvm + TAB
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Volkswagen", "Fusca", 1978);
        
//        carro1.setModelo("Fusca");
//        carro1.setMarca("Volkswagen");
//        carro1.setAno(1978);
        carro1.andar(90);
        System.out.println("Odometro "+carro1.getModelo()+": " +
                carro1.getKmRodados());
        carro1.andar(20);
        System.out.println("Odometro: "+carro1.getModelo()+":"+
                carro1.getKmRodados());
        Carro carro2 = new Carro("Volkswagen", "Gol", 2000);
//        carro2.setModelo("Gol");
//        carro2.setMarca("Volkswagen");
//        carro2.setAno(2000);
        carro2.andar(50);
        
        System.out.println("Odometro "+carro1.getModelo()+": " +
                carro1.getKmRodados());
        System.out.println("Odometro "+carro2.getModelo()+": " +
                carro2.getKmRodados());
       
        Carro carro3 = new Carro();
    }
}
