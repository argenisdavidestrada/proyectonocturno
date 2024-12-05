import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Tarea[] tareas = new Tarea[10];


        String opcion;
        do {
            System.out.println("1.-Añadir tarea\n" + "2.-Visualizar tareas\n" + "3.-Actualizar tarea\n" + "4.-Eliminar tarea\n" + "5.-Salir");
            opcion = br.readLine();
            switch (opcion) {
                case "1":
                    try {
                        System.out.println("Escribenos tu titulo de la tarea:");
                        String titulo = br.readLine();
                        System.out.println("Escribenos tu descripcion de la tarea:");
                        String descripcion = br.readLine();
                        System.out.println("Escribenos la fecha de vencimiento:");
                        String fecha = br.readLine();


                        System.out.println("Que tarea es?(Ejemplo:1,2,3...)");
                        int tareaSelecionada = Integer.parseInt(br.readLine())-1;
                        if (tareaSelecionada < 0 || tareaSelecionada >= 100) {
                            System.out.println("No existe esa tarea");
                        } else if (tareas[tareaSelecionada] != null) {
                            System.out.println("Error, la sala ya tiene una tarea asignada.");
                        } else {
                            tareas[tareaSelecionada] = new Tarea(titulo, descripcion, fecha);
                        }
                    } catch (IOException e) {
                        System.out.println("Tipos de datos erroneos.");
                    }
                    break;
                case "2":
                    try {
                        StringBuilder visualizar= new StringBuilder();
                        System.out.println("Tareas:");
                        for (int i=0;i<tareas.length;i++){
                            String tareasInfo;
                            if (tareas[i] !=null){
                                tareasInfo=tareas[i].getTitulo();
                            }else {
                                tareasInfo="Vacia";
                            }
                            visualizar.append(String.format("| %-15d | %-16s |\n", (i + 1), tareasInfo));
                        }
                        System.out.println(visualizar.toString());
                    } catch (Exception e) {
                        System.out.println("Tipos de datos erroneos.");
                    }
                    break;
                case "3":
                    try {
                        System.out.println("¿Qué tarea quieres actualizar? (Escribe el número de la tarea)");
                        int tareaActualizar = Integer.parseInt(br.readLine()) - 1; // RESTO PORQUE EMPIEZA EN 0


                        if (tareaActualizar < 0 || tareaActualizar >= 10) {
                            System.out.println("No existe esa tarea.");
                        } else if (tareas[tareaActualizar] == null) {
                            System.out.println("La tarea seleccionada está vacía. No se puede actualizar.");
                        } else {
                            Tarea tarea = tareas[tareaActualizar];


                            System.out.println("Introduce el nuevo título de la tarea (Escribe \"mantener\" para no cambiar: " + tarea.getTitulo() + "):");
                            String nuevoTitulo = br.readLine();
                            if (!nuevoTitulo.equalsIgnoreCase("mantener")) {
                                tarea = new Tarea(nuevoTitulo, tarea.getDescripcion(), tarea.getFecha());
                            }


                            System.out.println("Introduce la nueva descripción de la tarea (Escribe \"mantener\" para no cambiar: " + tarea.getDescripcion() + "):");
                            String nuevaDescripcion = br.readLine();
                            if (!nuevaDescripcion.equalsIgnoreCase("mantener")) {
                                tarea = new Tarea(tarea.getTitulo(), nuevaDescripcion, tarea.getFecha());
                            }


                            System.out.println("Introduce la nueva fecha de vencimiento de la tarea (Escribe \"mantener\" para no cambiar: " + tarea.getFecha() + "):");
                            String nuevaFecha = br.readLine();
                            if (!nuevaFecha.equalsIgnoreCase("mantener")) {
                                tarea = new Tarea(tarea.getTitulo(), tarea.getDescripcion(), nuevaFecha);
                            }


                            tareas[tareaActualizar] = tarea;
                            System.out.println("Tarea actualizada con éxito.");
                        }
                    } catch (IOException | NumberFormatException e) {
                        System.out.println("Error al actualizar la tarea. Verifica los datos ingresados.");
                    }
                    break;
                case "4":
                    try {
                        System.out.println("Que tarea quieres borrar?(escribeme el numero de la tarea)");
                        int salaBorrar = Integer.parseInt(br.readLine()) - 1;//RESTO PORQUE EMPIEZA EN 0
                        if (salaBorrar < 0 || salaBorrar >= 10) {
                            System.out.println("No existe esa tarea.");
                        } else if (tareas[salaBorrar] == null) {
                            System.out.println("Error, la tarea ya esta vacia.");
                        } else {
                            tareas[salaBorrar] = null;//borra info de la sala selecionada
                            System.out.println("Tarea borrada con exito de la tarea " + (salaBorrar) + " .");
                        }
                    } catch (NumberFormatException a) {
                        System.out.println("Error de tipo de dato.");
                    }
                    break;
                case "5":
                    System.out.println("Saliste con exito.");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (!opcion.equalsIgnoreCase("5"));
    }
}
