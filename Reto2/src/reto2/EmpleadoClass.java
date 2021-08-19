/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EmpleadoClass extends PersonaClass {

    private int salario;
    private EmpresaClass empresa;
    private CargoEmpleadoClass cargoEmpleado;
    Scanner instDatos = new Scanner(System.in);

    public EmpleadoClass(String nombre, int documento, String email, int salario, EmpresaClass empresa, CargoEmpleadoClass cargoEmpleado) {
        super(nombre, documento, email);
        this.salario = salario;
        this.empresa = empresa;
        this.cargoEmpleado = cargoEmpleado;
    }

    public EmpleadoClass() {
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public EmpresaClass getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaClass empresa) {
        this.empresa = empresa;
    }

    public CargoEmpleadoClass getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(CargoEmpleadoClass cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public ArrayList crudArrayList() {
        ArrayList<EmpleadoClass> ListaEmpleado = new ArrayList<>();
        boolean salirPrograma = false;
        while (!salirPrograma) {
            System.out.println("Seleccione una apcion:\n 1. Crear Empleado \n 2. consultar Empleado \n 3. Editar \n 4. Eliminar \n 5. Salir ");
            int opcionLista = Integer.parseInt(instDatos.nextLine());

            switch (opcionLista) {
                case 1:
                    System.out.println("Cuantos Empleados desea crear?");
                    int cantEmpleados = Integer.parseInt(instDatos.nextLine());
                    for (int i = 0; i < cantEmpleados; i++) {
                        System.out.println("Ingrese el nombre del empleado");
                        String nombre = instDatos.nextLine();
                        System.out.println("ingrese el documento del empleado");
                        int documento = Integer.parseInt(instDatos.nextLine());
                        System.out.println("ingrese el correo electronico del empleado");
                        String email = instDatos.nextLine();
                        System.out.println("ingrese el salario del empleado");
                        int salario = Integer.parseInt(instDatos.nextLine());
                        System.out.println("ingrese el nit de la empresa para la cual trabaja");
                        String nitEmpresa = instDatos.nextLine();
                        System.out.println("ingrese el nomnbre de la empresa para la cual trabaja");
                        String nombreEmpresa = instDatos.nextLine();
                        System.out.println("ingrese la direccion de la empresa para la cual trabaja");
                        String direccionEmpresa = instDatos.nextLine();
                        System.out.println("ingrese lel nombre del cargo que ocupa en la empresa para la cual trabaja");
                        String nombreCargo = instDatos.nextLine();
                        System.out.println("ingrese ingrese el nivel jerarquico que ocupa en la empresa para la cual trabaja");
                        String nivelJerarquico = instDatos.nextLine();

                        EmpresaClass instempresa = new EmpresaClass(nitEmpresa, nombreEmpresa, direccionEmpresa);
                        EmpresaClass empresa = instempresa;
                        CargoEmpleadoClass instCargEmpl = new CargoEmpleadoClass(nombreCargo, nivelJerarquico);
                        CargoEmpleadoClass cargoempleado = instCargEmpl;

                        EmpleadoClass empleado = new EmpleadoClass(nombre, documento, email, salario, empresa, cargoempleado);

                        ListaEmpleado.add(empleado);
                        System.out.println("Empleado Creado Con Exito");

                    }
                    break;

                case 2:
                    System.out.println("ingrese la opcion a realizar: \n 1. consultar todas los empleados \n 2. Consultar empleado en especifico");

                    int OpcionConsulta = Integer.parseInt(instDatos.nextLine());
                    if (OpcionConsulta == 1) {
                        for (int i = 0; i < ListaEmpleado.size(); i++) {
                            EmpleadoClass empleado = ListaEmpleado.get(i);

                            System.out.println("el nombre es: " + empleado.getNombre());
                            System.out.println("el documento es: " + empleado.getDocumento());
                            System.out.println("el email es: " + empleado.getDocumento());
                            System.out.println("el salario es: " + empleado.getSalario());
                            System.out.println("el nit de la empresa para cual labora es es: " + empleado.getEmpresa().getNit());
                            System.out.println("el nombre de la empresa para la cual labora es: " + empleado.getEmpresa().getNombre());
                            System.out.println("la direccion de la empresa para la cual labora es: " + empleado.getEmpresa().getDireccion());
                            System.out.println("el nombre del cargo del empleado es: " + empleado.getCargoEmpleado().getNombreCargo());
                            System.out.println("el nivel jerarquico  es: " + empleado.getCargoEmpleado().getNivelJerarquico());
                            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

                        }
                    } else if (OpcionConsulta == 2) {
                        System.out.println("cual de los siguientes empleados desea consultar");
                        for (int i = 0; i < ListaEmpleado.size(); i++) {
                            EmpleadoClass empleado = ListaEmpleado.get(i);
                            System.out.println(i + " " + empleado.getNombre());
                        }
                        int opcionConsulEmpl = Integer.parseInt(instDatos.nextLine());
                        if (opcionConsulEmpl >= 0 && opcionConsulEmpl <= ListaEmpleado.size()) {
                            EmpleadoClass empleado = ListaEmpleado.get(opcionConsulEmpl);
                            System.out.println("el nombre es: " + empleado.getNombre());
                            System.out.println("el documento es: " + empleado.getDocumento());
                            System.out.println("el email es: " + empleado.getDocumento());
                            System.out.println("el salario es: " + empleado.getSalario());
                            System.out.println("el nit de la empresa para cual labora es es: " + empleado.getEmpresa().getNit());
                            System.out.println("el nombre de la empresa para la cual labora es: " + empleado.getEmpresa().getNombre());
                            System.out.println("la direccion de la empresa para la cual labora es: " + empleado.getEmpresa().getDireccion());
                            System.out.println("el nombre del cargo del empleado es: " + empleado.getCargoEmpleado().getNombreCargo());
                            System.out.println("el nivel jerarquico  es: " + empleado.getCargoEmpleado().getNivelJerarquico());
                            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

                        } else {
                            System.out.println("el numero ingresado no es correcto");
                        }

                    } else {
                        System.out.println("el numero ingresado no es correcto");
                    }

                    break;
                case 3:
                    System.out.println("cual de los siguientes empleados desea editar");
                    for (int i = 0; i < ListaEmpleado.size(); i++) {
                        EmpleadoClass empleado = ListaEmpleado.get(i);
                        System.out.println(i + " " + empleado.getNombre());
                    }
                    int opcionConsulEmpl = Integer.parseInt(instDatos.nextLine());
                    if (opcionConsulEmpl >= 0 && opcionConsulEmpl <= ListaEmpleado.size()) {
                        EmpleadoClass empleado = ListaEmpleado.get(opcionConsulEmpl);
                        System.out.println("el nombre es: " + empleado.getNombre());
                        System.out.println("el documento es: " + empleado.getDocumento());
                        System.out.println("el email es: " + empleado.getDocumento());
                        System.out.println("el salario es: " + empleado.getSalario());
                        System.out.println("el nit de la empresa para cual labora es es: " + empleado.getEmpresa().getNit());
                        System.out.println("el nombre de la empresa para la cual labora es: " + empleado.getEmpresa().getNombre());
                        System.out.println("la direccion de la empresa para la cual labora es: " + empleado.getEmpresa().getDireccion());
                        System.out.println("el cargo del empleado es: " + empleado.getCargoEmpleado().getNombreCargo());
                        System.out.println("el nivel jerarquico  es: " + empleado.getCargoEmpleado().getNivelJerarquico());
                        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
                        System.out.println("Que deseas editar? \n 1. Nombre \n 2. documento \n 3. email \n 4. Salario \n 5. nit \n 6. nombre de la empresa"
                                + "\n 7. direccion de la empresa \n 8. Cargo \n 9. Nivel jerarquico");
                        int opcionEditar = Integer.parseInt(instDatos.nextLine());
                        if(opcionEditar == 1){
                            System.out.println("Ingrese el nuevo nombre");
                            String nombre = instDatos.nextLine();
                            empleado.setNombre(nombre);
                        }else if(opcionEditar == 2){
                            System.out.println("Ingrese el nuevo documento");
                            int documento = Integer.parseInt(instDatos.nextLine());
                            empleado.setDocumento(documento);
                        }else if(opcionEditar == 3){
                            System.out.println("Ingrese el nuevo email");
                            String email = instDatos.nextLine();
                            empleado.setEmail(email);
                        }else if(opcionEditar == 4){
                            System.out.println("Ingrese el nuevo salario");
                            int salario = Integer.parseInt(instDatos.nextLine());
                            empleado.setSalario(salario);
                        }else if(opcionEditar == 5){
                            System.out.println("Ingrese el nuevo nit");
                            String nit = instDatos.nextLine();
                            empleado.getEmpresa().setNit(nit);
                        }else if(opcionEditar == 6){
                            System.out.println("Ingrese el nuevo nombre de la empresa");
                            String nombreEmpresa = instDatos.nextLine();
                            empleado.getEmpresa().setNombre(nombreEmpresa);
                        }else if(opcionEditar == 7){
                            System.out.println("Ingrese la nueva direccion de la empresa");
                            String nuevaDireccion = instDatos.nextLine();
                            empleado.getEmpresa().setDireccion(nuevaDireccion);
                        }else if(opcionEditar == 8){
                            System.out.println("Ingrese el nuevo cargo");
                            String nuevoCargo = instDatos.nextLine();
                            empleado.getCargoEmpleado().setNombreCargo(nuevoCargo);
                        }else if(opcionEditar == 9){
                            System.out.println("Ingrese el nuevo nivel jerarquico");
                            String nuevoNJ = instDatos.nextLine();
                            empleado.getCargoEmpleado().setNivelJerarquico(nuevoNJ);
                        }else{
                            System.out.println("el numero ingresado es incorrecto");
                        }
                        

                    } else {
                        System.out.println("el numero ingresado no es correcto");
                    }

                    break;
                case 4:
                    System.out.println("cual de los siguientes empleados desea eliminar");
                    for (int i = 0; i < ListaEmpleado.size(); i++) {
                        EmpleadoClass empleado = ListaEmpleado.get(i);
                        System.out.println(i + " " + empleado.getNombre());
                    }
                     int opcionConsulEmple = Integer.parseInt(instDatos.nextLine());
                     if (opcionConsulEmple >= 0 && opcionConsulEmple <= ListaEmpleado.size()) {
                        EmpleadoClass empleado = ListaEmpleado.get(opcionConsulEmple);
                         System.out.println("Estas seguro que deseas eliminar a " + empleado.getNombre() + "? \n SI/NO");
                         String EliminarEmpl = instDatos.nextLine();
                         if(EliminarEmpl.toLowerCase().equals("si") || EliminarEmpl.toLowerCase().equals("sí")){
                             ListaEmpleado.remove(opcionConsulEmple);
                             System.out.println("\n Lista Actualizada\n");
                             
                             for (int i = 0; i < ListaEmpleado.size(); i++) {
                            EmpleadoClass empleadoAct = ListaEmpleado.get(i);

                            System.out.println("el nombre es: " + empleadoAct.getNombre());
                            System.out.println("el documento es: " + empleadoAct.getDocumento());
                            System.out.println("el email es: " + empleadoAct.getDocumento());
                            System.out.println("el salario es: " + empleadoAct.getSalario());
                            System.out.println("el nit de la empresa para cual labora es es: " + empleadoAct.getEmpresa().getNit());
                            System.out.println("el nombre de la empresa para la cual labora es: " + empleadoAct.getEmpresa().getNombre());
                            System.out.println("la direccion de la empresa para la cual labora es: " + empleadoAct.getEmpresa().getDireccion());
                            System.out.println("el nombre del cargo del empleado es: " + empleadoAct.getCargoEmpleado().getNombreCargo());
                            System.out.println("el nivel jerarquico  es: " + empleadoAct.getCargoEmpleado().getNivelJerarquico());
                            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                             }
                         }else{
                             System.out.println("Cancelando proceso");
                         }
                     }
                    break;
                case 5:
                      System.out.println("Hasta pronto");
                      salirPrograma = true;
                    break;
                default:
                    System.out.println("El numero ingresado es incorrecto");

            }
        }
        return ListaEmpleado;
    }
}
