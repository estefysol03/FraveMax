package fravemax.Entidades;

/**
 *
 * @author Adan
 */
public class Cliente {

    private int idClinte;
    private String apellido;
    private String nombre;
    private String domicilio;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String apellido, String nombre, String domicilio, String telefono) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Cliente(int idClinte, String apellido, String nombre, String domicilio, String telefono) {
        this.idClinte = idClinte;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getIdClinte() {
        return idClinte;
    }

    public void setIdClinte(int idClinte) {
        this.idClinte = idClinte;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "[Apellido: " + apellido + ", Nombre: " + nombre + ", Domicilio: " + domicilio + ", Telefono: " + telefono + "]\n";
    }
    
    

}
