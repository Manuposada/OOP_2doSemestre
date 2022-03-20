/**
 * Ejecicio Actividad 2, Programación Orientada a Objetos
 * IU Digital de Antioquia
 *
 * 20/03/2022
 * 
 * @author Sebastian Posada Moreno
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args){

    // Método constructor del scanner para recibir input del usuario
    Scanner userInput = new Scanner(System.in);

    //Se ingresa la cantidad de personas a registrar      
    System.out.println("\n" + "¡Bienvenido! Para comenzar, por favor indique la cantidad de personas que desea registrar: ");
    int cantidadPersonas = userInput.nextInt();

    // Se establece un array de tipo Persona
    Persona[] personaArray = new Persona[cantidadPersonas];
    Persona persona;

    // se declara variable a tener en cuenta al momento de promediar edades  
    float totalEdades = 0;
    
    // Solicitamos al usuario los datos de las personas
    for (int i = 0; i < cantidadPersonas; i++){
            
      persona = new Persona();

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
      float edad = userInput.nextFloat();
      persona.setEdad(edad);       

      System.out.println("\n" + "Registro #" + i + " exitoso para " + nombre + " " + apellido + ", " + genero + " de " + edad + " años.");          
          
      // Asigna los valores de la persona establecidos anteriormente y los guarda en la posición "i" del array personaArray
      personaArray[i] = persona;

      // Suma en cada ciclo cada una de las edades ingresadas, para ser usado al momento de sacar el promedio
      totalEdades += personaArray[i].getEdad();          
        
    }   
    
    // Se informa registro exitoso para las personas ingresadas y se muestra el listado en consola
    System.out.println("\n"+"Se ha completado el registro. Las personas ingresadas son: "+"\n");
    
    for (int i = 0; i < cantidadPersonas; i++){

      System.out.println(personaArray[i].getNombre() + " " + personaArray[i].getApellido() + ", " + personaArray[i].getGenero() + " de " + personaArray[i].getEdad() + " años.");

    }

    // Imprime en consola el promedio de las edades, utilizando el metodo promedioEdades()
    System.out.println("\n" + "El promedio de edades es: " + promedioEdades(totalEdades, cantidadPersonas) + "\n");
    
    // Se cierra el input de usuario para evitar leaks de memoria
    userInput.close();
      
  }

  // método que toma la suma de las edades de todas las personas registradas, y las divide ente la cantidad de estas
  public static double promedioEdades(float totalEdades, int cantidadPersonas){

    return totalEdades / cantidadPersonas;

  }
    
}
