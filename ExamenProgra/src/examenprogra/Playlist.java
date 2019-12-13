
package examenprogra;

import java.util.ArrayList;

public class Playlist {
    private int duracion;
    private ArrayList<Video> videos=new ArrayList<>();

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
