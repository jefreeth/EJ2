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

        public String getNombre(){
            return nombre;
        }

        public String getApellido(){
            return apellido;
        }

        public String getGenero(){
            return genero;
        }

        public int gerEdad(){
            return edad;
        }

        @Override
        public String toString() {
            return "nombre: " + nombre + "/" +
                    " apellido: " + apellido + "/" +
                    " genero: " + genero + "/" +
                    " edad: " + edad;
        }
    }

    public static ArrayList<persona> listaDePersonas() {
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
            listaDatos.add(nuevaPersona);
            contadorPersonas++;
        }
        scanner.close();
        return listaDatos;
    }

    public static void MostrarGeneroNombre(ArrayList<persona> listaDatos) {
        System.out.println("nombre y genero de las personas: ");
        for (persona persona : listaDatos) {
            System.out.println("nombre: " + persona.nombre + ", genero: " + persona.genero);
        }
    }

    public static double CalcularPromedio(ArrayList<persona> listaDatos) {
        int suma = 0;
        for (persona persona : listaDatos) {
            suma += persona.edad;
        }
        return (double) suma / listaDatos.size();
    }

    public static int ContarGenero(ArrayList<persona> listaDatos, String GeneroBuscado) {
        int contador = 0;
        for (persona perosna : listaDatos) {
            if (GeneroBuscado.equalsIgnoreCase(GeneroBuscado)) {
                contador++;
            }

        }
        return contador;
    }

    public static void main(String[] args) {
        ArrayList<persona> listaDatos = listaDePersonas();

        System.out.println(" Datos completos ");
        for (persona persona : listaDatos) {
            System.out.println(persona.toString());
        }
        MostrarGeneroNombre(listaDatos);

        System.out.println(" promedio de edad: " + CalcularPromedio(listaDatos));
        int contadorMasculino = ContarGenero(listaDatos, "masculino");
        int contadorFemenino = ContarGenero(listaDatos, "femenino");

        System.out.println(" cantidad de personas masculinas: " + contadorMasculino);
        System.out.println(" cantidad de personas femeninas: " + contadorFemenino);

    }
}
