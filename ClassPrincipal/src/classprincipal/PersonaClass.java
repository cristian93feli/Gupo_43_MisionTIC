
package classprincipal;


public class PersonaClass {
    private String Nombre;
    private int Documento;
    private float Estatura;
    private int Edad;
    private char Sexo;
    private boolean Si_Estudia;
    private float Peso;
    private String Direccion;

    public PersonaClass(String Nombre, int Documento, float Estatura, int Edad, char Sexo, boolean Si_Estudia, float Peso, String Direccion) {
        this.Nombre = Nombre;
        this.Documento = Documento;
        this.Estatura = Estatura;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Si_Estudia = Si_Estudia;
        this.Peso = Peso;
        this.Direccion = Direccion;
    }
    
 

    public String getNombre() {
        return Nombre;
    }

    public int getDocumento() {
        return Documento;
    }

    public float getEstatura() {
        return Estatura;
    }

    public int getEdad() {
        return Edad;
    }

    public char getSexo() {
        return Sexo;
    }

    public boolean isSi_Estudia() {
        return Si_Estudia;
    }

    public float getPeso() {
        return Peso;
    }

    public String getDireccion() {
        return Direccion;
    }
    
    public String Mostrar_Info_Persona(){
        return "Su nombre es " + getNombre() + "\n su documento de identidad es  " + getDocumento() +
                "\n su estatura es de " + getEstatura() + "\n su edad es " + getEdad()
                + "\n su sexo es " + getSexo() + "\n y actualmente estudia? " + isSi_Estudia() 
                + "\n su peso es " + getPeso() + "\n y su direccion es " + getDireccion();
    }
    

}
