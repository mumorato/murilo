public class TesteMain {
    
    public static void main(String[] args) {
        
        Triangulo Obj1 = new Triangulo(4f,55f,"escaleno");   //instanciando c/ parametro
        
        //float vlarea = ExpressoesMatematicas.calcArea(Obj1.getVlbase(), Obj1.getVlaltura());

        System.out.println("tipo: "+Obj1.getVlnome()+", base: "+Obj1.getVlbase()+", area: "+ Obj1.getAreaRes());

//Exercicio 2:        
        Quadrado objQuadra1 = new Quadrado (24f, 17f, "quadrado");
       
        System.out.println("tipo: "+objQuadra1.getVlnome()+", base: "+objQuadra1.getVlbase()+", area: "+ objQuadra1.getAreaRes());

    }

}