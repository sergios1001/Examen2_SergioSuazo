
package examenprogra;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable{
   private String nombre,correo,usuario,contraseña;
   private int edad;
   private Canales micanal;
   private ArrayList<Canales> canales=new ArrayList<>();
   private ArrayList<Playlist> playlist=new ArrayList<>();

   
   public Usuario() {
   }

    public Usuario(String nombre, String correo, String usuario, String contraseña, int edad, Canales micanal) {
        this.nombre = nombre;
        this.correo = correo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.edad = edad;
        this.micanal = micanal;
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

    public ArrayList<Playlist> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Playlist> playlist) {
        this.playlist = playlist;
    }

    public Canales getMicanal() {
        return micanal;
    }

    public void setMicanal(Canales micanal) {
        this.micanal = micanal;
    }
   
   
   
}
