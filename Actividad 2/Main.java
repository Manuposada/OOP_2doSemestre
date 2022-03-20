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

      //Se ingresa la cantidad de personas a registrar
      
      System.out.println("¡Bienvenido! Para comenzar, por favor indique la cantidad de personas que desea registrar: ");
      int cantidadPersonas = userInput.nextInt();
      
      

      
       // Se estblece un array de tipo Persona
      Persona[] personaArray = new Persona[cantidadPersonas];
      Persona persona;
        
      float edad = 0;
      float totalEdades = 0;
      
      for (int i = 0; i < cantidadPersonas ; i++) {

              
              persona = new Persona();
  
   // Solicitamos al usuario los datos de persona1
              System.out.println("Por favor, ingrese su nombre:");
              String nombre = userInput.next();
              persona.setNombre(nombre);

              System.out.println("Hola "+nombre+", ¿Cual es su apellido?:");
              String apellido = userInput.next();
              persona.setApellido(apellido);

              System.out.println("Generando registro para "+nombre+" "+apellido+", ¿es usted Mujer u Hombre?:");
              String genero = userInput.next();
              persona.setGenero(genero);

              System.out.println("Muchas gracias, por último, ingrese su edad en números:");
              edad = userInput.nextFloat();
              persona.setEdad(edad); 
              

              System.out.println("Registro #"+i+" exitoso para "+nombre+" "+apellido+", "+genero+" de "+edad+" años.");
            
            
            personaArray[i] = persona;
            totalEdades += personaArray[i].getEdad();
            
            
          
      }

      
      
      
      // Se informa registro exitoso para las 5 personas y se muestra el listado en consola
      System.out.println("Se ha completado el registro. Las personas ingresadas son: ");

      for (int i = 0; i < cantidadPersonas; i++){

        System.out.println(personaArray[i].getNombre() + " " + personaArray[i].getApellido() + ", " + personaArray[i].getGenero() + " de " + personaArray[i].getEdad() + " años.");

      }

      // Imprime en consola el promedio de las edades, utilizando el metodo promedioEdades()
      System.out.println("El promedio de edades es: " + promedioEdades(totalEdades, cantidadPersonas));
      

      userInput.close();
      
    }

    




    public static double promedioEdades(float totalEdades, int cantidadPersonas){

      return totalEdades / cantidadPersonas;

    }

    
}
