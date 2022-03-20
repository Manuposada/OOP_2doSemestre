/**
 * Ejecicio Actividad 2, Programación Orientada a Objetos
 * IU Digital de Antioquia
 *
 * 20/03/2022
 * 
 * @author Sebastian Posada Moreno
 */

class Persona {

    /**
     * Atributos que definen a la clase Persona
     */
        private String nombre;
        private String apellido;
        private String genero;
        private float edad;


    /**
     * Métodos de la clase
     */

        // Para editar el campo "nombre"
        public void setNombre(String nombreIngresado){
            this.nombre = nombreIngresado;
        }
        
        // Para obtener el campo "Nombre"
        public String getNombre(){
            return this.nombre;
        }

        // Para editar el campo "apellido"
        public void setApellido(String apellidoIngresado){
            this.apellido = apellidoIngresado;
        }
        
        // Para obtener el campo "apellido"
        public String getApellido(){
            return this.apellido;
        }

        // Para editar el campo "genero"
        public void setGenero(String generoIngresado){
            this.genero = generoIngresado;
        }
        
        // Para obtener el campo "genero"
        public String getGenero(){
            return this.genero;
        }

        // Para editar el campo "edad"
        public void setEdad(float edadIngresada){
            this.edad = edadIngresada;
        }

        // Para obtener el campo "edad"
        public float getEdad(){
            return this.edad;
        }

        
}   
