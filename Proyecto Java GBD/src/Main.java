import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String tarea;
        do {

            System.out.println("Escribe 'tarea' para guardar tu primera tarea o 'fin' para salir?");
            tarea= br.readLine();

            System.out.println("Escribenos tu descripcion de la tarea:");
            String descripcion=br.readLine();
            System.out.println("Escribenos la fecha de vencimiento:");
            String fecha= br.readLine();



        }while (!tarea.equalsIgnoreCase("fin"));
    }
}