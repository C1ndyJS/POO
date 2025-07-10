package utp.programacion4.ejercicios;

import java.util.Scanner;

/**
 * ** @author cindy
 */
public class Student {

    String name;
    int id;
    float nota1;
    float nota2;
    float nota3;
    float prom;
    
    Scanner rd = new Scanner(System.in);

    Student(String name, int id, float nota1, float nota2, float nota3) {
        this.name = name;
        this.id = id;
        this.nota1 = nota1;
        this.nota2 = nota1;
        this.nota3 = nota1;
    }

    public float Promedio() {
        prom = (this.nota1 + this.nota2 + this.nota3)/3;
        return prom;
    }
}
