/*
* Julia es profesora y necesita un programa que la ayude a determinar si un estudiante ha sido aprobado en la asignatura. La regla de la escuela es:

El estudiante es aprobado si su promedio final es mayor o igual a 7.0.
Si el promedio está entre 5.0 y 6.9, está en recuperación.
Si es inferior a 5.0, está reprobado.
Crea un programa que, a partir de una variable media, muestre la situación del estudiante según las reglas de la escuela.
* */

public class Aprobacion {
    double media;

    public Aprobacion(double prom) {
        this.media = prom;
    }

    public void promedio(){
        if (this.media >= 7.0) {
            System.out.println("El estudiante tuvo un promedio de " + media + " y fue aprobado.");
        } else if (this.media >= 5.0) {
            System.out.println("El estudiante tuvo un promedio de " + media + " y está en recuperación.");
        } else {
            System.out.println("El estudiante tuvo un promedio de " + media + " y fue reprobado.");
        }
    }

}

//Ingrese la contraseña: 123456
//¡Acceso permitido!