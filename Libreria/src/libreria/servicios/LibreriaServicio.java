package libreria.servicios;

import java.util.Locale;
import java.util.Scanner;

public class LibreriaServicio {

    private LibroServicio libro = new LibroServicio();

    private static Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public void menu(){

        System.out.println(
                "|--------- MENU ----------|\n"
                + "1- Cargar libro.\n"
                + "2- Ver lista de libros.\n"
                + "3- Cargar editorial.\n"
                + "4- Ver lista de editoriales.\n"
                + "5- Buscar libro/s por autor.\n"
                + "6- Buscar libro por título.\n"
                + "7- Buscar libro por ISBN.\n"
                + "8- Buscar libro/s por editorial.\n"
                + "9- Ver lista de autores.\n"
                + "10- Buscar Autor por nombre.\n"
                + "11- Dar de baja un libro.\n"
                + "12- Dar de alta un libro.\n"
                + "13- Dar de baja una editorial.\n"
                + "14- Dar de alta una editorial.\n"
                + "15- Dar de baja un autor.\n"
                + "16- Dar de alta un autor.\n"
                + "17- Salir.\n"
        );
        seleccionadorRespuesta();
    }

    private int respuestaUsuario(){
        int resp = 0;
        boolean band = true;
        do{
        try {
            System.out.print("Respuesta seleccionada: ");
            resp = entrada.nextInt();            
            band = false;
        } catch (Exception e) {
            entrada.next();
            System.err.println("------> Tiene que ingresar una opción numérica.");
            System.out.println("¡¡¡ Se generó una excepción del tipo: " + e.getClass().getSimpleName() + " !!!");            
        }
        }while(band);
        return resp;
    }

    private void seleccionadorRespuesta(){
        int resp = 0;
        do {
            resp = respuestaUsuario();
            switch (resp) {
                case 1:
                    libro.crearLibro();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 12:

                    break;
                case 13:

                    break;
                case 14:

                    break;
                case 15:

                    break;
                case 16:

                    break;
                case 17:
                    System.out.println("Salió exitosamente!");
                    break;
                default:
                    System.out.println("Por favor, ingrese una opción válida.");
            }
        } while (resp < 1 || resp > 17);
    }

}
