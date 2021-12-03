/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_refuerzo;

import java.util.Scanner;

/**
 *
 * @author ronni
 */
public class Taller_Refuerzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int tipo_cliente;
        double descuento_1 = 1;
        double descuento_2 = 5;
        double descuento_3 = 10;
        double descuento_4 = 15;
        double porcentaje;
        double porcentaje_2;
        double porcentaje_3;
        double porcentaje_4;
        String computadora_1 = "Computadora 1: $1000";
        String computadora_2 = "Computadora 2: $1100 ";
        String computadora_3 = "Computadora 3: $ 900";
        String computador;
        String bandera = "Si";
        double total = 0;
        double subtotal;
        String cadena_1 = " ";
        int numero_computadoras;
        String nombre_cliente;
        int cedula;
        int precio_computadora = 0;
        double suma_pagar = 0;
        System.out.printf("Bienvenido a esta empresa tecnológica."
                + " En stock contamos con las siguientes computadoras: \n%s\n%s\n%s\n",
                computadora_1,
                computadora_2,
                computadora_3);
        while (bandera.equals("Si")) {
            System.out.println("Ingresar nombre del cliente: ");
            nombre_cliente = entrada.nextLine();
            System.out.println("Ingrese tipo de cliente(1, 2, 3 o 4): ");
            tipo_cliente = entrada.nextInt();
            System.out.println("Ingresar cédula del cliente: ");
            cedula = entrada.nextInt();
            System.out.println("¿Qué computadora desea adquirir?(1, 2 0 3): ");
            entrada.nextLine();
            computador = entrada.nextLine();
            System.out.println("Ingresar la cantidad de computadoras a comprar: ");
            numero_computadoras = entrada.nextInt();

            if (computador.equals("Computador 1")|| (computador.equals("1"))) {
                precio_computadora = 1000;
                if (tipo_cliente == 1) {
                    subtotal = (precio_computadora * descuento_1) / 100;
                    total = precio_computadora - subtotal;
                } else {
                    if (tipo_cliente == 2) {
                        subtotal = (precio_computadora * numero_computadoras);
                            porcentaje = (subtotal * descuento_2)/100;
                            total = precio_computadora - porcentaje;

                    } else {
                        if (tipo_cliente == 3) {
                            subtotal = (precio_computadora * numero_computadoras);
                            porcentaje = (subtotal * descuento_3)/100;
                            total = precio_computadora - porcentaje;

                        } else {
                            subtotal = (precio_computadora * numero_computadoras);
                            porcentaje = (subtotal * descuento_4)/100;
                            total = precio_computadora - porcentaje;
                        }
                    }
                }
            } else {
                if (computador.equals("Computador 2")|| (computador.equals("2"))) {
                    precio_computadora = 1100;
                    if (tipo_cliente == 1) {
                        subtotal = (precio_computadora * numero_computadoras);
                        porcentaje = (subtotal * descuento_1)/100;
                        total = precio_computadora - porcentaje;
                    } else {
                        if (tipo_cliente == 2) {
                            subtotal = (precio_computadora * numero_computadoras);
                            porcentaje = (subtotal * descuento_2)/100;
                            total = precio_computadora - porcentaje;

                        } else {
                            if (tipo_cliente == 3) {
                                subtotal = (precio_computadora * numero_computadoras);
                            porcentaje = (subtotal * descuento_3)/100;
                            total = precio_computadora - porcentaje;

                            } else {
                                subtotal = (precio_computadora * numero_computadoras);
                                porcentaje = (subtotal * descuento_4)/100;
                                total = precio_computadora - porcentaje;
                            }
                        }
                    }
                } else {
                    if (computador.equals("Computador 3")|| (computador.equals("3"))) {
                        precio_computadora = 900;
                        if (tipo_cliente == 1) {
                            subtotal = (precio_computadora * numero_computadoras);
                            porcentaje = (subtotal * descuento_1)/100;
                            total = precio_computadora - porcentaje;
                        } else {
                            if (tipo_cliente == descuento_2) {
                                subtotal = (precio_computadora * numero_computadoras);
                                porcentaje = (subtotal * descuento_2)/100;
                                total = precio_computadora - porcentaje;

                            } else {
                                if (tipo_cliente == 3) {
                                    subtotal = (precio_computadora * numero_computadoras);
                                    porcentaje = (subtotal * descuento_3)/100;
                                    total = precio_computadora - porcentaje;

                                } else {
                                    subtotal = (precio_computadora * numero_computadoras);
                                    porcentaje = (subtotal * descuento_4)/100;
                                    total = precio_computadora - porcentaje;
                                }
                            }
                        }
                    }
                }
            }
            cadena_1 = String.format("%s-Cliente con %s, con cédula %d,"
                    + " compra %d computadoras con precio individual $ %d."
                    + " Total a pagar $ %.2f.\n "
                    , cadena_1
                    , nombre_cliente
                    , cedula
                    , numero_computadoras
                    , precio_computadora
                    , total);
            suma_pagar = suma_pagar + total;
            System.out.println("¿Desea ingresar más datos?[Si/No]");
            entrada.nextLine();
            bandera = entrada.nextLine();  
        }
        System.out.printf("%s\nTotal venta de computadoras:%s\n"
                          , cadena_1
                          , suma_pagar);
    }
}
