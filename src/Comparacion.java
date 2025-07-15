/*
* Pedro está aprendiendo Java y se encontró con un problema:
* necesita crear un programa que compare dos números enteros proporcionados
* por el usuario e indique cuál es el mayor o si son iguales. Sin embargo,
* tiene dificultades para implementar la lógica de comparación y mostrar el resultado correctamente.
* ¡Ayuda a Pedro a resolver este problema! Crea un programa que solicite al usuario dos números enteros,
* los compare y muestre un mensaje indicando cuál es el mayor o si ambos son iguales.
* */

public class Comparacion {
    int num1;
    int num2;

    public Comparacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void numMayor() {
        if (num1 > num2) {
            System.out.println("El número mayor es " + num1 + ".");
        } else if (num2 > num1) {
            System.out.println("El número mayor es " + num2 + ".");

            } else {
                System.out.println("Los números son iguales.");
            }
    }
}  