package gestortareas.manuelgonzalezencinas;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    private List<Tarea>tareas;
    GestorTareas(){
        this.tareas=new ArrayList<>();
    }
    public String crearTarea(String nombre){
        tareas.add(new Tarea(nombre));
        return "Tarea "+nombre+" añadida";
    }
    public String completarTarea(String nombre){
        for(int i=0;i<tareas.size();i++){
            if(tareas.get(i).getNombre().equals(nombre)){
                tareas.get(i).setCompletada(true);
            }
        }
        return "Tarea "+nombre+" marcada como completada";
    }
    public String verTareas(){
        String lista="";
        for(int i=0;i<tareas.size();i++){
            lista=lista+tareas.get(i).toString();
        }
        return lista;
    }
    public String eliminarTarea(String nombre){
        for(int i=0;i<tareas.size();i++){
            if(tareas.get(i).getNombre().equals(nombre)){
                tareas.remove(i);
            }
        }
        return "Tarea "+nombre+" eliminada";
    }
    public List<Tarea> getTareas(){return tareas;}
    
}
