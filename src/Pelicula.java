public class Pelicula {
    String nombre;
    int fechaLanzamiento;
    int duracionMin;
    boolean incluidoPlan;
    double sumaEvaluaciones;
    int totalEvaluaciones;
    void mostrarFichaTecnica(){

        System.out.println("El nombre de la pelicula es: "+ nombre);
        System.out.println("La fecha de lanzamiento es: "+ fechaLanzamiento);
        System.out.println("Duracion (Minutos): "+ duracionMin);
    }

    void evaluacion(double nota){
        sumaEvaluaciones += nota;
        totalEvaluaciones ++;
    }

    double calcMedia(){
        return sumaEvaluaciones/totalEvaluaciones;
    }

}



