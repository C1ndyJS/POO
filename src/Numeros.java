import java.util.Scanner;
/*
* Ana necesita identificar si un número es par o impar para un juego que está desarrollando.
* Para ello, quiere crear un programa que analice si el número que ha definido previamente es par o impar.
 ¿Cómo ayudarías a Ana a escribir un programa que determine si un número es par o impar y muestre el resultado correctamente?
*/
public class Numeros {
    int num;

    Numeros(int num){
        this.num = num;
    }

    public void espar(){
        if(0 == (this.num % 2)){
             System.out.println("El numero "+ this.num+ " es par");
         }else {
             System.out.println("El numero "+ this.num+ " no es par");
         }
    }

}