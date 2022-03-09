package poo;
/**** @author cindy*/

public class Triangulo {
    
    float lado1;
    float lado2;
    float lado3;
    float base;
    float altura;
    float area;
    float per;
    
    public Triangulo(float lado1, float lado2, float lado3, float base, float altura){
        this.lado1 = lado1;
        this.lado2= lado2;
        this.lado3= lado3;
        this.base = base;
        this.altura = altura;
    }
    
    public float calcularArea(){
        area = this.altura * this.base;        
        System.out.print(" area : " + area);
        return area;
    }
    
    public float calcularPerimetro(){
        per = this.lado1 + this.lado2 + this.lado3;
        System.out.print("Per : " + per); 
        return per;
    }
}
