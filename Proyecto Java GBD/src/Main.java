import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        String arrayTareas[] = new String[1000];
        String arrayDescripcion[] = new String[1000];
        String arrayFecha[] = new String[1000];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String respuesta;
        do {
            System.out.println("Menu:");
            System.out.println("1.- Añadir tarea");
            System.out.println("2.- Actualizar tarea");
            System.out.println("3.- Actualizar feche (por titulo de la tarea)");
            System.out.println("4.- Eliminar tarea(por titulo de la tarea)");
            System.out.println("5.- Salir:");
            respuesta = br.readLine();

        } while (!respuesta.equalsIgnoreCase("fin"));

        switch (respuesta){


        }



    }



    if(fin.equalsIgnoreCase("fin"))

    {
        System.out.println("Titulo de la tarea:");
        String tarea = br.readLine();
        System.out.println("Escribenos tu descripcion de la tarea:");
        String descripcion = br.readLine();
        System.out.println("Escribenos la fecha de vencimiento:");
        String fecha = br.readLine();
    } else if(fin.equalsIgnoreCase("fin"))

    {


    }
}