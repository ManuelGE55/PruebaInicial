package gestorarchivos.manuelgonzalezencinas;
import java.util.Scanner;
public class Menu {
    
    //Registrar tareas
    //Marcar como completadas
    //Listar tareas
    //Eliminar tareas
    
    public static void main(String[]args){
        
        GestorTareas g=new GestorTareas();
        
        boolean salir=false;
        Scanner teclado=new Scanner(System.in);
        
        while(salir==false){
            System.out.println("""
                               GESTOR DE TAREAS
                               
                               1-Registrar tarea
                               2-Marcar tarea como completada
                               3-Ver tareas
                               4-Eliminar tarea
                               """);
        }
        
        switch(teclado.nextInt()){
            
            case 1->{}
            case 2->{}
            case 3->{}
            case 4->{}
            
        }
    }
}
