/*María trabaja en un banco de sangre y necesita verificar si un donante es compatible para donar sangre.
Para ser compatible, el donante debe cumplir con los siguientes criterios:
Tener entre 18 y 65 años.
Pesar más de 50 kg.
Ella desea un programa que reciba la edad y el peso del donante e indique si es compatible para donar sangre.
Si no lo es, el programa debe indicar qué criterio no fue cumplido.
¿Cómo crearías un programa que reciba la edad y el peso del donante y muestre un mensaje indicando
si es compatible o no, además de informar qué criterio no fue cumplido, si es el caso?
* */


public class Donante {
    int edad;
    double peso;

    public Donante(int edad, double peso) {
        this.edad = edad;
        this.peso = peso;
    }

    boolean edadValida = edad >= 18 && edad <= 65;
    boolean pesoValido = peso > 50;

    public void donanteCompatible(){
        if (edadValida && pesoValido) {
            System.out.println("El donante es compatible para donar sangre.");
        } else {
            System.out.println("El donante no es compatible. Motivo:");
            if (!edadValida) {
                System.out.println("- Debe tener entre 18 y 65 años.");
            }
            if (!pesoValido) {
                System.out.println("- Debe pesar más de 50 kg.");
            }
        }
    }
}
