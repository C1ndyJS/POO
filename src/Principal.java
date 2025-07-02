public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Star Wars";
        miPelicula.fechaLanzamiento= 2000;
        miPelicula.duracionMin = 120;
        miPelicula.incluidoPlan= true;
        miPelicula.mostrarFichaTecnica();
        miPelicula.evaluacion(10);
        miPelicula.evaluacion(8);
        System.out.println("Evaluacion: "+ miPelicula.calcMedia());

//        Pelicula otraPelicula = new Pelicula();
//        otraPelicula.nombre = "Jumanji";
//        otraPelicula.fechaLanzamiento= 2008;
//        otraPelicula.incluidoPlan= false;
//        otraPelicula.duracionMin = 136;
//        miPelicula.evaluacion(7.8);
//        otraPelicula.mostrarFichaTecnica();
    }
}
