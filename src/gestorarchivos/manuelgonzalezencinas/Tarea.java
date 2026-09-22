package gestorarchivos.manuelgonzalezencinas;
public class Tarea {
    private String nombre;
    private boolean completada;
    public Tarea(String n){
        this.nombre=n;
        this.completada=false;
    }
    public void setCompletada(boolean b){this.completada=b;}
    public String getNombre(){return nombre;}
    public boolean getCompletada(){return completada;}
}
