
package ex01;


public class Retangulo extends FiguraGeometrica {

    public Retangulo(int lado, int base) {
        super(lado, base);
        
        calcularArea();
        calcularPerimetro();

    }

}
