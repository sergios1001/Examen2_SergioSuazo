
package examenprogra;

import java.io.Serializable;
import java.util.ArrayList;

public class Canales implements Serializable{
    private String nombre, categoria;
    private int suscriptores,videos;
    private ArrayList<Video> misvideos=new ArrayList<>();
    
    private static final long SerialVersionUID=555L;

    public Canales() {
    }

    public Canales(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
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

    public ArrayList<Video> getMisvideos() {
        return misvideos;
    }

    public void setMisvideos(ArrayList<Video> misvideos) {
        this.misvideos = misvideos;
    }
    


    @Override
    public String toString() {
        return  nombre + " "+ categoria;
    }
    
}
