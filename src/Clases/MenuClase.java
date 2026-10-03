package Clases;

import java.util.Scanner;

public class MenuClase {
    private Scanner scanner;
    public MenuClase(){scanner=new Scanner(System.in);}
    public void MostrarMenu(){
        System.out.println("Menu");
        System.out.println("1. Clases.Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("6. Raíz cuadrada");
        System.out.println("7. Historial");

    }
}
