package Proyecto;


public class Menu {

    public void Mostrarmenu(){
        System.out.println("                Menu ");
        System.out.println(" 1. Iniciar Juego");
        System.out.println(" 2. Retomar Juego");
        System.out.println(" 3. Mostrar información del estudiante");
        System.out.println(" 4. Salir");
        System.out.print(" Ingrese una opción: ");
    }

    public void Opcionelegida(int opcion){
        switch (opcion) {
            case 1:
                System.out.println("Eligio Iniciar Juego");
                System.out.println(" ");
                Tablero.Dibujartablero();
                break;
            case 2:
                System.out.println("Eligio la opcion 2");
                System.out.println(" ");
                Tablero.actualizartablero();
                break;
            case 3:
                System.out.println("José Fernando Salguero García");
                System.out.println("202300708");
                System.out.println("         ");
                break;
            case 4:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Por favor, elija una opcion valida");
        }
    }

    public void main(String[] args) {
        
    }
    
    
}

