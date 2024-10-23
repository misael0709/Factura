package com.mycompany.factura;

public class Main {

    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("Calculo del precio del producto con valor de $100");
        System.out.println("Calculo con 20% de descuento y 16% de IVA");
        System.out.println(c.vImpFactura());
    }
}
