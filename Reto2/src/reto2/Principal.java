package reto2;

import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClienteClass insCliente = new ClienteClass();
        EmpleadoClass instEmpleado = new EmpleadoClass();
        Scanner InsDatos = new Scanner(System.in);

        System.out.println("Bienvenido... Que Deseas tramitar \n 1.clientes \n 2.empleados?");
        int opcion = InsDatos.nextInt();
        if (opcion == 1) {
            insCliente.crudArrayList();
        } else if (opcion == 2) {
            instEmpleado.crudArrayList();
        }else if(opcion == 3){
        EmpleadoAdministrativoClass instEmAd = new EmpleadoAdministrativoClass();
        instEmAd.crudArray();
        }
    }

}
