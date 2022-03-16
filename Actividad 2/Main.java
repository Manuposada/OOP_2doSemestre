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
      
       // Se estblece un array de tipo Persona
        Persona[] personaArray = new Persona[2];
        Persona persona;
        
        // Método constructor del scanner para recibir input del usuario
        Scanner userInput;

      for (int i = 0; i < 2 ; i++) {


       userInput = new Scanner(System.in);
        
          persona = new Persona();
        
         // Solicitamos al usuario los datos de persona1
          System.out.println("¡Bienvenido! Para comenzar, por favor ingrese su nombre:");
          String nombre = userInput.nextLine();
          persona.setNombre(nombre);

          System.out.println("Hola "+nombre+", ¿Cual es su apellido?:");
          String apellido = userInput.nextLine();
          persona.setApellido(apellido);

          System.out.println("Generando registro para "+nombre+" "+apellido+", ¿es usted Mujer u Hombre?:");
          String genero = userInput.nextLine();
          persona.setGenero(genero);

          System.out.println("Muchas gracias, por último, ingrese su edad en números:");
          int edad = userInput.nextInt();
          persona.setEdad(edad); 

          System.out.println("Registro #"+i+" exitoso para "+nombre+" "+apellido+", "+genero+" de "+edad+" años.");
          
          personaArray[i] = persona;
      }
      
      for (int i = 0; i < 2; i++){

        persona = personaArray[i];
                   
            int edad = persona.getEdad();

        System.out.println(edad);

      }
    }
}
