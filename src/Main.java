public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setEdad(25);
        System.out.println("Edad: "+persona1.getEdad());

        persona1.setNombre("Wexujk");
        System.out.println("Nombre: "+persona1.getNombre());

        persona1.setTelefono("5584796402");
        System.out.println("Telefono: "+persona1.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad=edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }
}