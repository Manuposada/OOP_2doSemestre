/**
 * Ejecicio Actividad 2, Programación Orientada a Objetos
 * IU Digital de Antioquia
 *
 * 11/03/2022
 * 
 * @author Sebastian Posada Moreno
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args){

        // Método constructor del scanner para recibir input del usuario
        Scanner userInput = new Scanner(System.in);

        /**
         * Persona1
         */

            // Método constructor para la persona1
            Persona persona1 = new Persona();

                // Solicitamos al usuario los datos de persona1
                System.out.println("¡Bienvenido! Para comenzar, por favor ingrese su nombre:");
                String nombre = userInput.nextLine();
                persona1.setNombre(nombre);
   
                System.out.println("Hola "+nombre+", ¿Cual es su apellido?:");
                String apellido = userInput.nextLine();
                persona1.setApellido(apellido);
   
                System.out.println("Generando registro para "+nombre+" "+apellido+", ¿es usted Mujer u Hombre?:");
                String genero = userInput.nextLine();
                persona1.setGenero(genero);
   
                System.out.println("Muchas gracias, por último, ingrese su edad en números:");
                int edad = userInput.nextInt();
                persona1.setEdad(edad);
   
                System.out.println("Registro exitoso para "+nombre+" "+apellido+", "+genero+" de "+edad+" años.");
                userInput.close();

      
    
        
    }
    
   
}
