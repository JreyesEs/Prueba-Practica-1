/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_practica1_javier_reyes;
import java.util.Scanner;
/**
 *
 * @author Javier Reyes
 */
public class Prueba_practica1_Javier_Reyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mprincipal;
        int contmprincipal = 0; 

        /*El programa presenta un menú principal en el cual permite al usuario seleccionar entre tres opciones dadas: 
        la primera es repetir un nombre, la segunda es acceder a un menú secundario, y la tercera es salir del programa, 
        contando cuantas veces se ingresó al menú principal con un mensaje de despedida
        */
        
        do {
            System.out.println("Bienvenido a mi primera prueba práctica en Java, las opciones son las siguientes:");
            System.out.println("1. Repetir mi nombre.");
            System.out.println("2. SubMenu de mensajes.");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            mprincipal = entrada.nextInt();
            contmprincipal++; 
            
            /*
            Se usa el bucle de do while para mantener al usuario dentro del menú principal al igual que se usa de nuevo con el menú secundario.
            */

            switch (mprincipal) {
                case 1:
                    System.out.println("Escogio Repetir mi nombre");
                    System.out.print("Ingrese la cantidad de veces que se repetirá el texto: ");
                    int veces = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Ingrese su nombre: ");
                    String nombre = entrada.nextLine();
                    for (int i = 0; i < veces; i++) {
                        System.out.println("¡Hola mi nombre es " + nombre + " y miren mi prueba!");
                    }
                    System.out.println("");
                    break;
                    
                case 2:
                    
                    /*
                    Se usa el switch case en el menú principal y el secundario para que sea mas ordenado el programa con sus opciones.
                    */
                    
                    
                    System.out.println("");
                    int opsubmenu;
                    System.out.println("Escogio Submenu de mensajes");
                    
                    do {
                        System.out.println("Sub menú de mensajes:");
                        System.out.println("1. Bienvenida");
                        System.out.println("2. Despedida");
                        System.out.println("3. Salir del submenú");
                        System.out.print("Seleccione una opción: ");
                        opsubmenu = entrada.nextInt();

                        switch (opsubmenu) {
                            case 1:
                                System.out.println("Bienvenido a este programa. ¡Espero que lo disfrutes!");
                                break;
                            case 2:
                                System.out.println("Hasta luego, gracias por usar mi programa");
                                break;
                            case 3:
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("La opción seleccionada no es válida. Seleccione una opción válida, por favor.");
                        }
                        System.out.println("");
                    } while (opsubmenu != 3);
                    break;
                    
                case 3:
                    System.out.println("Adiós, esta fue mi prueba.");
                    break;
                default:
                    System.out.println("La opción seleccionada no es válida. Seleccione una opción válida, por favor.");
            }
            
        } while (mprincipal != 3);
        System.out.println("Se repitió el menú principal " + contmprincipal + " veces.");
        
        // TODO code application logic here
    }
    
}
