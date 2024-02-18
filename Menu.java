
import java.util.Scanner;

public class Menu {
    public static void Mostrarmenu(){
        System.out.println("                Menu ");
        System.out.println(" 1. Iniciar Juego");
        System.out.println(" 2. Retomar Juego");
        System.out.println(" 3. Mostrar información del estudiante");
        System.out.println(" 4. Salir");
    }

    public static void Opcionelegida(int opcion){
        switch (opcion) {
            case 1:
                System.out.println("Eligio la opcion 1");
                break;
            case 2:
                System.out.println("Eligio la opcion 2");
                break;
            case 3:
                System.out.println("Eligio la opcion 3");
                break;
            case 4:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Por favor, elija una opcion valida");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do{
            Mostrarmenu();
            opcion = scanner.nextInt();
            Opcionelegida(opcion);
        }while (opcion != 4);

        scanner.close();
    }
    
    
}

