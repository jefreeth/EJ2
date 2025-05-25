import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaPersonas {
    private static class persona {
        private String nombre;
        private String apellido;
        private String genero;
        private int edad;

        public persona(String nombre, String apellido, String genero, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.genero = genero;
            this.edad = edad;
        }
        @Override
        public String toString(){
            return "nombre: " + nombre + "/" +
                    " apellido: " + apellido + "/" +
                    " genero: " + genero + "/" +
                    " edad: " + edad;
        }
    }
    public static ArrayList<persona> listaDePersonas () {
        Scanner scanner = new Scanner(System.in);
        ArrayList<persona> listaDatos = new ArrayList<>();
        int contadorPersonas = 0;
        int numeroPersonas = 5;

        while (contadorPersonas < numeroPersonas) {
            System.out.println("ingrese los datos de la persona #" + (contadorPersonas + 1) + ":");

            System.out.println("ingrese el nombre:");
            String nombre = scanner.nextLine();

            System.out.println("ingrese el apellido:");
            String apellido = scanner.nextLine();

            System.out.println("ingrese el genero:");
            String genero = scanner.nextLine();

            System.out.println("ingrese la edad:");
            int edad = scanner.nextInt();
            scanner.nextLine();

            persona nuevaPersona = new persona(nombre, apellido, genero, edad);
        }
        scanner.close();
        return listaDatos;
    }
    public static void MonstrarGeneroNombre(ArrayList<persona> listaDatos) {
        System.out.println("nombre y genero de las personas: ");
        for (persona persona : listaDatos){
            System.out.println("nombre: " + persona.nombre + ", genero: " + persona.genero);
        }
    }

    public static double CalcularProedio(ArrayList<persona> listaDatos){
        int suma = 0;
        for (persona persona : listaDatos);
        suma += persona.edad;
    }
    return (double) suma / personas.size()
}