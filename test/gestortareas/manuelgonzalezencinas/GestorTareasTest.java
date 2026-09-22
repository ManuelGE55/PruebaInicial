/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package gestortareas.manuelgonzalezencinas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author daw2
 */
public class GestorTareasTest {
    
    public GestorTareasTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testRegistrar(){
        GestorTareas g=new GestorTareas();
        Menu m=new Menu();
        g.crearTarea("prueba");
        assertEquals(new Tarea("prueba"),g.getTareas().get(0));
    }
    @Test
    public void testCompletar(){
        GestorTareas g=new GestorTareas();
        Menu m=new Menu();
        g.crearTarea("prueba");
        g.completarTarea("prueba");
        assertEquals(true,g.getTareas().get(0).getCompletada());
    }
    @Test
    public void testListar(){
        GestorTareas g=new GestorTareas();
        Menu m=new Menu();
        g.crearTarea("prueba");
        g.crearTarea("prueba2");
        assertEquals(
                """
                Tarea : prueba | Completada : no
                Tarea : prueba2 | Completada : no
                """,
                g.verTareas()
        );
    }
    @Test
    public void testEliminar(){
        GestorTareas g=new GestorTareas();
        Menu m=new Menu();
        g.crearTarea("prueba");
        g.eliminarTarea("prueba");
        assertEquals(null,g.getTareas().get(0));
    }
    
}
