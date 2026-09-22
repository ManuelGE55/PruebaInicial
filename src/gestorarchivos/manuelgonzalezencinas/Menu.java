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
                               5-Salir
                               """);
            switch(teclado.nextInt()){
                case 1->{System.out.println(g.crearTarea(pedirNombre(teclado)));}
                case 2->{System.out.println(g.completarTarea(pedirNombre(teclado)));}
                case 3->{System.out.println(g.verTareas());}
                case 4->{System.out.println(g.eliminarTarea(pedirNombre(teclado)));}
                case 5->{salir=true;}
            }
        }
        
        
    }
    public static String pedirNombre(Scanner teclado){
        System.out.println("introduzca el nombre de la tarea");
        return teclado.nextLine();
    }
}
