/*
* Emerson trabaja en un banco y necesita verificar si un número digitado por el cliente está dentro del
* rango permitido de valores para un préstamo, que va de 1000 a 5000 dólares.
Crea un programa que reciba un valor y muestre si está dentro del intervalo permitido o no.
* */

public class Intervalo {
    int valorPrestamo;
    public Intervalo(int valorPrestamo) {
        this.valorPrestamo = valorPrestamo;
    }

    public void confirmarRango(){
        if(this.valorPrestamo >= 1000 && this.valorPrestamo <= 5000 ){
            System.out.println("El valor "+ this.valorPrestamo + " está dentro del intervalo permitido para el préstamo.\n");
        }else{
            System.out.println("El valor "+ this.valorPrestamo + " no está dentro del intervalo permitido para el préstamo.\n");
        }
    }

}

/*
* import java.util.Scanner;

public class Intervalo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del préstamo: ");
        int valor = scanner.nextInt();

        if (valor >= 1000 && valor <= 5000) {
            System.out.println("El valor " + valor + " está dentro del intervalo permitido para el préstamo.");
        } else {
            System.out.println("El valor " + valor + " no está dentro del intervalo permitido para el préstamo.");
        }

        scanner.close();
    }
}
* */
