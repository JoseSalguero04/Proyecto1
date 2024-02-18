package Proyecto;
import java.util.Scanner;
public class Dado {
    
    public static char opciondado(char a){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("presione 'd' para tirar el dado");
        System.out.println("presione 'p' para pausar el juego");
        a = scanner.next().charAt(0);
        return a;
    }

}
