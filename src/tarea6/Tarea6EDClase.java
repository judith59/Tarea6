/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6;

public class Tarea6EDClase {
    private static final int PRODUCTO_PARA_DESCUENTO = 3;
    private static final double DESCUENTO_FIJO = 5.0;
    private static final double SIN_DESCUENTO = 0.95;
    private static final double DESCUENTO_CANTIDAD = 0.8;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        
        if (numProductos > PRODUCTO_PARA_DESCUENTO) {
            precioProducto -= DESCUENTO_FIJO;
        }
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_CANTIDAD;
        } else {
            total = precioProducto * SIN_DESCUENTO ;
        }
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
        
    }
}
