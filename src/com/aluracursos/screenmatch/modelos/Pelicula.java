package com.aluracursos.screenmatch.modelos;

public class Pelicula {
    private String nombre;
    private int fechaLanzamiento;
    private int duracionMin;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;
    private boolean incluidoPlan;

    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }
    public void mostrarFichaTecnica(){
        System.out.println("El nombre de la pelicula es: "+ nombre);
        System.out.println("La fecha de lanzamiento es: "+ fechaLanzamiento);
        System.out.println("Duracion (Minutos): "+ duracionMin);
        System.out.println("Evaluacion Media" + calcMedia());
        System.out.println("Incluy?:  "+ incluidoPlan);
    }

    public void evaluacion(double nota){
        sumaEvaluaciones += nota;
        totalEvaluaciones ++;
    }

    public double calcMedia(){
        if (totalEvaluaciones == 0){
            return 0;
        }
        return sumaEvaluaciones/totalEvaluaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setIncluidoPlan(boolean incluidoPlan) {
        this.incluidoPlan = incluidoPlan;
    }
}



