/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa1;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Tarefa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Clientes cli1 = new Clientes("a", " a", " a", 1, 1);
        Clientes cli2 = new Clientes("b", "b", " b", 2, 2);
        Clientes cli3 = new Clientes("c", " c", "c", 3, 3);

        listaClientes.add(cli1);
        listaClientes.add(cli2);
        listaClientes.add(cli3);

        mostrarDatos();

        ingresarCliente();
        // borrarCliente();
        // buscarClienteNif();
        // modificarDeveda();
        mostrarDatos();

    }

    static ArrayList<Clientes> listaClientes = new ArrayList<Clientes>();

    static Scanner sc = new Scanner(System.in);

    public static void ingresarCliente() {

        String nif, nome, direccion;
        int telefono, debeda;
        Clientes aux;
        int N;
        boolean b = false;
        try {
            do {
                System.out.println("Numero de clientes a ingresar");
                N = sc.nextInt();

            } while (N < 0);
            sc.nextLine();

            for (int i = 0; i < N; i++) {

                do {

                    System.out.println("Datos cliente = " + i);

                    System.out.println("NIF: ");
                    nif = sc.next();

                    for (int j = 0; j < listaClientes.size(); j++) {

                        if (listaClientes.get(j).getNif().equalsIgnoreCase(nif)) {

                            System.out.println("Error NIF duplicado");

                            b = true;
                        }

                    }

                } while (b != true && N < 0);

                if (b == false) {
                    System.out.print("Nombre: ");
                    nome = sc.next();

                    System.out.print("Direccion: ");
                    direccion = sc.next();

                    System.out.print("Telefono: ");
                    telefono = sc.nextInt();

                    System.out.print("Debeda: ");
                    debeda = sc.nextInt();

                    aux = new Clientes();

                    aux.setNif(nif);
                    aux.setNome(nome);
                    aux.setDireccion(direccion);
                    aux.setTelefono(telefono);
                    aux.setDebeda(debeda);

                    listaClientes.add(aux);

                }
            }
        } catch (Exception e) {

            System.out.println("Error introducir datos");
        }
    }

    public static void mostrarDatos() {

        Iterator it = listaClientes.iterator();
        while (it.hasNext()) {

            Object ob = it.next();
            Clientes cli = (Clientes) ob;
            System.out.println(cli);

        }

    }

    public static void buscarClienteNif() {

        String nf;
        System.out.println("Introduce NIF");
        nf = sc.nextLine();
        boolean a = false;

        for (int i = 0; i < listaClientes.size(); i++) {

            if (listaClientes.get(i).getNif().equalsIgnoreCase(nf)) {
                System.out.println(listaClientes.get(i));  //se invoca el método toString de la clase Clientes  
                a = true;
            }

        }

        if (a == false) {

            System.out.println("NIF no encontrado");
        }

    }

    public static void modificarDeveda() {
        boolean aa = false;
        int debeda;
        String nf;
        System.out.println("Introduce NIF del cliente a modificar deuda");
        nf = sc.nextLine();
        Clientes a;

        for (int i = 0; i < listaClientes.size(); i++) {

            if (listaClientes.get(i).getNif().equalsIgnoreCase(nf)) {

                a = listaClientes.get(i);

                System.out.println("Deuda cliente = " + a.getDebeda());

                System.out.println("Introduce valor nueva deuda");
                debeda = sc.nextInt();
                a.setDebeda(debeda);
                aa = true;
            }

        }
        if (aa == false) {
            System.out.println("Cliente no encontrado");

        }

    }

    public static void borrarCliente() {
        boolean aa = false;
        String nf;
        System.out.println("Introduce NIF del cliente a eliminar");
        nf = sc.nextLine();

        for (int i = 0; i < listaClientes.size(); i++) {

            if (listaClientes.get(i).getNif().equalsIgnoreCase(nf)) {

                listaClientes.remove(i);
            }

        }
        if (aa == false) {
            System.out.println("Cliente no encontrado");

        }

    }

}