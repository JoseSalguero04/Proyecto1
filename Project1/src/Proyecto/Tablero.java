package Proyecto;

import java.util.Random;
import java.util.Scanner;

public class Tablero {
    /**
     * 
     */

    public static int filas = 8;
    public static int columnas = 8;
    public static int correlativo = 1;
    public static char opcionjuego;
    int posicionjugador;

    public static String[][] tablero = new String[filas][columnas];

    public static void Dibujartablero(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        

        int numpenalizaciones = random.nextInt(2, 4);

        boolean[] columnaspenalizadas = new boolean[columnas];

        for (int k = 0; k < numpenalizaciones; k++){
            int columna;
    
            do{
                columna = random.nextInt(columnas);
            }while(columnaspenalizadas[columna]);
    
            columnaspenalizadas[columna] = true;
    
            // como soluciono el error de la penalizacion
            for (int i = 0; i < filas; i++){
            tablero[i][columna] = Contenidocasilla(correlativo, true, false);
        }
        }

        for (int i = filas - 1; i >= 0; i--){
            for (int j = columnas - 1; j >= 0; j--){
                
                if (i % 2 != 0) {
                    if (tablero[i][j] == null){
                        tablero[i][j] = Contenidocasilla(correlativo, false, false);
                    } else {
                        tablero[i][j] = Contenidocasilla(correlativo, true, false);
                    }
                } else {
                    if (tablero[i][j] == null){
                        tablero[i][columnas - j - 1] = Contenidocasilla(correlativo, false, false);
                    } else {
                        tablero[i][columnas - j - 1] = Contenidocasilla(correlativo, true, false);
                    }
                    
                }
                
                correlativo++;
        }
    }

        for (int i = 0; i < filas; i++){
            System.out.println("----------------------------------------------------------------");
            for (int j = 0; j < columnas; j++){
                
                System.out.print(tablero[i][j]);
                
            }
            System.out.println();
        }

        System.out.println("presione 'd' para tirar el dado");
        System.out.println("presione 'p' para pausar el juego");
        opcionjuego = scanner.next().charAt(0);
        if (opcionjuego == 'd'){
            dado();
        }

        scanner.close();
    }

    public static String Contenidocasilla(int correlativo, boolean penalizacion, boolean posicionjugador){

        String casilla = "";
        
        if (penalizacion && posicionjugador){
            if (correlativo < 10){
                casilla += "| " + "#" + "0" + Integer.toString(correlativo) + "@" + " |";
            } else {
            casilla += "| " + "#" + Integer.toString(correlativo) + "@" + " |";
        }
        } else if (penalizacion && !posicionjugador){
            if (correlativo < 10){
                casilla += "| " + "#" + "0" + Integer.toString(correlativo) + " " + " |";
            } else {
            casilla += "| " + "#" + Integer.toString(correlativo) + " " + " |";
            }
        } else if (posicionjugador && !penalizacion){
            if (correlativo < 10){
                casilla += "| " + " " + "0" + Integer.toString(correlativo) + "@" + " |";
            } else {
            casilla += "| " + " " + Integer.toString(correlativo) + "@" + " |";
            }
        } else {
            if (correlativo < 10){
                casilla += "| " + " " + "0" + Integer.toString(correlativo) + " " + " |";
            } else {
            casilla += "| " + " " + Integer.toString(correlativo) + " " + " |";
            }
        }

        return casilla;
    }

    public static void actualizartablero(){
        
        do{
            for (int i = 0; i < filas; i++){
                System.out.println("----------------------------------------------------------------");
                for (int j = 0; j < columnas; j++){
                    
                    System.out.print(tablero[i][j]);
                    
                }
                System.out.println();
            }
            System.out.println("");
            Scanner scanner = new Scanner(System.in);
            System.out.println("presione 'd' para tirar el dado");
            System.out.println("presione 'p' para pausar el juego");
            opcionjuego = scanner.next().charAt(0);
            if (opcionjuego == 'p'){
                break;
            }
            scanner.close();
    }while(true);	
    opcionjuego = ' ';
    
    }

    public static int dado(){
        Random random = new Random(); 
        int a = random.nextInt(2, 6);
        return a;

    }

}
