package reto2;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteClass extends PersonaClass {

    private String direccion;
    private int telefono;
    private EmpresaClass empresa;
    Scanner instDatos = new Scanner(System.in);

    public ClienteClass() {
    }

    public ClienteClass(String nombre, int documento, String email, String direccion, int telefono) {
        super(nombre, documento, email);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public EmpresaClass getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaClass empresa) {
        this.empresa = empresa;

    }

    public void crudArrayList() {
        ArrayList<ClienteClass> listaClientes = new ArrayList<>();

        boolean salirPrograma = false;
        while (!salirPrograma) {
            System.out.println("Seleccione una apcion:\n 1. Crear Cliente \n 2. consultar Cliente--agregar empresa \n 3. Editar \n 4. Eliminar \n 5. Salir ");
            int opcionLista = Integer.parseInt(instDatos.nextLine());

            switch (opcionLista) {
                case 1:
                    System.out.println("Cuantos clientes desea crear?");
                    int cantClientes = Integer.parseInt(instDatos.nextLine());
                    for (int i = 0; i < cantClientes; i++) {
                        System.out.println("Ingrese el nombre del cliente");
                        String nombre = instDatos.nextLine();
                        System.out.println("ingrese el documento del cliente");
                        int documento = Integer.parseInt(instDatos.nextLine());
                        System.out.println("ingrese el correo electronico del cliente");
                        String email = instDatos.nextLine();
                        System.out.println("Ingrese la direccion cliente");
                        String direccion = instDatos.nextLine();
                        System.out.println("ingrese el telefono");
                        int telefono = Integer.parseInt(instDatos.nextLine());

                        ClienteClass cliente = new ClienteClass(nombre, documento, email,direccion , telefono);

                        listaClientes.add(cliente);
                        System.out.println("Cliente Creado Con Exito");
                    }
                    break;
                case 2:
                    System.out.println("ingrese la opcion a realizar: \n 1. consultar todas los Clientes y agregar empresa \n 2. Consultar Cliente y agregar empresa");

                    int OpcionConsulta = Integer.parseInt(instDatos.nextLine());
                    if (OpcionConsulta == 1) {
                        for (int i = 0; i < listaClientes.size(); i++) {
                            ClienteClass cliente = listaClientes.get(i);

                            System.out.println("es cliente de alguna empresa? Si/No");
                            String ClienEmpr = instDatos.nextLine();
                            if (ClienEmpr.toLowerCase().equals("si") || ClienEmpr.toLowerCase().equals("sí")) {
                                System.out.println("ingrese el nombre de la empresa");
                                String nombreEmpre = instDatos.nextLine();
                                //  empresa.setNombre(nombreEmpre);
                                System.out.println("ingrese el nit de la empresa");
                                String nitEmpre = instDatos.nextLine();
                                //     empresa.setNit(nitEmpre);
                                System.out.println("ingrese la direccion de la empresa");
                                String direccionEmpre = instDatos.nextLine();
                                //  empresa.setDireccion(direccionEmpre);
                                EmpresaClass ins = new EmpresaClass(nitEmpre, nombreEmpre, direccionEmpre);
                                empresa = ins;

                                System.out.println("el nombre es: " + cliente.getNombre());
                                System.out.println("el documento es: " + cliente.getDocumento());
                                System.out.println("el email es: " + cliente.getDocumento());
                                System.out.println("la direccion es: " + cliente.getDireccion());
                                System.out.println("el telefono es: " + cliente.getTelefono());
                                System.out.println("el nombre de la empresa de la cual es cliente  es: " + empresa.getNombre());
                                System.out.println("el nit de la empresa es: " + empresa.getNit());
                                System.out.println("la direccion de la empresa es: " + empresa.getDireccion());
                                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                            } else {

                                System.out.println("el nombre es: " + cliente.getNombre());
                                System.out.println("el documento es: " + cliente.getDocumento());
                                System.out.println("el email es: " + cliente.getEmail());
                                System.out.println("la direccion es: " + cliente.getDireccion());
                                System.out.println("el telefono es: " + cliente.getTelefono());

                                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                            }
                        }
                    } else if (OpcionConsulta == 2) {
                        System.out.println("cual de los siguientes clientes desea consultar");
                        for (int i = 0; i < listaClientes.size(); i++) {
                            ClienteClass cliente = listaClientes.get(i);
                            System.out.println(i + " " + cliente.getNombre());
                        }
                        int opcionConsulEmpl = Integer.parseInt(instDatos.nextLine());
                        if (opcionConsulEmpl >= 0 && opcionConsulEmpl <= listaClientes.size()) {
                            ClienteClass cliente = listaClientes.get(opcionConsulEmpl);

                            System.out.println("es cliente de alguna empresa? Si/No");
                            String ClienEmpr = instDatos.nextLine();
                            if (ClienEmpr.toLowerCase().equals("si") || ClienEmpr.toLowerCase().equals("sí")) {
                                System.out.println("ingrese el nombre de la empresa");
                                String nombreEmpre = instDatos.nextLine();            
                                System.out.println("ingrese el nit de la empresa");
                                String nitEmpre = instDatos.nextLine();
                                System.out.println("ingrese la direccion de la empresa");
                                String direccionEmpre = instDatos.nextLine();
                                EmpresaClass instaEmpr = new EmpresaClass(nitEmpre, nombreEmpre, direccionEmpre);
                                empresa = instaEmpr;

                                System.out.println("el nombre es: " + cliente.getNombre());
                                System.out.println("el documento es: " + cliente.getDocumento());
                                System.out.println("el email es: " + cliente.getEmail());
                                System.out.println("la direccion es: " + cliente.getDireccion());
                                System.out.println("el telefono es: " + cliente.getTelefono());
                                System.out.println("el nombre de la empresa de la cual es cliente  es: " + empresa.getNombre());
                                System.out.println("el nit de la empresa es: " + empresa.getNit());
                                System.out.println("la direccion de la empresa es: " + empresa.getDireccion());
                                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                            } else {

                                System.out.println("el nombre es: " + cliente.getNombre());
                                System.out.println("el documento es: " + cliente.getDocumento());
                                System.out.println("el email es: " + cliente.getDocumento());
                                System.out.println("la direccion es: " + cliente.getDireccion());
                                System.out.println("el telefono es: " + cliente.getTelefono());
                                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                            }

                        } else {
                            System.out.println("el numero ingresado no es correcto");
                        }

                    } else {
                        System.out.println("el numero ingresado no es correcto");
                    }

                    break;
                case 3:
                    System.out.println("cual de los siguientes clientes desea editar");
                    for (int i = 0; i < listaClientes.size(); i++) {
                        ClienteClass cliente = listaClientes.get(i);
                        System.out.println(i + " " + cliente.getNombre());
                    }
                    int opcionConsulClien = Integer.parseInt(instDatos.nextLine());
                    if (opcionConsulClien >= 0 && opcionConsulClien <= listaClientes.size()) {
                        ClienteClass cliente = listaClientes.get(opcionConsulClien);
                        System.out.println("el nombre es: " + cliente.getNombre());
                        System.out.println("el documento es: " + cliente.getDocumento());
                        System.out.println("el email es: " + cliente.getDocumento());
                        System.out.println("la direccion es: " + cliente.getDireccion());
                        System.out.println("el telefono es: " + cliente.getTelefono());
                        System.out.println("Que deseas editar? \n 1. Nombre \n 2. documento \n 3. email \n 4. Direccion \n 5. Telefono");
                        int opcionEditar = Integer.parseInt(instDatos.nextLine());
                        if (opcionEditar == 1) {
                            System.out.println("Ingrese el nuevo nombre");
                            String nombre = instDatos.nextLine();
                            cliente.setNombre(nombre);
                        } else if (opcionEditar == 2) {
                            System.out.println("Ingrese el nuevo documento");
                            int documento = Integer.parseInt(instDatos.nextLine());
                            cliente.setDocumento(documento);
                        } else if (opcionEditar == 3) {
                            System.out.println("Ingrese el nuevo email");
                            String email = instDatos.nextLine();
                            cliente.setEmail(email);

                        } else if (opcionEditar == 4) {
                            System.out.println("Ingrese el nuevo emailla nueva Direccion");
                            cliente.setDireccion(direccion);

                        } else if (opcionEditar == 5) {
                            System.out.println("Ingrese el nuevo Telefono");
                            int telefono = Integer.parseInt(instDatos.nextLine());
                            cliente.setTelefono(telefono);
                        }
                    } else {
                        System.out.println("El numero ingresado es incorrecto");
                    }

                    break;

                case 4:
                    System.out.println("cual de los siguientes clientes desea eliminar");
                    for (int i = 0; i < listaClientes.size(); i++) {
                        ClienteClass cliente = listaClientes.get(i);
                        System.out.println(i + " " + cliente.getNombre());
                    }
                    int opcionConsulclien = Integer.parseInt(instDatos.nextLine());
                    if (opcionConsulclien >= 0 && opcionConsulclien <= listaClientes.size()) {
                        ClienteClass cliente = listaClientes.get(opcionConsulclien);
                        System.out.println("Estas seguro que deseas eliminar a " + cliente.getNombre() + "? \n SI/NO");
                        String EliminarClien = instDatos.nextLine();
                        if (EliminarClien.toLowerCase().equals("si") || EliminarClien.toLowerCase().equals("sí")) {
                            listaClientes.remove(opcionConsulclien);
                            System.out.println("\n Lista Actualizada\n");

                            for (int i = 0; i < listaClientes.size(); i++) {
                                ClienteClass clienteAct = listaClientes.get(i);

                                System.out.println("el nombre es: " + clienteAct.getNombre());
                                System.out.println("el documento es: " + clienteAct.getDocumento());
                                System.out.println("el email es: " + clienteAct.getDocumento());
                                System.out.println("la direccion es: " + clienteAct.getDireccion());
                                System.out.println("el telefono es: " + clienteAct.getTelefono());
                            }
                        }else{
                            System.out.println("Cancelando proceso");
                        }
                        
                    }else{
                        System.out.println("el Numero ingresado no es correcto");
                    }

                    break;

                case 5:
                    System.out.println("Hasta Pronto");
                    salirPrograma = true;
                    break;
                default:
                    System.out.println("El numero ingresado es incorrecto");

            }

        }
        

    }
    
}
