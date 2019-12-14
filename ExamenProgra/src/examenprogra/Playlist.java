
package examenprogra;

import java.io.Serializable;
import java.util.ArrayList;

public class Playlist implements Serializable{
    private int duracion;
    private ArrayList<Video> videos=new ArrayList<>();
    
    private static final long SerialVersionUID=555L;

    public Playlist() {
    }

    public Playlist(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        return  " videos=" + videos ;
    }
    
}
