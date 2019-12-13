
package examenprogra;

import java.util.ArrayList;

public class Canales {
    private String nombre, categoria;
    private int suscriptores,videos;
    private ArrayList<Video> misvideos=new ArrayList<>();

    public Canales() {
    }

    public Canales(String nombre, String categoria, int suscriptores, int videos) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.suscriptores = suscriptores;
        this.videos = videos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public int getSuscriptores() {
        return suscriptores;
    }

    public void setSuscriptores(int suscriptores) {
        this.suscriptores = suscriptores;
    }

    public int getVideos() {
        return videos;
    }

    public void setVideos(int videos) {
        this.videos = videos;
    }


    @Override
    public String toString() {
        return  nombre;
    }
    
}
