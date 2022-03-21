/**
 * Solución Actividad de aprendizaje 2
 * Programación Orientada a Objetos 1
 * Tecnología en Desarrollo de software
 * IU Digital de Antioquia
 *
 * 21/03/2022
 * 
 * @author Manuela Posada Moreno
 */

class Persona {

    /**
     * Atributos para la clase Persona
     */
        private String nom;
        private String ape;
        private String gen;
        private float edad;
        
    /**
     * Métodos de la clase Persona
     */

        // Para editar el campo "nombre"
        public void setNom(String nomIng){
            this.nom = nomIng;
        }
        
        // Para obtener el campo "Nombre"
        public String getNom(){
            return this.nom;
        }

        // Para editar el campo "apellido"
        public void setApe(String apeIng){
            this.ape = apeIng;
        }
        
        // Para obtener el campo "Apellido"
        public String getApe(){
            return this.ape;
        }

        // Para editar el campo "genero"
        public void setGen(String genIng){
            this.gen = genIng;
        }
        
        // Para obtener el campo "Genero"
        public String getGen(){
            return this.gen;
        }

        // Para editar el campo "edad"
        public void setEdad(float edadIngresada){
            this.edad = edadIngresada;
        }

        // Para obtener el campo "Edad"
        public float getEdad(){
            return this.edad;
        }
        
}   
