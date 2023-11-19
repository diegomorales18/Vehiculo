public class Serie {
    // Atributos
    private String titulo;
    private int noTemporadas;
    private boolean visto;
    private String genero;
    private String creador;
    private double duracion;

    // Constructor default
    public Serie() {
        this.noTemporadas = 1;
        this.visto = false;
    }

    // Constructor con titulo y creador
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.noTemporadas = 1;
        this.visto = false;
    }

    // Constructor con todos los atributos (excepto visto)
    public Serie(String titulo, int noTemporadas, String genero, String creador, double duracion) {
        this.titulo = titulo;
        this.noTemporadas = noTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
        this.visto = false;
    }

    // Métodos get y set (excepto visto)
    // ... (Implementar getters y setters aquí)

    // Sobreescribir método toString
    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", noTemporadas=" + noTemporadas +
                ", visto=" + visto +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}