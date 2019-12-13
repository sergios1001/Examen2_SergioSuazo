
package examenprogra;

public class Video {
    private String nombre,comentarios,subtitulos;
    private int likes,dislikes,duracion;

    public Video() {
    }

    public Video(String nombre, String comentarios, String subtitulos, int likes, int dislikes, int duracion) {
        this.nombre = nombre;
        this.comentarios = comentarios;
        this.subtitulos = subtitulos;
        this.likes = likes;
        this.dislikes = dislikes;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Video{" + "nombre=" + nombre + '}';
    }
    
    
}
