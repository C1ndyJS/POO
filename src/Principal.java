import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Star Wars");
        miPelicula.setFechaLanzamiento(2000);
        miPelicula.setDuracionMin(200) ;
        miPelicula.setIncluidoPlan(true);

        miPelicula.mostrarFichaTecnica();
        miPelicula.evaluacion(10);
        miPelicula.evaluacion(8);
        System.out.println("Evaluacion: "+ miPelicula.calcMedia());
        System.out.println("Evaluacion: "+ miPelicula.getTotalEvaluaciones());

//        com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula();
//        otraPelicula.nombre = "Jumanji";
//        otraPelicula.fechaLanzamiento= 2008;
//        otraPelicula.incluidoPlan= false;
//        otraPelicula.duracionMin = 136;
//        miPelicula.evaluacion(7.8);
//        otraPelicula.mostrarFichaTecnica();
    }
}
