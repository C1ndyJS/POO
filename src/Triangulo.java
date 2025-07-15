/*
* Marcos está estudiando geometría y necesita verificar si tres lados pueden formar un triángulo.
* Para que tres lados formen un triángulo, la suma de dos lados debe ser mayor que el tercer lado.
* Él quiere un programa que reciba tres lados y muestre un mensaje indicando si los lados pueden formar un triángulo o no.
Con base en este escenario, crea un programa que reciba tres lados y muestre un mensaje indicando si los lados pueden formar un triángulo o no.
* */
public class Triangulo {
    int lado1;
    int lado2;
    int lado3;
    public Triangulo(int lado1, int lado2, int lado3 ) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void formarTriangulo(){
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Los lados pueden formar un triángulo.");
        } else {
            System.out.println("Los lados no pueden formar un triángulo.");
        }
    }
}
