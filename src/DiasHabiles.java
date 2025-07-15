/*
* Carlos trabaja en una empresa de logística que opera solo de lunes a viernes, sin actividades los fines de semana.
* Para evitar confusiones, necesita un programa que, al recibir un día de la semana, indique si es un día hábil o no.
Crea un programa que reciba un día de la semana (en minúsculas) y muestre un mensaje indicando si es un día hábil o no.
* */

public class DiasHabiles {
    String diaHabil;

    public DiasHabiles(String dia) {
        this.diaHabil = dia;
    }

    public void comprobar(){
        if (diaHabil.equals("lunes") || diaHabil.equals("martes") ||
                diaHabil.equals("miércoles") || diaHabil.equals("jueves") ||
                diaHabil.equals("viernes")){
            System.out.println(diaHabil+" es un día hábil. ");
        }
        else {
            System.out.println(diaHabil+" No es un día hábil. ");
        }
    }
}
