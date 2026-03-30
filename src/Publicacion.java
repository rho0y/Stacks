public class Publicacion {
    private String titulo;
    private String mensaje;


    public Publicacion(String titulo, String mensaje) {
        this.titulo = titulo;
        this.mensaje = mensaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + ",Mensaje:" + mensaje + "\n";
    }
}
