public class Main {
    public static void main(String[] args) {
        // Arrays de Peliculas y Series
        Pelicula[] peliculas = new Pelicula[5];
        Serie[] series = new Serie[5];

        // Inicializar objetos en los arrays
        // Ejemplo:
        peliculas[0] = new Pelicula("Pelicula 1", "Genero 1", "Creador 1", 2020, 120);
        series[0] = new Serie("Serie 1", 3, "Genero 1", "Creador 1", 45);

        // Marcar algunos como vistos y asignar tiempo visto
        peliculas[0].marcarVisto();
        series[0].marcarVisto();

        // Mostrar una lista de los vistos y un detalle de los minutos/segundos visualizados
        System.out.println("Peliculas Vistas:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula != null && pelicula.esVisto()) {
                System.out.println(pelicula.toString() + " Tiempo visualizado: " + pelicula.tiempoVisto());
            }
        }

        System.out.println("\nSeries Vistas:");
        for (Serie serie : series) {
            if (serie != null && serie.esVisto()) {
                System.out.println(serie.toString() + " Tiempo visualizado: " + serie.tiempoVisto());
            }
        }

        // Determinar la serie con más temporadas y la película más reciente
        Serie serieConMasTemporadas = null;
        Pelicula peliculaMasReciente = null;
        for (Serie serie : series) {
            if (serieConMasTemporadas == null || (serie != null && serie.getNoTemporadas() > serieConMasTemporadas.getNoTemporadas())) {
                serieConMasTemporadas = serie;
            }
        }
        for (Pelicula pelicula : peliculas) {
            if (peliculaMasReciente == null || (pelicula != null && pelicula.getAnio() > peliculaMasReciente.getAnio())) {
                peliculaMasReciente = pelicula;
            }
        }

        // Mostrar información usando toString
        if (serieConMasTemporadas != null) {
            System.out.println("\nSerie con más temporadas:\n" + serieConMasTemporadas.toString());
        }
        if (peliculaMasReciente != null) {
            System.out.println("\nPelicula más reciente:\n" + peliculaMasReciente.toString());
        }
    }
}
