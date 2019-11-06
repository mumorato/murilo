package pacote;

public class Teste{

public static void main(String[] args) {

    Ingresso show0 = new IngressoNormal(500);
    show0.ImprimeDados();    

    Ingresso show1 = new IngressoVip(500);
    show1.ImprimeDados();

    Ingresso show2 = new CamaroteInferior(500);
    show2.ImprimeDados();

    Ingresso show3 = new CamaroteSuperior(500);
    show3.ImprimeDados();
}



}