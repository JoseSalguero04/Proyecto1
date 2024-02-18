package Proyecto;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do{
            menu.Mostrarmenu();
            opcion = scanner.nextInt();
            menu.Opcionelegida(opcion);
        }while (opcion != 4);

        scanner.close();
    }
}
