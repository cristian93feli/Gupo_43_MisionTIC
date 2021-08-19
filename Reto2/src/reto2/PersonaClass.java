
package reto2;

/**
 *
 * @author Usuario
 */
public class PersonaClass {
    String nombre;
    int documento;
    private String email;

    public PersonaClass() {
    }
    
    

    public PersonaClass(String nombre, int documento, String email) {
        this.nombre = nombre;
        this.documento = documento;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
