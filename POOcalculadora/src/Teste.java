
public class Teste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora ();
        
        System.out.println("Resultado soma int " +calc.somar(5,2));
        System.out.println("Resultado soma float " +calc.somar(5.4f,2.3f));
        
        System.out.println("Resultado subtracao int " + calc.subtrair(10, 3));
        System.out.println("Resultado subtracao int " + calc.subtrair(10.5f, 3.2f));
    }
  
}
