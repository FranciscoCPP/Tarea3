public class Tarea3 {

    /*
    Para practicar la encapsulación:
       -Crear clase Persona.
       -Crear variables las privadas edad, nombre y telefono de la clase Persona.
       -Crear gets y sets de cada propiedad.
       -Crear un objeto persona en el main.
       -Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
     */


    public static void main(String[] args){

        Persona p1 = new Persona();

        p1.setEdad(45);
        p1.setNombre("Francisco");
        p1.setTelefono("+569 889900113");

        System.out.println("Edad=" + p1.getEdad());
        System.out.println("Nombre=" + p1.getNombre());
        System.out.printf("Telefono=" + p1.getTelefono());

        
    }


}
