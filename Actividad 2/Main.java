/**
 * Solucion Actividad de aprendizaje 2
 * Programación Orientada a Objetos 1
 * Tecnología en Desarrollo de Software
 * IU Digital de Antioquia
 *
 * 21/03/2022
 * 
 * @author Manuela Posada Moreno
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args){

    // Método constructor para recibir lo que escribió el usuario
    Scanner datos=new Scanner(System.in);

    //Cantidad de personas a registrar      
    System.out.println("\n" + "¡Hola! Por favor indique el número de personas que va a registrar: ");
    int numPer=datos.nextInt();

    // Creamos un array de tipo Persona
    Persona[] pArray=new Persona[numPer];
    Persona persona;

    // Delaramos variable para  
    float totalE = 0;
    
    // Pedimoa los datos de las personas
    for (int i=0; i < numPer; i++){
            
      persona = new Persona();

      System.out.println("\n" + "Por favor, diganos su nombre:");
      String nom=datos.next();
      persona.setNom(nom);

      System.out.println("Bienvenido "+nom+", ¿Cual es su apellido?:");
      String ape=datos.next();
      persona.setApe(ape);

      System.out.println("Estamos creando el registro para "+nom+" "+ape+", ¿usted es Hombre / Mujer?:");
      String gen=datos.next();
      persona . setGen(gen);

      System.out.println("Muchas gracias "+nom+", para terminar, por favor escriba su edad en números:");
      float edad=datos.nextFloat();
      persona.setEdad(edad);      

      System.out.println("\n" + "El registro #"+i+" para "+nom+" "+ape+", "+gen+" de "+edad+" años, fue creado exitosamente.");
      System.out.println("\n" + "Nuevo registro");          
          
      // Se asignan los valores de la persona anterior y los guarda en la posición "i" del array pArray
      pArray[i] = persona;

      // Suma en cada ciclo las edades ingresadas para sacar el promedio
      totalE += pArray[i].getEdad();          
        
    }   
    
    // Se informa registro exitoso y se muestra el listado
    System.out.println("\n"+"Registro completado. Las personas registradas son: "+"\n");
    
    for (int i = 0; i < numPer; i++){

      System.out.println(pArray[i].getNom() + " " + pArray[i].getApe() + ", " + pArray[i].getGen() + " de " + pArray[i].getEdad() + " años.");

    }

    // Imprime el promedio de las edades, utilizando el metodo prEdad()
    System.out.println("\n" + "El promedio de edades es: " + prEda(totalE, numPer) + "\n");

    // Se llama al método para imprimir la cantidad de Hombres y Mujeres
    printCantHYM(numPer, pArray);

    // Se cierra el input de usuario
    datos.close();

  }


  // Toma la suma de las edades y las divide ente la cantidad de personas
  public static double prEda(float totalE, int numPer){

    return totalE / numPer;

  }

  // Método para retornar la cantidad de Hombres y Mujeres

  public static void printCantHYM(int numPer, Persona[] pArray){

    int cantH = 0;
    int cantM = 0;
    int generoNoDefinido = 0;
    String H = "Hombre";
    String M = "Mujer";

    for (int i = 0; i < numPer; i++){

      String gen = pArray[i].getGen();
      if (gen.equals(H)){

        cantH += 1; 

      }

      else if (gen.equals(M)){

        cantM += 1;

      }

      else {

        generoNoDefinido += 1;

      }
    }

    System.out.println("La cantidad de Hombres y Mujeres es:");
    System.out.println("Hombres: " + cantH);
    System.out.println("Mujeres: " + cantM);
    System.out.println("Género no definido: " + generoNoDefinido + "\n");
  } 
}
