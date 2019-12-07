
package ex01;


public class Quadrado extends FiguraGeometrica{

    public Quadrado(int lado, int base) {
        super(lado, base);
        
        calcularArea();
        calcularPerimetro();

    }

}
