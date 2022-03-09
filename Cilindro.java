package poo;
/*** @author Cindy */
public class Cilindro {
    float radio;
    float altura;
    float area;
    float vol;
    float per;
    final double pi = 3.1415926536;;

    public Cilindro(float radio, float altura) {
        this.radio = radio;
        this.altura = altura;
    }
    
    public float calcularPer(){ //2pi*r*h
        per = (this.radio * this.altura) * (float)(2 * pi);
        return per;
    } 
    
    public float calcularVol(){ //pi*r^2*h
        vol = (this.radio * this.altura) * 2 * 3;
        return vol;
    }
    
    public float calcularA(){ //2pi*r*h + 2pi*r^2
        area =  calcularPer() + ((float)(2 * pi))*(this.radio * this.radio);        
        return area;    
    }
}
