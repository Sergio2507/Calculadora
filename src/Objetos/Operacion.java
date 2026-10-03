package Objetos;
import java.util.Scanner;
import Clases.MenuClase;

public class Operacion {
    private MenuClase menu;

    public Operacion(){
    menu=new MenuClase();
    }

    public void Ejecutar(){
    Scanner scanner=new Scanner(System.in);
    String opcion=null;
        menu.MostrarMenu();
    }
}
