/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;


public class CargoEmpleadoClass {
    private String nombreCargo;
    private String nivelJerarquico;

    public CargoEmpleadoClass(String nombreCargo, String nivelJerarquico) {
        this.nombreCargo = nombreCargo;
        this.nivelJerarquico = nivelJerarquico;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public String getNivelJerarquico() {
        return nivelJerarquico;
    }

    public void setNivelJerarquico(String nivelJerarquico) {
        this.nivelJerarquico = nivelJerarquico;
    }
    
    
}
