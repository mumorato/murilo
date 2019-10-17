
public class Triangulo {

    float base;
    float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float calcularArea() {
        return base * altura / 2;
    }

    public float calcularPerimetro() {
        return base * 3;
    }

}
