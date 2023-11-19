public abstract class ContenidoAudiovisual {
    // Atributos comunes
    protected String titulo;
    protected String genero;
    protected String creador;
    protected double duracion;

    // Constructor default
    public ContenidoAudiovisual() {
    }

    // Constructor con atributos comunes
    public ContenidoAudiovisual(String titulo, String genero, String creador, double duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }

    // Métodos get y set comunes
    // ... (Implementar getters y setters aquí)

    // Otros métodos que podrían ser comunes
}