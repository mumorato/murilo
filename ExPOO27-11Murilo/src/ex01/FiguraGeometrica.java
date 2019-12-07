
package ex01;


public class FiguraGeometrica {
   
    private int lado;
    private int base;
    private int perimetro;
    private int area;
    
public FiguraGeometrica(int lado, int base){
    
    this.lado = lado;
    this.base = base;
//    this.perimetro = perimetro;
//    this.area = area;
    
}
   

public void calcularArea(){

this.area = base*lado;

}
public void calcularPerimetro(){
    
this.perimetro = lado*4;

} 

public void imprimeDados(){
        System.out.println("lado: "+lado+" base: "+base+" area: "+area+" perimetro: "+perimetro);
        
    }
   public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }   
    
    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}