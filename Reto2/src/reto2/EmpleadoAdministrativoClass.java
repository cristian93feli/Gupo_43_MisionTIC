package reto2;

import java.util.ArrayList;

public class EmpleadoAdministrativoClass extends EmpleadoClass {

    private String categoria;
    private int numEmplSub;

    public EmpleadoAdministrativoClass() {
    }

    public EmpleadoAdministrativoClass(String nombre, int documento, String email, int salario, EmpresaClass empresa, CargoEmpleadoClass cargoEmpleado) {
        super(nombre, documento, email, salario, empresa, cargoEmpleado);
    }


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumEmplSub() {
        return numEmplSub;
    }

    public void setNumEmplSub(int numEmplSub) {
        this.numEmplSub = numEmplSub;
    }

    public void crudArray() {
        ArrayList<EmpleadoClass> empleadoadmin = new ArrayList<>();
        ArrayList list = crudArrayList();

        for (int i = 0; i < list.size(); i++) {
            EmpleadoClass empleado = (EmpleadoClass) list.get(i);
            
            System.out.println(empleado.getNombre());
        }
    }
}
