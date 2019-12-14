
package examenprogra;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;

public class Usuario implements Serializable{
   private String nombre,correo,usuario,contraseña;
   private int edad;
   private Canales micanal;
   private ArrayList<Canales> canales=new ArrayList<>();
   private ArrayList<Video> misvideos=new ArrayList<>();
   private Playlist playlist;
   private DefaultTreeModel modeloArbol;
   private DefaultTableModel videos;
   private DefaultTableModel miplaylist;
   
   private static final long SerialVersionUID=555L;

   
   public Usuario() {
   }

    public Usuario(String nombre, String correo, String usuario, String contraseña, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.edad = edad;
        this.videos=null;
        this.miplaylist=null;

    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Canales> getCanales() {
        return canales;
    }

    public void setCanales(ArrayList<Canales> canales) {
        this.canales = canales;
    }

    public Canales getMicanal() {
        return micanal;
    }

    public void setMicanal(Canales micanal) {
        this.micanal = micanal;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public ArrayList<Video> getMisvideos() {
        return misvideos;
    }

    public void setMisvideos(ArrayList<Video> misvideos) {
        this.misvideos = misvideos;
    }

    public DefaultTreeModel getModeloArbol() {
        return modeloArbol;
    }

    public void setModeloArbol(DefaultTreeModel modeloArbol) {
        this.modeloArbol = modeloArbol;
    }

    public DefaultTableModel getVideos() {
        return videos;
    }

    public void setVideos(DefaultTableModel videos) {
        this.videos = videos;
    }

    public DefaultTableModel getMiplaylist() {
        return miplaylist;
    }

    public void setMiplaylist(DefaultTableModel miplaylist) {
        this.miplaylist = miplaylist;
    }
    
    
   
}
